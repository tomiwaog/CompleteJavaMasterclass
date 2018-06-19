package oop.polymorphism;

class Rover extends Car {

	public Rover(String name, int cylinders) {
		super(name, cylinders);
	}

	@Override
	public String startEngine() {
		return "Rover -> startEngine()";
	}

	@Override
	public String accelerate(int speed) {
		return "Rover -> Accelerate()";
	}

	@Override
	public String brake(int brakeSpeed) {
		return "Rover -> brake()";
	}
}
