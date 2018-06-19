package javamasterclass;

import java.util.ArrayList;
import java.util.Scanner;


public class ArrayListDS {

	private static Scanner scanner = new Scanner(System.in);
	private static GroceryList groList = new GroceryList();

	public static void main(String[] args) {
		/*
		 * //Instance object GroceryList groList2 = new GroceryList();
		 * groList2.findItem("test");
		 */
		boolean quit = false;

		while (!quit) {
			printInstruction();
			System.out.println("Enter a choice from Menu");
			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				printInstruction();
				break;
			case 2:
				addItem();
				break;
			case 3:
				modifyItem();
				break;
			case 4:
				removeItem();
				break;
			case 5:
				itemSearch();
				break;
			case 6:
				groList.printGroceryList();
				break;
			case 7:
				processArrayList();
				break;
			case 8:
				quit = true;
				break;
			}
		}
	}

	private static void processArrayList() {
		//How to copy an arrayList
		ArrayList<String> newArr = new ArrayList<String>();
		newArr.addAll(groList.getGroceryListArr());
	
		//Another way to copy an arraylist
		@SuppressWarnings("unused")
		ArrayList<String> anotherNewArr = new ArrayList<String>(groList.getGroceryListArr());
	
		 //Copying an ArrList into an Array
		String [] yetAnotherArr = new String [groList.getGroceryListArr().size()];
		yetAnotherArr = groList.getGroceryListArr().toArray(yetAnotherArr);
	}

	private static void itemSearch() {
		System.out.println("Enter the Item to search for: ");
		String key = scanner.nextLine();
		if (groList.searchItem(key))
			System.out.println(key + "was FOUND!");
		else
			System.out.println(key + "was NOT FOUND!");
	}

	private static void removeItem() {
		System.out.println("type item to remove");
		String item = scanner.nextLine();
		if (groList.searchItem(item)) {
			groList.removeItem(item);
			System.out.println(item + " has been removed from the list");
		} else {
			System.out.println(item +"was not found on the list!");
		}
	}

	private static void modifyItem() {
		System.out.println("Please enter item to replace");
		String keyItem = scanner.nextLine();
		System.out.println("Enter the new Item");
		String newItem = scanner.nextLine();
		
		if (groList.searchItem(keyItem)) {
			groList.modifyItem(keyItem, newItem);
		} else {
			System.out.println("Position doesn't exist");
		}
	}

	private static void addItem() {
		System.out.println("Please enter item to add: ");
		String item = scanner.nextLine();
		groList.addItem(item);

	}

	private static void printInstruction() {
		System.out.println("\nPress ...");
		System.out.println("\t 1 - To print Instruction");
		System.out.println("\t 2 - To Add item");
		System.out.println("\t 3 - To modify Item");
		System.out.println("\t 4 - removeItem");
		System.out.println("\t 5 - Search for an Item");
		System.out.println("\t 6 - Print Grocery list");
		System.out.println("\t 7 - Process Array");
		System.out.println("\t 8 - Quit / Exit");
		System.out.println("\t ");
	}

}
