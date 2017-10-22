package Projects;



class HamBurgers {
	private BreadRoll rollType;
	private Toppings topping;
	private String meat;
	protected int numToppings;
	private double price;

	public HamBurgers(BreadRoll rollType, String meat, double price) {
		super();
		this.rollType = rollType;
		this.meat = meat;
		this.price = price;
	}

	/*	*/

	public void addToppings(Toppings topping) {
		if (getNumToppings() <= 4) {
			numToppings++;
		} else {
			System.out.println("Cannot add more than 4 toppings to base");
		}
	}

	public BreadRoll getRollType() {
		return rollType;
	}

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
		double base = 6;
		double total;
		total = (base) + getNumToppings() * 4;

		System.out.println("Burger");
		return total;
	}
}

class deluxeBurgers extends HamBurgers {

	public deluxeBurgers(BreadRoll rollType, String meat, double price) {
		super(rollType, meat, price);
		// TODO Auto-generated constructor stub
	}

	public void addToppings(Toppings topping) {
		System.out.println("Cannot add Toppings to Deluxe");
	}

}

class healthyBurger extends HamBurgers {

	public healthyBurger(BreadRoll rollType, String meat, double price) {
		super(rollType, meat, price);
		// TODO Auto-generated constructor stub
	}

	public void addToppings(Toppings topping) {
		if (getNumToppings() <= 4) {
			numToppings++;
		} else {
			System.out.println("Max 4 toppings allowed on HealthyBurger");
		}
	}

}

public class BillBurgers {

	public static void main(String[] args) {
e
	}
}