package codingexercises;

public class AnySameDigitChecker {
	//Checks if at least 2 numbers have same digits
	public static boolean hasAtLeastSameDigits(int x, int y, int z) {
		if (x < 10 || x > 1000 || y < 10 || y > 1000 || z < 10 || z > 1000) {
			return false;
		}

		while (x > 0) {
			int lastX = x % 10;
			x /= 10;

			while (y > 0) {
				int lastY = y % 10;
				y /= 10;

				while (z > 0) {
					int lastZ = z % 10;
					z /= 10;
					if (lastX == lastY || lastX == lastZ || lastY == lastZ) {
						return true;
					}
				}

			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(hasAtLeastSameDigits(237, 409, 681));
	}
}
