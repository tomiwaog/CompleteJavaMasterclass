package javamasterclass;

import java.util.ArrayList;
import java.util.Scanner;

class GroceryList {
	private ArrayList<String> groceryList = new ArrayList<String>();

	public ArrayList<String> getGroceryList() {
		return groceryList;
	}

	public void addGroceryItem(String item) {
		groceryList.add(item);
	}

	public void printGroceryList() {
		System.out.println("You have " + groceryList.size() + " elements in "
				+ getClass().getSimpleName());
		for (int i = 0; i < groceryList.size(); i++)
			System.out.println((i + 1) + ". " + groceryList.get(i));
	}

	public void modifyItem(int position, String newItem) {
		if (position > 0) {
			groceryList.set(position - 1, newItem);
			System.out.println("Item at "+position+ " modified!");
		}
	}

	public void searchModify(String key, String newItem) {

		if (search(key))//if (groceryList.contains(key)) //Alternative
			{
			int location = groceryList.indexOf(key);
			groceryList.set(location, newItem);
			System.out.println(key+" replaced with "+ newItem);
		}
		else
			System.out.println(key+" not found!");
	}

	public boolean search(String key) {
/*		for (String x : groceryList)
			if (x == key)
				found = true;*/
		
		//Using builtin Methods
		//int loc = groceryList.indexOf(key); //Get location

		return groceryList.contains(key);
	}
	
	//Task
	public int findItem(String key){
		int position = groceryList.indexOf(key);
		return position;
	}
	public void removeItem(int position){
		groceryList.remove(position-1);
	}
}

public class ArrayListDS {

	private static Scanner scanner = new Scanner(System.in);
	private static GroceryList groList = new GroceryList();
	
	public static void main(String[] args) {
/*		//Instance object
		GroceryList groList2 = new GroceryList();
		groList2.findItem("test");*/
		boolean quit = false;
		int choice = scanner.nextInt();
		scanner.nextLine();
		while(!quit){
			System.out.println("Enter a choice from Menu");
			
			switch(choice){
			case 1:
				printInstruction();
				break;
			case 2:
			addItem();break;
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
				quit = true;
				break;
			}
		}
		
		

	}

	private static void itemSearch() {
		System.out.println("Enter item to search for");
		groList.search(scanner.nextLine());
	}

	private static void removeItem() {
		System.out.println("Enter position of item to delete: ");
		groList.removeItem(scanner.nextInt());
	}

	private static void modifyItem() {
		System.out.println("Enter position to update");
		int position = scanner.nextInt();
		System.out.println("Enter new List");
		groList.modifyItem(position, scanner.nextLine());
	}

	private static void addItem() {
		System.out.println("Please enter item to add");	
		groList.addGroceryItem(scanner.nextLine());	
	}

	private static void printInstruction() {
		System.out.println("\nPress ");
		System.out.println("\t 1 - To print Instruction");
		System.out.println("\t 2 - To Add item");
		System.out.println("\t 3 - To modify Item");
		System.out.println("\t 4 - removeItem");
		System.out.println("\t 5 - Search for an Item");
		System.out.println("\t 6 - Quit / Exit");
		System.out.println("\t ");	
	}

}
