package codingexercises;

public class NumberPalindrome {

	public static boolean isPalindrome(int number) {
		if (number < 0) {
			System.out.println("Number was " + number);
			number *= -1;
		}

		System.out.println("Number is now " + number);
		int inputNum = number;
		int reversedNum = 0;
		while (inputNum > 0) {
			reversedNum *= 10;
			reversedNum += inputNum % 10;

			inputNum = inputNum / 10;
		}

		return (number == reversedNum);
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome(43234));
		System.out.println(isPalindrome(43254));
		System.out.println(isPalindrome(101));
		System.out.println(isPalindrome(-222));

	}
}
