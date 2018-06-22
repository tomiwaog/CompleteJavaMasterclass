package classesninterfaces.innerclasses;

import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);
	private static Button buttonPrint = new Button("Print");

	public static void main(String[] args) {

		@SuppressWarnings("unused")
		class ClickListener implements Button.OnClickListener {
			// local classes are implemented in a block/method
			//Inner class is inside another Class, not block
			// ClassListener
			public ClickListener() {
				System.out.println("Click Listener has been attached!");
			}

			@Override
			public void onClick(String title) {
				// Overriding contract methods declared implementing Interface
				System.out.println(title + " was clicked!");
			}
		}

		/*
		 * ClickListener myClickListener = new ClickListener(); OR
		 * Button.OnClickListener myClickListener = new ClickListener();
		 * buttonPrint.setOnClickListener(myClickListener); //Passing the object
		 * Format is:
		 * "Interface newOb = new Class (Class implementing the Interface)"
		 */
		// buttonPrint.setOnClickListener(new ClickListener()); //Without create
		// variable for object
		// Line above works since ClickListener Class implements OnClickListener
		// Interface

		buttonPrint.setOnClickListener(new Button.OnClickListener() {
			// Using Anonymous Class without creating a known class that
			// implements the interface
			// Using this method, the definition of Interface's contract methods
			// (all) must be set
			@Override
			public void onClick(String title) {
				System.out.println(title + " was clicked");
			}
		});

		listen();

	}

	private static void listen() {
		boolean quit = false;
		while (!quit) {
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 0:
				quit = true;
				break;
			case 1:
				buttonPrint.onClick();
			}
		}
	}
}
