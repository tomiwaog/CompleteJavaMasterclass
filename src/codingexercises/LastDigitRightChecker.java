package codingexercises;

public class LastDigitRightChecker {
//Checks if at least 2 numbers have same rightmost last digits
	public static boolean hasSameLastDigit(int x, int y, int z) {
		if (x < 10 || x > 1000 || y < 10 || y > 1000 || z < 10 || z > 1000) {
			return false;
		}

		int lastX = x % 10;
		int lastY = y % 10;
		int lastZ = z % 10;
		x /= 10;

		if (lastX == lastY || lastX == lastZ || lastY == lastZ) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(hasSameLastDigit(41,22,71));
		System.out.println(hasSameLastDigit(23,32,42));
		System.out.println(hasSameLastDigit(9,99,999));
	}
}
