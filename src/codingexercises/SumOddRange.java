package codingexercises;

public class SumOddRange {

	public static boolean isOdd(int number) {
		if (!(number > 0)) {
			return false;
		}
		return number % 2 == 1;
	}

	public static int sumOdd(int start, int end) {
		int sumCalc = 0;
		if (start <= 0 || end <= 0) {
			return -1;
		}
		
		if (end >= start) {
			for (int i = start; i <= end; i++) {
				if (isOdd(i)){
					sumCalc+=i;
				}
			}
			return sumCalc;
		}
		return -1;
	}
	
	public static void main(String[] args) {

		System.out.println(sumOdd(1, 100));
		System.out.println(sumOdd(-1, 100));
		System.out.println(sumOdd(100, 100));
		System.out.println(sumOdd(100, -100));
		System.out.println(sumOdd(100, 1000));
	}
}
