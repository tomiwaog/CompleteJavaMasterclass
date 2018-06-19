package codingexercises;

public class Sum3And5 {

	public static void summer(int number) {
		int total = 0;
		for (int i = 1; i <= number; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + " passed");
				total += i;
			}
		}
		System.out.println("Total is: " + total);
	}

	public static void summer(int number, int max) {
		int total = 0;
		int counter = 0;
		for (int i = 1; i <= number; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				counter++;
				System.out.println(i + " passed");
				total += i;
				if (counter == max) {
					break;
				}
			}
			
		}
		System.out.println("Total is: " + total);
	}

	public static void main(String[] args) {
		summer(1000, 5);

	}
}
