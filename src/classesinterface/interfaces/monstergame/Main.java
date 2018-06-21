package classesinterface.interfaces.monstergame;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Player tom = new Player("Tom", 10, 15);
/*		System.out.println(tom.toString());
		saveObject(tom);
		
		tom.setHitPoints(8);
		System.out.println(tom);
		tom.setWeapon("Words");
		saveObject(tom);
		loadObject(tom);
		System.out.println(tom);*/
		
		ISaveable tom = new Monsters("Tom", 20, 40);
		System.out.println(tom);
		System.out.println("Strengths: "+((Monsters)tom).getStrengths());//Casting interface to enable Class methods
		saveObject(tom);

	}

	public static ArrayList<String> readValues() {
		ArrayList<String> values = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		int index = 0;
		System.out.println("Choose:\n 0 - quit | 1 - Enter a String");

		while (!quit) {
			System.out.print("Choose an option: ");
			int option = scanner.nextInt();
			scanner.nextLine();
			switch (option) {
			case 0:
				quit = true;
				break;
			case 1:
				System.out.print("Enter a String: ");
				String strInput = scanner.nextLine();
				values.add(index, strInput);
				index++;
				break;
			}
		}
		scanner.close();
		return values;
	}

	public static void saveObject(ISaveable objectToSave) {
		// Polymorpic parameter used: objectToSave could be object of any class
		// implementing Isaveable
		for (int i = 0; i < objectToSave.writeToList().size(); i++) {
			System.out.println("Saving " + objectToSave.writeToList().get(i)
					+ " to storage device");
		}
	}
	
	public static void loadObject(ISaveable objectToLoad){
		//Reads content from read LinkedList and loads it unto object
		ArrayList<String> values = readValues();
		objectToLoad.read(values); //Object now has the properties
		
	}
}
