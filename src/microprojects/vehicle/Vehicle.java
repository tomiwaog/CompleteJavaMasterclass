package microprojects.vehicle;

public class Vehicle {
	private String name, size;
	private int currentVelocity;
	private int currentDirection;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getCurrentVelocity() {
		return currentVelocity;
	}

	public void setCurrentVelocity(int currentVelocity) {
		this.currentVelocity = currentVelocity;
	}

	public int getCurrentDirection() {
		return currentDirection;
	}

	public void setCurrentDirection(int currentDirection) {
		this.currentDirection = currentDirection;
	}
	
	public Vehicle(String name, String size){
		this.name = name;
		this.size = size;
		this.currentVelocity=0;
		this.currentDirection=0;
	}
	
	public void steer(int direction) {
		currentDirection += direction;
		System.out.println("Vehicle.steer(): Steering at "+ currentDirection+ " degrees.");
	}

	public void move(int velocity, int direction) {
		currentVelocity = velocity;
		currentDirection = direction;
		System.out.println("Vehicle.move(): Moving() at " + currentVelocity
				+ " in direction " + currentDirection);
	}

	public void stop() {
		this.currentVelocity = 0;
	}
}
