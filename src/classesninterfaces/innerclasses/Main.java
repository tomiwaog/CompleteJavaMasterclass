package classesninterfaces.innerclasses;

import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);
	private static Button buttonPrint = new Button("Button Print 1");

	public static void main(String[] args) {

//		Button b = new Button("Button B");
//		Tom x = new Tom();
//		b.setOnClickListener(x);
//		b.onClick();]
//	
		
		// Local Class
		class ClickListener implements Button.OnClickListener {
			// local classes are implemented in a block/method
			//Inner class is inside another Class, not block
			// ClassListener
			public ClickListener() { 
				System.out.println("Local Class Click Listener invoked!");
			}

			@Override
			public void onClick(String title) {
				// Overriding contract methods declared implementing Interface
				System.out.println(title + " was clicked!");
			}
		}
		ClickListener local = new ClickListener();
		buttonPrint.setOnClickListener(local);
		listen();
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

		//Anonymous Class (Local Class without )
		buttonPrint.setOnClickListener(new Button.OnClickListener() {
			// Using Anonymous Class without creating a known class that
			// implements the interface
			// Using this method, the definition of Interface's contract methods
			// (all) must be set
			@Override
			public void onClick(String title) {
				System.out.println(title + " was clicked from an anonymous class!");
			}
		});
		listen();

	}

	private static void listen() {
		boolean quit = false;
		while (!quit) {
			System.out.println("Enter 0 to Quit, 1 to click button");
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
