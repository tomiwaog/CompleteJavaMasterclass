package microprojects.mobilephone;

import java.util.Scanner;

public class Menu {
	private static Scanner scanner = new Scanner(System.in);

	private static Sim o2 = new Sim("o2", "+44747004280", "Nano");
	private static MobilePhone newPhone = new MobilePhone("Sony Z1", o2);

	public static void main(String[] args) {

		newPhone.pressPowerButton();
		System.out.println(newPhone.viewAllPhoneContent());

		boolean exitMenu = false;
		printMenuOptions();
		while (!exitMenu) {
			System.out.print("\nEnter option (8 for Menu): ");
			int option = scanner.nextInt();
			scanner.nextLine();
			switch (option) {
			case 1:
				addContact();
				break;
			case 2:
				updateContact();
				break;
			case 3:
				removeContact();
				break;
			case 4:
				searchContact();
				break;
			case 5:
				newPhone.printContacts();
				break;
			case 6:
				shutDown();
				exitMenu = true;
				break;
			case 7:
				exitMenu = true;
				break;
			case 8:
				printMenuOptions();
				break;
			default:
				System.out.println("End");
				break;
			}

			if (option != 8)
				System.out.print("\n\nEnter 8 to Print Menu Option");
		}
		System.out.println("Goodbye!!!");
	}

	private static void shutDown() {
		if (newPhone.phoneIsOn()) {
			newPhone.pressPowerButton();
		} else
			System.out.println("Phone is already Off");
	}

	private static void printMenuOptions() {
		System.out.println("\nPress ... \n" + "1. Add Contact\n"
				+ "2. Update Contact\n" + "3. Remove COntact\n"
				+ "4. Search for Contact\n" + "5. View Contact List\n"
				+ "6. Shut Down Phone\n" + "7. Exit");
	}

	private static void searchContact() {
		System.out.println("Enter name of Contact to query: ");
		String contactName = scanner.nextLine();
		if (newPhone.queryContact(contactName) != null) {
			newPhone.printContact(contactName);
		} else {
			System.out.println("SORRY!!! '" + contactName
					+ "' was not found in your contactlist");
			return;
		}
	}

	private static void removeContact() {
		System.out.println("Enter name of Contact to delete: ");
		String contactName = scanner.nextLine();
		if (newPhone.queryContact(contactName) != null) {
			newPhone.removeContact(newPhone.queryContact(contactName));
		} else {
			System.out.println("SORRY!!! '" + contactName
					+ "' was not found in your contactlist");
			return;
		}

	}

	private static void updateContact() {
		System.out.print("Enter existing contact name: ");
		String contactName = scanner.nextLine();
		Contact oldContact = newPhone.queryContact(contactName);
		if (oldContact == null) {
			System.out.println("Couldnt find the Contact you entered");
			return;
		}
		System.out.print("Please enter new name: ");
		String newName = scanner.nextLine();
		Contact newContact = Contact.createContact(newName,
				oldContact.getPhoneNum(), oldContact.getEmail(),
				oldContact.getAddress());
		newPhone.updateContact(oldContact, newContact);
	}

	private static void addContact() {
		System.out.println("Running Add contact!");
		System.out.print("Please Enter new contact's name:");
		String newPersonName = scanner.nextLine();
		System.out.print("Please Enter new contact's Phone Number:");

		String newPersonNum = scanner.nextLine();
		Contact newPerson = Contact.createContact(newPersonName, newPersonNum);
		if (newPhone.addContact(newPerson))
			System.out.println(newPersonName + " has been added!");
		else
			System.out.println("Cannot add +" + newPersonName + " to lisr");
	}
}
