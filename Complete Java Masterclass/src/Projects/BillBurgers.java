package Projects;

import java.util.ArrayList;


class Extras {
	// State variables / fields
	String name;
	double price;

	public Extras(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
}

class Toppings extends Extras {
	// Inheritance
	public Toppings(String name, double price) {
		super(name, price);
	}
}

class Chips extends Extras {

	public Chips(String name, double price) {
		super(name, price);
	}
}

class Drinks extends Extras {

	public Drinks(String name, double price) {
		super(name, price);
	}
}

class BreadRoll {
	private String type;

	public BreadRoll(String type) {
		super();
		this.type = type;
	}

	public String getType() {
		return type;
	}
}

class HamBurgers {
	protected BreadRoll rollType; // Composition
	private Toppings topping;
	protected String name;
	private String meat;
	protected int numToppings; // Encapsulation - Data hiding
	protected double price;
	protected double totalPrice;
	public ArrayList<Extras> extras = new ArrayList<Extras>(); // Java
																// Collections

	public String getName() {
		return name;
	}

	public HamBurgers() {
	}

	// Polymorphism - Overloading
	public HamBurgers(String name, BreadRoll rollType, String meat, double price) {
		super();
		this.rollType = rollType;
		this.meat = meat;
		this.price = price;
		this.name = name;
		totalPrice += price; // add to total price
	}

	public boolean addToppings(Toppings topping) {
		// Max topping allowed on base is 4
		if (getNumToppings() < 4) {
			numToppings++;
			totalPrice += topping.getPrice();
			extras.add(topping);
			return true;
		} else {
			System.out.println("Cannot add more than 4 toppings to base");
			return false;
		}
	}

	public void addDrinks(Drinks drink) {
		// Free drinks with Deluxe type burgers
		if (getClass().getSimpleName().equals("DeluxeBurgers"))
			drink.price = 0;
		extras.add(drink);
		totalPrice += drink.price;
	}

	// Free drinks with deluxe burgers only
	public void addChips(Chips chips) {
		if (getClass().getSimpleName().equals("DeluxeBurgers"))
			chips.price = 0;
		extras.add(chips);
		totalPrice += chips.price;
	}

	public BreadRoll getRollType() {
		return rollType;
	}

	// Accessors - getters
	public Toppings getTopping() {
		return topping;
	}

	public String getMeat() {
		return meat;
	}

	public int getNumToppings() {
		return numToppings;
	}

	public double myTotal() {
		System.out.println("");
		System.out.println("Burger Type : " + getClass().getSimpleName());
		System.out.println("Store Name: " + getName());
		System.out.println("Bread Type: " + rollType.getType());
		System.out.println("Base price: " + price);

		//Conditional statements
		if (!getClass().getSimpleName().equals("DeluxeBurgers")) { //Comparison operators
			System.out.println("No of Toppings: " + getNumToppings());
		} else {
			System.out.println("Chips AND Coke added for free");
			;
		}

		String extrasReader = ""; // Local variable
		//Loops
		for (Extras objecto : extras) {
			extrasReader += objecto.name + ", ";
		}
		extrasReader = extrasReader.substring(0, extrasReader.length() - 2); // removes
																				// whitespace
																				// &
																				// rids
																				// last
																				// comma
		System.out.println("Extras: " + extrasReader);
		System.out.println("Burger price: " + getTotalPrice());
		return totalPrice;
	}

	public double getTotalPrice() {
		return totalPrice;
	}
}

class DeluxeBurgers extends HamBurgers {

	public DeluxeBurgers(String name, BreadRoll rollType, String meat,
			double price) {
		super(name, rollType, meat, price);
		this.name = name;
	}

	public DeluxeBurgers() {
		super();
	}

	// Polymorphism - Overriding
	public boolean addToppings(Toppings topping) {
		return false;
	}
}

class HealthyBurger extends HamBurgers {

	public HealthyBurger(String name, BreadRoll rollType, String meat,
			double price) {
		super(name, rollType, meat, price);
	}
}

public class BillBurgers {

	public static void main(String[] args) {
		Toppings lettuce = new Toppings("Lettuce", 3);
		Toppings carrots = new Toppings("Carrots", 2);
		Toppings tomatoes = new Toppings("Tomatoes", 1.50);
		BreadRoll basicBread = new BreadRoll("Normal type");
		BreadRoll ryoBread = new BreadRoll("Rye Bread");

		Drinks coke = new Drinks("Coke", 2.00);
		Chips chips = new Chips("Chips", 1.50);

		HamBurgers md = new HamBurgers("MacDee", basicBread, "meat", 6);
		md.addToppings(lettuce);
		md.addToppings(tomatoes);
		System.out.println(md.myTotal());

		HealthyBurger vego = new HealthyBurger("VegeDeluxe", ryoBread,
				"fake meat", 8);
		vego.addToppings(carrots);
		vego.addToppings(tomatoes);
		vego.addToppings(lettuce);
		vego.addDrinks(coke);
		vego.addChips(chips);
		System.out.println(vego.myTotal());

		DeluxeBurgers vip = new DeluxeBurgers("VIP Milla", ryoBread, "meat", 12);
		vip.addToppings(carrots);
		vip.addToppings(tomatoes);
		vip.addToppings(lettuce);
		vip.addDrinks(coke);
		vip.addChips(chips);
		System.out.println(vip.myTotal());

	}
}