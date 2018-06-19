package codingexercises;

public class DigitSum {

	public static int sumDigits(int number) {
		int sum = 0;
		if (number < 0 || number <= 9) {
			return -1;
		}
		while (number > 10) {
			sum += (number % 10);
			number /= 10;
		}
		sum += number;
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(sumDigits(32123));
	}
}
