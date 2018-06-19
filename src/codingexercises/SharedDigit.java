package codingexercises;

public class SharedDigit {

	public static boolean hasSharedDigit(int x, int y) {
		if ((x < 10) || (x > 99) || (y < 10) || (y > 99)) {
			return false;
		}
		while (x > 0) {
			int lastX = x % 10;
			x /= 10;

			while (y > 0) {
				int lastY = y % 10;
				y /= 10;
				if (lastX == lastY) {
					return true;
				}
			}

		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(hasSharedDigit(12, 23));
		System.out.println(hasSharedDigit(9, 99));
		System.out.println(hasSharedDigit(15, 55));
	}
}
