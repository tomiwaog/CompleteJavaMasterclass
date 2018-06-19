package codingexercises;

public class DiagonalStar {

	public static void printSquareStar(int number) {
		int pass = 2;

		if (number < 5) {
			System.out.println("Invalid Value");
			pass = 0;
		}
		if (pass>0) {
			for (int i = 1; i <= number; i++) {
				for (int j = 1; j <= number; j++) {
					if (i == (number - (number - 1)) || i == number
							|| j == (number - (number - 1)) || j == number
							|| i == j || j == (number + 2) - (i + 1)) {
						System.out.print("*");
					} else
						System.out.print(" ");
				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		printSquareStar(5);
	}
}
