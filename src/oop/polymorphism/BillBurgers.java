package oop.polymorphism;

import java.util.ArrayList;

class Extras {
	// State or fields
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
	protected int numToppings; // encapsulation - Data hiding
	protected double price;
	protected double totalPrice = 0;
	public ArrayList<Extras> extras = new ArrayList<Extras>(); // Java
																// Collections

	public String getName() {
		return name;
	}

	public HamBurgers() {
	}

	// MoviePolymorphism - Overloading
	public HamBurgers(String name, BreadRoll rollType, String meat, double price) {
		super();
		this.rollType = rollType;
		this.meat = meat;
		this.price = price;
		this.name = name;
		totalPrice += price; // add to total price
		System.out.println(getName() + " " + getClass().getSimpleName()
				+ " on a " + rollType.getType() + " with " + this.meat + ": "
				+ price);

	}

	public boolean addToppings(Toppings topping) {
		// Max topping allowed on base is 4
		if (getNumToppings() < 4) {
			numToppings++;
			totalPrice += topping.getPrice();
			extras.add(topping);
			System.out.println("Added " + topping.name + ": " + topping.price);
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
		System.out.println("Added " + drink.name + ": " + drink.price);
		totalPrice += drink.price;
	}

	// Free drinks with deluxe burgers only
	public void addChips(Chips chips) {
		if (getClass().getSimpleName().equals("DeluxeBurgers"))
			chips.price = 0;
		extras.add(chips);
		System.out.println("Added " + chips.name + ": " + chips.price);
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
		// Conditional statements
		if (getNumToppings() > 0) {
			if (!getClass().getSimpleName().equals("DeluxeBurgers")) { // Comparison
																		// operators
				System.out.println("No of Toppings: " + getNumToppings());
			} else {
				System.out.println("Chips AND Coke added for free");
			}
			String extrasReader = ""; // Local variable
			// Loops
			for (Extras objecto : extras) {
				extrasReader += objecto.name + ", ";
			}
			extrasReader = extrasReader.substring(0, extrasReader.length() - 2);
			// removes whitespace & rids last comma
			System.out.println("Extras: " + extrasReader);
		}
		System.out.println("Total price: £" + getTotalPrice() + "\n");
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
	}

	// MoviePolymorphism - Overriding
	@Override
	public boolean addToppings(Toppings topping) {
		System.out.println("No Toppings allowed. Cannot add "+topping.getName());
		return false;
	}
}

class HealthyBurger extends HamBurgers {
	Toppings lentis = new Toppings("Cheese", 1.13);
	static BreadRoll ryoBreado = new BreadRoll("Rye Bread");

	public HealthyBurger(String name, BreadRoll rollType, String meat,
			double price) {
		super(name, rollType, meat, price);
	}

	public HealthyBurger(String meat, double price) {
		super("Virgin Burger", ryoBreado, meat, price);
	}

	public boolean addToppings(Toppings topping) {
		// Max topping allowed on base is 4
		if (getNumToppings() < 6) {
			numToppings++;
			totalPrice += topping.getPrice();
			extras.add(topping);
			System.out.println("Added " + topping.name + ": " + topping.price);
			return true;
		} else {
			System.out.println("Cannot add more than 6 toppings to Healthy Bugger");
			return false;
		}
	}

	@Override
	public double getTotalPrice() {
		return super.getTotalPrice();
	}

}

public class BillBurgers {

	public static void main(String[] args) {
		Toppings lettuce = new Toppings("Lettuce", 0.75);
		Toppings carrots = new Toppings("Carrots", 2);
		Toppings tomatoes = new Toppings("Tomatoes", 0.27);
		Toppings cheese = new Toppings("Cheese", 1.13);

		BreadRoll basicBread = new BreadRoll("White Roll");
		BreadRoll ryoBread = new BreadRoll("Rye Bread");

		Drinks coke = new Drinks("Coke", 2.00);
		Chips chips = new Chips("Chips", 1.50);

		HamBurgers md = new HamBurgers("Basic", basicBread, "Sausage", 3.56);

		md.addToppings(lettuce);
		md.addToppings(tomatoes);
		md.addToppings(cheese);

		md.myTotal();

		HealthyBurger vego = new HealthyBurger("VegeDeluxe", ryoBread,
				"fake meat", 8);
		vego.addToppings(cheese);
		vego.addToppings(tomatoes);
		vego.addToppings(lettuce);
		vego.addDrinks(coke);
		vego.addChips(chips);
		vego.myTotal();

		HealthyBurger virgin = new HealthyBurger("fish meat", 6.50);
		virgin.addDrinks(coke);
		virgin.myTotal();

		DeluxeBurgers vip = new DeluxeBurgers("VIP Milla", ryoBread, "meat", 12);
		vip.addToppings(carrots);
		vip.addToppings(tomatoes);
		vip.addToppings(lettuce);
		vip.addDrinks(coke);
		vip.addChips(chips);
		vip.myTotal();

	}
}