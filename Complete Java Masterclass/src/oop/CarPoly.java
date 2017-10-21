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
	public static void main(String[] args) {
		Autoy gen = new Autoy("Made in China",5);
		System.out.println(gen.startEngine());
		System.out.println(gen.accelerate(40));
		System.out.println(gen.brake(20)+"\n");

		
		Beamer Five20i = new Beamer("BMW 5 Series, 520i", 6);
		System.out.println(Five20i.startEngine());
		System.out.println(Five20i.accelerate(30));
		System.out.println(Five20i.brake(30));
		
	}
}
