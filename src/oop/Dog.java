package oop;

public class Dog extends Animal {
	private int eyes, legs, tail, teeth;
	public int getEyes() {
		return eyes;
	}

	public int getLegs() {
		return legs;
	}

	public int getTail() {
		return tail;
	}

	public int getTeeth() {
		return teeth;
	}

	public String getCoat() {
		return coat;
	}

	private String coat;

	public Dog(String name, int size, int weight, int eyes, int legs, int tail,
			int teeth, String coat) {
		super(name, 1, 1, size, weight); //Constructing for SuperClass
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;
	}



	public void chew() {
		System.out.println("Dog.chew() called!");
	}

	@Override
	public void eat() {
		System.out.println("Dog.eat() called!");
		chew();
		super.eat();
	}

	public void walk() {
		System.out.println("Dog.walk() called");
		move(5);
	}

	public void run() {
		System.out.println("Dog.run() called");
		move(10);
	}

	@Override
	public void move(int speed) {
		System.out.println("Dog.move() called. Moving at 10 million speed");
		super.move(speed);
	}
	
	

}
