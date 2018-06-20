package ds.arraylistboxing.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		LinkedList<String> placesToVisit = new LinkedList<String>();
		addSort(placesToVisit, "New York");
		addSort(placesToVisit, "Canada");
		addSort(placesToVisit, "Egypt");
		addSort(placesToVisit, "Israel");
		addSort(placesToVisit, "South Africa");
		addSort(placesToVisit, "Saudi Arabia");
		addSort(placesToVisit, "Jamaica");
		addSort(placesToVisit, "India");

		printList(placesToVisit);
		addSort(placesToVisit, "Nigeria");
		addSort(placesToVisit, "India");
		printList(placesToVisit);

		visit(placesToVisit);
	}

	private static void printList(LinkedList<String> placesList) {
		Iterator<String> i = placesList.iterator();
		while (i.hasNext()) {
			// While Iterator has a next Item
			System.out.println("Now visiting " + i.next());
		}
		System.out.println("-----------------------------");
	}

	/**
	 * Adds Item to linkedList in Alphabetical order
	 * 
	 * @param linkedList
	 *            - The List to be manipulated
	 * @param newCity
	 *            - The Item to insert into the List
	 * @return true - if insertion occurs, otherwise false.
	 */
	private static boolean addSort(LinkedList<String> linkedList, String newCity) {
		// i iterates through the linkedList
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
				// If currentItem is less than incoming Item
				// Nothing iterator moves to next on Next loop
			}
		}
		i.add(newCity);
		return true;
	}

	@SuppressWarnings("resource")
	private static void visit(LinkedList<String> places) {
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		boolean goingForward = true;
		ListIterator<String> i = places.listIterator();

		if (places.isEmpty()) {
			System.out.println("No places found in the list");
			return;
		} else {
			System.out.println("Now visiting " + i.next());
			printMenu();
		}
		while (!quit) {
			System.out.print("Enter Option 0 to 3: ");
			int option = scanner.nextInt();
			scanner.nextLine();
			switch (option) {
			case 0:
				System.out.println("Holiday over!");
				quit = true;
				break;
			case 1:
				if (!goingForward){
					if (i.hasNext()){
						i.next();
					}
					goingForward = true;
				}
				if (i.hasNext()) {
					System.out.println("Now visiting " + i.next());
					break;
				}else{
					System.out.println("You have reached the end of the list");
					goingForward=false;
					break;
				}
			case 2:
				if (goingForward){
					if (i.hasPrevious()){
						i.previous();
					}
					goingForward = false;
				}
				if (i.hasPrevious()){
					System.out.println("Now visitig "+ i.previous());
					
				}else{
					System.out.println("We are at the beginning of the list");
					goingForward = true;
				}
				break;
			case 3:
				printMenu();
				break;
			}
		}
		scanner.close();
	}

	private static void printMenu() {
		System.out.println("Available option: \npress");
		System.out.println("0 - Quit \n1 - go to next \n2 - go to previous \n3 - print menu");

	}
}
