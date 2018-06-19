package datastructures.arraylistboxing.arraylist;

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

	/**
	 * Assumes the users starts counting from 1. 1st position is 1
	 * 
	 * @param pos
	 *            returns the Item (String)
	 */
	public String getItem(int pos) {
		String getItem = null;
		if (groceryListArr.size() >= pos) {
			getItem = groceryListArr.get(pos - 1);
			System.out.println();
		}
		return getItem;
	}

	public void modifyItem(String currItem, String newItem) {
		int position = findItem(currItem);
		if (position >= 0) {
			modifyItem(position, newItem);
		} else {
			System.out.println("Cannot modify invalid entry.");
		}
	}

	private void modifyItem(int position, String newItem) {
		groceryListArr.set(position, newItem);
		System.out.println(groceryListArr.get(position) + " is replaced with "
				+ newItem);
	}

	private int findItem(String searchItem) {
		return groceryListArr.indexOf(searchItem);
	}

	public boolean onFile(String searchItem) {
		return findItem(searchItem) >= 0;
	}

	private void removeItem(int position) {
		if (position >= 0) {
			groceryListArr.remove(position);
		} else
			System.out.println("Index out of bound");
	}

	public void removeItem(String item) {
		int position = findItem(item);
		if (position >= 0) {
			removeItem(position);
			System.out.println(item + " have been removed.");
		} else {
			System.out.println("Item Not found. cannot be removde");
		}
	}

	public int getSize() {
		return groceryListArr.size();
	}
}
