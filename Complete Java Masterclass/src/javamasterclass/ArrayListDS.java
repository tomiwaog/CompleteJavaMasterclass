package javamasterclass;

import java.util.ArrayList;
import java.util.Scanner;

class GroceryList {
	private ArrayList<String> groceryListArr = new ArrayList<String>();

	public ArrayList<String> getGroceryList() {
		return groceryListArr;
	}

	public void addItem(String item) {
		groceryListArr.add(item);
	}

	public void printGroceryList() {
		System.out.println("You have " + groceryListArr.size()
				+ " elements in " + getClass().getSimpleName());
		for (int i = 0; i < groceryListArr.size(); i++)
			System.out.println((i + 1) + ". " + groceryListArr.get(i));
	}

	public void getItem(int pos) {
		if (groceryListArr.size() >= pos)
			System.out.println(groceryListArr.get(pos - 1));
	}

	public void modifyItem(int position, String newItem) {
		if (position >= 0) {
			groceryListArr.set(position, newItem);
			System.out.println("Item at " + position + " modified!");
		}
	}

	public void searchModify(String key, String newItem) {

		if (search(key))// if (groceryList.contains(key)) //Alternative
		{
			int location = groceryListArr.indexOf(key);
			groceryListArr.set(location, newItem);
			System.out.println(key + " replaced with " + newItem);
		} else
			System.out.println(key + " not found!");
	}

	public boolean search(String key) {
		/*
		 * for (String x : groceryList) if (x == key) found = true;
		 */

		// Using builtin Methods
		// int loc = groceryList.indexOf(key); //Get location

		return groceryListArr.contains(key);
	}

	// Task
	public int findItem(String key) {
		int position = groceryListArr.indexOf(key);
		return position;
	}

	public void removeItem(int position) {
		groceryListArr.remove(position);
	}

	public int getSize() {
		return groceryListArr.size();
	}
}

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
				quit = true;
				break;
			}
		}
	}

	private static void itemSearch() {
		System.out.println("Enter the Item to search for: ");
		String key = scanner.nextLine();
		if (groList.search(key))
			System.out.println("FOUND!");
		else
			System.out.println("NOT FOUND!");
	}

	private static void removeItem() {
		System.out.println("Enter the position to remove");
		int position = scanner.nextInt();
		scanner.nextLine();
		if (position > 0 && position <= groList.getSize()) {
			groList.removeItem(position - 1);
		} else {
			System.out.println("Position doesn't exist");
		}
	}

	private static void modifyItem() {
		System.out.println("Enter the position to edit");
		int position = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter the new Item");
		String newItem = scanner.nextLine();
		if (position > 0 && position <= groList.getSize()) {
			groList.modifyItem(position - 1, newItem);
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
		System.out.println("\nPress ");
		System.out.println("\t 1 - To print Instruction");
		System.out.println("\t 2 - To Add item");
		System.out.println("\t 3 - To modify Item");
		System.out.println("\t 4 - removeItem");
		System.out.println("\t 5 - Search for an Item");
		System.out.println("\t 6 - Print Grocery list");
		System.out.println("\t 7 - Quit / Exit");
		System.out.println("\t ");
	}

}
