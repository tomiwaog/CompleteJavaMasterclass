package javamasterclass;

import java.util.ArrayList;

class GroceryList {
	private ArrayList<String> groceryListArr = new ArrayList<String>();

	public ArrayList<String> getGroceryListArr() {
		return groceryListArr;
	}

	public void addItem(String item) {
		// adds new string to array-list
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

	public void modifyItem(String curItem, String newItem) {
		int position = findItem(curItem);
		if (position >= 0) {
			groceryListArr.set(position, newItem);
			System.out.println(curItem +" is replaced with "+ newItem);
		}
	}

	public boolean searchItem(String key) {
		/*
		 * for (String x : groceryList) if (x == key) found = true;
		 */

		// Alternatively Using builtin Methods
		// int loc = groceryList.indexOf(key); //Get location
		return groceryListArr.contains(key);
	}

	// Task
	private int findItem(String key) {
		int position = groceryListArr.indexOf(key);
		return position;
	}

	private String removeItem(int position) {
		String item = null;
		if (position >= 0) {
			item = groceryListArr.get(position);
			groceryListArr.remove(position);
		}
		else
			System.out.println("Cant remove item that doesnt exist!");
		return item;
	}

	public void removeItem(String item) {
		int position = groceryListArr.indexOf(item);
		if (position>=0) //if item is found i.e NOT -1
			removeItem(position);
		else
			System.out.println("Cant remove item that doesnt exist!");
	}
	
	public int getSize() {
		return groceryListArr.size();
	}
}
