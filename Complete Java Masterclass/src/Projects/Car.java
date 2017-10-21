package Projects;

public class Car extends Vehicle{


private int wheels, doors,gears, currentGear;
public Car(String name, String size, int wheels, int doors, int gears,
		 boolean isManual) {
	super(name, size);
	this.wheels = wheels;
	this.doors = doors;
	this.gears = gears;
	this.isManual = isManual;
	this.currentGear = 1;

}


public void changeGear(int currentGear){
	this.currentGear = currentGear;
	System.out.println("Car.setCurrentGear(); changed to gear "+this.currentGear );
}

public void changeVelocity(int speed, int direction){
	move(speed, direction);
	System.out.println("Car.changeVelocity(): velocity: " + speed + " direction "+ direction);
}
private boolean isManual;
public int getWheels() {
	return wheels;
}


public int getDoors() {
	return doors;
}


public int getGears() {
	return gears;
}


public int getCurrentGear() {
	return currentGear;
}


public boolean isManual() {
	return isManual;
}

}
