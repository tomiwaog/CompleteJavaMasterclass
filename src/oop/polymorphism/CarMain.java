package oop.polymorphism;

class Car {
	private int cylinders, wheels, curSpeed;
	private String name;
	private String model;
	private boolean engine;

	public Car(String name, int cylinders) {
		this.name = name;
		this.engine = true;
		;
		this.cylinders = cylinders;
		this.wheels = 4;
	}

	public boolean getEngine() {
		return engine;
	}

	public int getCylinders() {
		return cylinders;
	}

	public int getWheels() {
		return wheels;
	}

	public String getName() {
		return name;
	}

	public int getCurSpeed() {
		return curSpeed;
	}

	public String startEngine() {
		return "Car-> startEngine()";
	}

	public String accelerate(int speed) {
		return "Car -> accelerate()";
	}

	public String brake(int brakeSpeed) {
		return "Car-> brake()";
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
}

class Beamer extends Car {

	public Beamer(String name, int cylinders) {
		super(name, cylinders);
	}

	@Override
	public String startEngine() {
		return "BMW -> startEngine()";
	}

	@Override
	public String accelerate(int speed) {
		return "BMW -> Accelerate()";
	}

	@Override
	public String brake(int brakeSpeed) {
		return "BMW -> brake()";
	}
}

class Merc extends Car {

	public Merc(String name, int cylinders) {
		super(name, cylinders);
	}

	@Override
	public String getName() {
		return super.getName();
	}

	@Override
	public String startEngine() {
		return "MERCEDEZ -> startEngine()";
	}

	@Override
	public String accelerate(int speed) {
		return "MERCEDEZ -> Accelerate()";
	}

	@Override
	public String brake(int brakeSpeed) {
		return "MERCEDEZ -> brake()";
	}
}

class Renault extends Car {

	public Renault(String name, int cylinders) {
		super(name, cylinders);
	}

	@Override
	public String startEngine() {
		return "RENAULT -> startEngine()";
	}

	@Override
	public String accelerate(int speed) {
		return "RENAULT -> Accelerate";
	}

	@Override
	public String brake(int brakeSpeed) {
		return "RENAULT -> Brake";
	}
}

class Mitsubishi extends Car {
	public Mitsubishi() {
		super("Mitsubishi", 34);
	}

	public Mitsubishi(String name, int cylinders) {
		super(name, cylinders);
	}
	
	@Override
	public String startEngine() {
		return getClass().getSimpleName() + " -> startEngine()";
	}

	@Override
	public String accelerate(int speed) {
		return getClass().getSimpleName() + " -> Accelerate()";
	}

	@Override
	public String brake(int brakeSpeed) {
		return getClass().getSimpleName() + " -> brake()";
	}
}

public class CarMain {

	static class Ford extends Car {

		public Ford(String name, int cylinders) {
			super(name, cylinders);
		}

		@Override
		public String startEngine() {
			return getClass().getSimpleName() + " -> startEngine()";
		}

		@Override
		public String accelerate(int speed) {
			return getClass().getSimpleName() + " -> Accelerate()";
		}

		@Override
		public String brake(int brakeSpeed) {
			return getClass().getSimpleName() + " -> brake()";
		}
	}



	public static void main(String[] args) {
		Car gen = new Car("Made in China", 5);
		System.out.println(gen.startEngine());
		System.out.println(gen.accelerate(40));
		System.out.println(gen.brake(20) + "\n");

		Beamer Five20i = new Beamer("BMW 5 Series, 520i", 6);
		System.out.println(Five20i.startEngine());
		System.out.println(Five20i.accelerate(30));
		System.out.println(Five20i.brake(30) + "\n");

		Merc A20 = new Merc("Mercedez A20, 520i", 8);
		System.out.println(A20.startEngine());
		System.out.println(A20.accelerate(40));
		System.out.println(A20.brake(30) + "\n");

		Rover r25 = new Rover("Rover 25", 4);
		System.out.println(r25.startEngine());
		System.out.println(r25.accelerate(40));
		System.out.println(r25.brake(30) + "\n");

		// Creating an in-line class , not recommended
		Car toyota = new Car("Toyota Camri", 8) {
			@Override
			public String startEngine() {
				return "Custom Toyota -> startEngine()";
			}

			@Override
			public String accelerate(int speed) {
				return "Custom Toyota -> Accelerate()";
			}

			@Override
			public String brake(int brakeSpeed) {
				return "Custom Toyota -> brake()";
			}
		};
		System.out.println(toyota.startEngine());
		System.out.println(toyota.accelerate(40));
		System.out.println(toyota.brake(30) + "\n");

		Ford focus = new Ford("Ford focus", 5);
		System.out.println(focus.startEngine());
		System.out.println(focus.accelerate(40));
		System.out.println(focus.brake(30)+ "\n");

		Mitsubishi mitsi = new Mitsubishi("Outlander VRW 4", 6);
		System.out.println(mitsi.startEngine());
		System.out.println(mitsi.accelerate(40));
		System.out.println(mitsi.brake(30));
	}
}
