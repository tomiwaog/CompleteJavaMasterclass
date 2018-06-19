package codingexercises;

public class NumberToWords {

	public static void numberToWords(int number) {
		if (number < 1) {
			System.out.println("Invalid Value");
		}
		int inputNum = number;
		int revNum = reverse(number); //
		number = revNum;
		// System.out.println(number);

		String strNum;
		while (number > 0) {
			int lastDigit = number % 10;
			number /= 10;

			switch (lastDigit) {
			case 0:
				strNum = "Zero";
				break;
			case 1:
				strNum = "One";
				break;
			case 2:
				strNum = "Two";
				break;
			case 3:
				strNum = "Three";
				break;
			case 4:
				strNum = "Four";
				break;
			case 5:
				strNum = "Five";
				break;
			case 6:
				strNum = "Six";
				break;
			case 7:
				strNum = "Seven";
				break;
			case 8:
				strNum = "Eight";
				break;
			case 9:
				strNum = "Nine";
				break;
			default:
				strNum = "DONT KNOW";
				break;
			}
			System.out.print(strNum + " ");

		}
		if (getDigitCount(inputNum) > getDigitCount(revNum)) {
			for (int i = 0; i < getDigitCount(inputNum) - getDigitCount(revNum); i++) {
				System.out.print("Zero ");
			}
		}

	}

	public static int reverse(int number) {
		int revNum = 0;
		boolean isNumNeg = (number < 0);
		if (isNumNeg)
			number *= -1; // Temporarily convert
		while (number > 0) {
			int lastDigit = number % 10;
			number /= 10;
			// Adds last digit to a new reversed Digit
			revNum *= 10;
			revNum += lastDigit;
		}
		if (isNumNeg) {
			return -revNum;
			
		}
		return revNum;
	}

	public static int getDigitCount(int number) {
		if (number < 0) {
			return -1;
		}

		int counter = 0;
		if (number == 0) {
			return 1;
		}
		while (number > 0) {
			number /= 10;
			counter++;
		}
		return counter;
	}

	public static void main(String[] args) {
		System.out.println(getDigitCount(101));
		System.out.println("Reverse is " + reverse(101));
		numberToWords(101);

		System.out.println("\n\n*********************************\n");
		System.out.println(getDigitCount(101));
		System.out.println("Reverse is " + reverse(10));
		numberToWords(10);
	}
}
