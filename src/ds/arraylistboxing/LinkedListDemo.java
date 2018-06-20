package ds.arraylistboxing;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> placesToVisit = new LinkedList<String>();

		addInOrder(placesToVisit, "London");
		addInOrder(placesToVisit, "Birmingham");
		addInOrder(placesToVisit, "Coventry");
		addInOrder(placesToVisit, "Leeds");
		addInOrder(placesToVisit, "Luton");
		addInOrder(placesToVisit, "Sheffield");
		addInOrder(placesToVisit, "Berkshire");
		addInOrder(placesToVisit, "Cambridge");
		addInOrder(placesToVisit, "Coventry");
		printList(placesToVisit);

		addInOrder(placesToVisit, "Leicester");
		addInOrder(placesToVisit, "Leeds");
		printList(placesToVisit);

		visit(placesToVisit);
	}

	private static void printList(LinkedList<String> placesToVisit) {
		Iterator<String> i = placesToVisit.iterator();
		while (i.hasNext()) {
			System.out.println("Now visiting " + i.next());
		}
		System.out.println("*****************************");
	}

	private static boolean addInOrder(LinkedList<String> linkedList,
			String newCity) {
		ListIterator<String> strListIterator = linkedList.listIterator();
		while (strListIterator.hasNext()) {
			// next is initially used to get the first entry in the linked-list
			int comparison = strListIterator.next().compareTo(newCity);
			if (comparison == 0) {
				// Equal, do not add.
				System.out.println(newCity
						+ " is already in the places to Visit");
				return false;
			} else if (comparison > 0) {
				// Selection is greater than incoming, go to previous node and
				// insert
				strListIterator.previous();
				strListIterator.add(newCity);
				return true;
			} else if (comparison < 0) {
				// Selection is less than newCity. i.e. move to next iterator
			}
		}
		strListIterator.add(newCity);
		return true;
	}

	@SuppressWarnings("resource")
	private static void visit(LinkedList<String> cities) {// type not necessary
															// in param LL
															// cities permitted
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		boolean goingForward = true;
		ListIterator<String> listIterator = cities.listIterator();

		if (cities.isEmpty()) {
			System.out.println("No cities in the iternary");
			return;
		} else {
			System.out.println("Now visiting " + listIterator.next());
			printMenu();
		}

		while (!quit) {// while the quit is still assigned Trues
			int userOption = scanner.nextInt();
			scanner.nextLine();
			switch (userOption) {
			case 0:
				quit = true;
				System.out.println("Goodbye!");
				break;
			case 1:
				if (!goingForward) {
					if (listIterator.hasNext())
						listIterator.next();
				}
				goingForward = true;
				if (listIterator.hasNext()) {
					System.out.println("Now visiting " + listIterator.next());
				} else
					System.out.println("Reached end of list");
				goingForward = false;
				break;
			case 2:
				if (goingForward) {
					listIterator.previous();
				}
				goingForward = false;
				if (listIterator.hasPrevious()) {
					System.out.println("Now visiting "
							+ listIterator.previous());
				} else {
					System.out.println("Reached the start on the list");
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
		System.out.println("Available options: ");
		System.out.println("0 - to quit\n" + "1 - next visit\n"
				+ "2 - previous visit\n" + "3 - print menu option");
	}
}
