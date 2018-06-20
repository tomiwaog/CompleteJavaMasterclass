package codingexercises;

import java.util.Scanner;

public class ReadUserInput {

	public static void readUserInput(int maxItem) {

		if (maxItem > 0) {
			System.out.println("You can add up to " + maxItem + " numbers.");
			Scanner sc = new Scanner(System.in);
			int counter = 1;
			int sum = 0;

			while (counter <= maxItem) {
				System.out.print("Enter your number " + counter + ": ");
				if (sc.hasNextInt()) {
					counter++;
					sum += sc.nextInt();
				} else {
					System.out.println("Invalid number\n");
				}
				sc.nextLine(); // Next Line Character handle
			}
			sc.close();
			System.out.println("Sum = " + sum);
		} else {
			System.out.println("These method only take positive Number");
		}
	}

	public static void main(String[] args) {
		readUserInput(3);
	}
}