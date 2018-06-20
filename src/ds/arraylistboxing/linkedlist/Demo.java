package ds.arraylistboxing.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {

	public static void main(String[] args) {

		LinkedList<String> placesToVisit = new LinkedList<String>();
		addSort(placesToVisit, "New York");
		addSort(placesToVisit, "Canada");
		addSort(placesToVisit, "India");
		addSort(placesToVisit, "Egypt");
		addSort(placesToVisit, "Israel");
		addSort(placesToVisit, "New York");
		addSort(placesToVisit, "South Africa");
		addSort(placesToVisit, "Saudi Arabia");
		addSort(placesToVisit, "India");
		addSort(placesToVisit, "Jamaica");

		printList(placesToVisit);

	}

	private static void printList(LinkedList<String> placesList) {
		Iterator<String> i = placesList.iterator();
		while (i.hasNext()) {
			System.out.println("Now visiting " + i.next());
		}
		System.out.println("-----------------------------");
	}

	private static boolean addSort(LinkedList<String> linkedList, String newCity) {
		ListIterator<String> i = linkedList.listIterator();

		while (i.hasNext()) {
			int comparison = i.next().compareTo(newCity);
			if (comparison == 0) {
				// Equal, do not add!
				System.out.println(newCity + " already exist on the list");
				return false;
			} else if (comparison > 0) {
				// Current Item is greater than incoming
				i.previous();
				i.add(newCity);
				return true;
			} else if (comparison < 0) {
				//If currentItem is less than incoming Item
				//Nothing iterator moves to next on Next loop
			}
		}
		i.add(newCity);
		return true;
	}
}
