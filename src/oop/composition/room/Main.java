package oop.composition.room;

public class Main {

	public static void main(String[] args) {
		// 4 Wall objects created
		Wall eastWall = new Wall("East");
		Wall westWall = new Wall("West");
		Wall southWall = new Wall("South");
		Wall northWall = new Wall("North");
		
		// Ceilings object
		Ceiling onlyCeiling = new Ceiling(23, "White");
		
		Lamp randomLamp = new Lamp("",true, 3);
		
		Bed newBed = new Bed("Silent Night", "Divan", 4,3,2,1);
		
		BedRoom bedroom = new BedRoom("My bedroom", newBed, northWall, eastWall, southWall, 
				westWall, onlyCeiling, randomLamp);
		
		bedroom.makeBed();
		
		bedroom.getLamp().turnOn();
	}
}
