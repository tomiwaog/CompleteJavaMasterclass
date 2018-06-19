package codingexercises;

public class FirstAndLastDigitSum {

	public static int sumFirstAndLastDigit(int number) {
		if (number < 0) {
			return -1;
		}
		int firstNumber = number;
		int lastNumber = number % 10;

		while (firstNumber >= 10) {
			firstNumber /= 10;
		}
		return firstNumber + lastNumber;
	}

	public static void main(String[] args) {
		System.out.println("Sum of First and Last number is "
				+ sumFirstAndLastDigit(63543));
	}
}
