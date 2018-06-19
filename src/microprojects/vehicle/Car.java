package microprojects.vehicle;


public class Car extends Vehicle {
	private int wheels, doors, gears, currentGear;
	private boolean isManual;
	
	

	public Car(String name, String size, int wheels, int doors, int gears,
			boolean isManual) {
		super(name, size);
		this.setWheels(wheels);
		this.setDoors(doors);
		this.setGears(gears);
		this.setManual(isManual);
		this.currentGear = 1;
	}

	public void changeGear(int currentGear) {
		this.currentGear = currentGear;
		System.out.println("Car.setGear(): Changed to "+ this.currentGear+" gear.");
	}
	
	public void changeVelocity(int speed, int direction){
		super.move(speed,direction);
		System.out.println("Car.changeVelocity(): Velocity" + speed+ " direction "+ direction);
	}

	public int getGears() {
		return gears;
	}

	public void setGears(int gears) {
		this.gears = gears;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public boolean isManual() {
		return isManual;
	}

	public void setManual(boolean isManual) {
		this.isManual = isManual;
	}
	
}
