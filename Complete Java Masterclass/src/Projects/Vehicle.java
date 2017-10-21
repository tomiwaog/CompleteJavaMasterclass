package Projects;

public class Vehicle extends Object {
private String name, size;
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

	private int currentVelocity;
	private int currentDirection;

	public Vehicle(String name,String size){
		
	}

	public void handSteer(){
		
	}

	public void move(int velocity, int direction){
		currentVelocity = velocity;
		currentDirection = direction;
		System.out.println("Vehicle is moving() at "+currentVelocity+ " in direction "+ currentDirection);
	}
	public void stop(){
		this.currentVelocity=0;
	}
}
