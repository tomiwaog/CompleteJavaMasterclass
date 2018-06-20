package microprojects.mobilephone;

import java.util.ArrayList;

public class MobilePhone {
	private String brandModel;
	private int battery = 100;
	private boolean phoneIsOn = false;
	private ArrayList<Contact> contactsList;
	private Sim phoneSim;

	public void setSim(Sim simCard) {
		phoneSim = simCard;
	}

	private Sim getSim() {
		if (phoneIsOn()) {
			return phoneSim;
		} else {
			System.out.println("Turn on phone to see Sim Details");
			return null;
		}
	}

	public String getPhoneDetails() {
		return "\nPhone : " + brandModel + "\tBattery left :" + battery
				+ "%\tPhone ON: " + phoneIsOn();
	}

	public MobilePhone(String brandModel, Sim phoneSim) {
		this.brandModel = brandModel;
		this.phoneSim = phoneSim;
		this.contactsList = new ArrayList<Contact>();
	}

	public String printPhoneStatus() {
		String state;
		if (phoneIsOn())
			state = "ON";
		else
			state = "OFF";
		return "Phone is currently: " + state;
	}

	public boolean phoneIsOn() {
		return phoneIsOn;
	}

	public void pressPowerButton() {
		if (phoneIsOn()) {
			this.phoneIsOn = false;
			System.out.println("Phone is shutting down");
		} else {
			this.phoneIsOn = true;
			System.out.println("Phone is starting!");
		}
	}

	public void viewContactList() {
		if (contactsList.size()<=0){
			System.out.println("Sorry! Your contact list is Empty.");
		}else
		for (int i = 0; i < contactsList.size(); i++) {
			System.out.println(contactsList.get(i).getContactDetails());
		}
	}

	public String viewAllPhoneContent() {
		System.out.println("View All phone contents: ");
		return getSim().getSimDetails() + getPhoneDetails();
	}

	// Add new Contact Object
	public boolean addContact(Contact person) {
		if (findContact(person) < 0) {
			contactsList.add(person);
			System.out.println(person.getName()+" added!");
			return true;
		} else {
			System.out.println("Contact already exist");
			return false;
		}
	}

	// Returns index of Contact Object
	private int findContact(Contact contact) {
		return contactsList.indexOf(contact);
	}
	
	// Find contact on file
	private int findContact(String contactName) {
		for (Contact x: contactsList) {
			if (x.getName().equals(contactName)) {
				return findContact(x);
			}
		}
		return -1;
	}
	
	//Alternative code to the method findContact(String)
//	private int findContact(String contactName) {
//		for (int i = 0; i < contactsList.size(); i++) {
//			Contact contact = contactsList.get(i);
//			if (contact.getName().equals(contactName)) {
//				int location = i;
//				return location;
//			}
//		}
//		return -1;
//	}


	//Extra Method - Query Contact for Search function
	public String queryContact(Contact contact){
		if (findContact(contact)>=0){
			return contact.getName();
		}
		return null;
	}
	
	//Query Contact
	public Contact queryContact(String contactName){
		int position = findContact(contactName);
		if (position >=0){
			return contactsList.get(position);
		}
		return null;
	}
	
	// Removes Contact if found!
	public boolean removeContact(Contact keyContact) {
		// stores the location of the COntact whose name is name
		int location = findContact(keyContact);
		if (location >= 0) {
			this.contactsList.remove(location);
			return true;
		}
		return false;
	}

	// Update or replace Contact Object
	public boolean updateContact(Contact oldContact, Contact newContact) {
		int oldContactIndex = findContact(oldContact);
		if (findContact(newContact.getName()) !=-1){
			System.out.println("New Contact already Exist. Update not successful");
			return false;
		}
		else if (oldContactIndex >= 0) { //If old Count is found
			this.contactsList.set(oldContactIndex, newContact);
			System.out.println(oldContact.getName()+ " was successfully replaced by "+ newContact.getName());
			return true;
		}
		else{
			System.out.println("Cannot replace your contact as He or She doesn't exist");
			return false;
		}
	}

	// Modify Contact if found
	public boolean modifyContactName(String currContact, String newContact) {
		int position = findContact(currContact);
		if (position >= 0) {
			contactsList.get(position).setName(newContact);
			System.out
					.println(currContact + " was replaced with " + newContact);
			return true;
		}
		System.out.println("Cannot find " + currContact);
		return false;
	}

	public void displayContact(String name) {
		if (findContact(name) >= 0) {
			int loc = findContact(name);
			String result = contactsList.get(loc).getContactDetails();
			System.out.println(result);
		}
	}
}
