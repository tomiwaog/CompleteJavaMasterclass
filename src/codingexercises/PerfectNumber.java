package codingexercises;

public class PerfectNumber {

	public static boolean isPerfectNumber(int number) {
		int totalNum = 0;
		if (number<=0){
			return false;
		}
		for (int i = 1; i <= (number / 2); i++) {
			if (number % i == 0) {
				totalNum += i;
				if (totalNum > number) {
					return false;
				}
			}
		}
		return totalNum == number;
	}

	public static void main(String[] args) {
		System.out.println(isPerfectNumber(7));
	}
}
