package composition;

public class Car extends Vehicle {
	private int doors;
	private int engineCapacity;
	public Car(int doors, int engineCapacity) {
		super();
		this.doors = doors;
		this.engineCapacity = engineCapacity;
	}
	public int getDoors() {
		return doors;
	}
	public int getEngineCapacity() {
		return engineCapacity;
	}
	
	
}
