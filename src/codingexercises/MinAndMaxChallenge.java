package codingexercises;

import java.util.Scanner;

public class MinAndMaxChallenge {
//Flag included to cater for Negative Numbers
	public static void getMinMaxNumber(int numbers) {
		int min = 0, max = 0;
//		/boolean minChanged = false, maxChanged = false;#
		
		/* Without USing FLAGS
		 * Set min = maxInteger Possible (2147.. or Integer.Max_Value) 
		 * Set max = minInteger Possible. (-2147... or Integer.Min_Value)
		 */
		boolean minMaxChanged = false;
		int counter = 1;
		Scanner scanner = new Scanner(System.in);

		System.out.println("You can enter " + numbers + " numbers.");
		while (counter <= numbers) {
			System.out.print("Enter number #" + counter + ": ");
			if (scanner.hasNextInt()) {
				int inputNum = scanner.nextInt();
				
				// Better Algo - First item changes the default values
				if (!minMaxChanged){
					min = inputNum;
					max = inputNum;
					minMaxChanged = true;
				}
				
				if (inputNum < min)
					min = inputNum;
				if (inputNum>max)
					max =inputNum;

				//Alternative - Old Algorithm - Checks flag each time
//				if (!minChanged) {
//					min = inputNum;
//					minChanged = true;
//				} else {
//					if (inputNum <= min) {
//						min = inputNum;
//					}
//				}
//				if (!maxChanged) {
//					max = inputNum;
//					maxChanged = true;
//				} else {
//					if (inputNum >= max) {
//						max = inputNum;
//					}
//				}
				counter++;
			} else {
				System.out.println("Invalid value\n");
				//break; Can be used to interrupt the numbers of iteration
			}
			scanner.nextLine();
		}
		scanner.close();
		System.out.println("MIN: " + min + " | MAX: " + max);
	}

	public static void main(String[] args) {
		getMinMaxNumber(5);
	}
}