package oop;

class Autoy {
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

	private int cylinders, wheels, curSpeed;
	private String name;
	public int getCurSpeed() {
		return curSpeed;
	}

	private boolean engine;

	public Autoy(String name, int cylinders) {
		super();
		this.name = name;
		this.engine = true;
		;
		this.cylinders = cylinders;
		this.wheels = 4;
	}
	
	public String startEngine(){
		return "Car-> startEngine()";
		
	}
	public String accelerate(int speed){
		return "Car -> accelerate()";
	}
	public String brake(int brakeSpeed){
		return "Car-> brake()";
	}
}

class Beamer extends Autoy{

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

class Merc extends Autoy{

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

class Renault extends Autoy{

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

public class CarPoly {
	
	static class Ford extends Autoy{

		public Ford(String name, int cylinders) {
			super(name, cylinders);
		}

		@Override
		public String startEngine(){
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
		Autoy gen = new Autoy("Made in China",5);
		System.out.println(gen.startEngine());
		System.out.println(gen.accelerate(40));
		System.out.println(gen.brake(20)+"\n");

		
		Beamer Five20i = new Beamer("BMW 5 Series, 520i", 6);
		System.out.println(Five20i.startEngine());
		System.out.println(Five20i.accelerate(30));
		System.out.println(Five20i.brake(30)+"\n");
		
		Merc A20 = new Merc("Mercedez A20, 520i", 8);
		System.out.println(A20.startEngine());
		System.out.println(A20.accelerate(40));
		System.out.println(A20.brake(30)+"\n");
		
		Rover r25 = new Rover("Rover 25", 4);
		System.out.println(r25.startEngine());
		System.out.println(r25.accelerate(40));
		System.out.println(r25.brake(30)+"\n");
		
		//Creating an in-line class , not recommended
		Autoy toyota = new Autoy("Toyota Camri", 8){
			@Override
			public String startEngine(){
				return "Toyota -> startEngine()";		
			}

			@Override
			public String accelerate(int speed) {
				return "Toyota -> Accelerate()";
			}

			@Override
			public String brake(int brakeSpeed) {
				return "Toyota -> brake()";
			}
		};
		System.out.println(toyota.startEngine());
		System.out.println(toyota.accelerate(40));
		System.out.println(toyota.brake(30)+"\n");
		
		
		Ford focus = new Ford ("Ford focus", 5);
		System.out.println(focus.startEngine());
		System.out.println(focus.accelerate(40));
		System.out.println(focus.brake(30));

		
		
	}
}
