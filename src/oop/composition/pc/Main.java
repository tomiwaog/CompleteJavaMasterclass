package oop.composition.pc;

public class Main {

	public static void main(String[] args) {
		Dimensions dimensions = new Dimensions(20, 20, 5);
		Case theCase = new Case("2208", "Dell", "240psu", dimensions);
		Resolution nativeResolution = new Resolution(2540,1440);
		Monitor theMon = new Monitor("MON27Screen", "Acer", 27, nativeResolution);
		
		MotherBoard theMotherBoard = new MotherBoard("BJ200","Asus",4,6,"v2.44");
		PC thePC = new PC(theCase,theMon,theMotherBoard);
		thePC.powerUp();
		
		//Composition = HAS-A
		//Inheritance = IS-A
	}
}
