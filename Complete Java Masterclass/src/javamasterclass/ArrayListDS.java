package javamasterclass;

import java.util.ArrayList;

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

	public static void main(String[] args) {
		GroceryList hi = new GroceryList();
		hi.addGroceryItem("Tom");
		hi.addGroceryItem("Tim Buk");
		hi.addGroceryItem("Ogunbamowo");
		hi.printGroceryList();


		hi.searchModify("Tom", "Tomiwa");
		hi.printGroceryList();
		//hi.removeItem(1);
		//hi.printGroceryList();
/*		
 		hi.modifyItem(1, "TommieOg");
		hi.printGroceryList();
*/
		

	}

}
