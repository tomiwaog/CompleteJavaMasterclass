package codingexercises;

public class FlourPackProblem {

	public static boolean canPack(int bigCount, int smallCount, int goal) {

		if (bigCount < 0 || smallCount < 0 || goal < 0) {
			return false;
		}
		int bigSize = 5;
		int totalBig = bigSize * bigCount;

		for (int i = bigSize; i <= totalBig; i += 5) {
			if (i == goal) {
				return true;
			}
			for (int j = 1; j <= smallCount; j++) {
				if (j == goal) {
					return true;
				} else if (i + j == goal) {
					return true;
				}
			}
		}

		for (int small = 1; small <= smallCount; small++) {
			if (small == goal) {
				return true;
			}
			for (int j = 5; j <= totalBig; j+=5) {
				if (j == goal) {
					return true;
				} else if (small + j == goal) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// System.out.println(canPack(1, 0, 4));
		//System.out.println(canPack(1, 0, 5));
		//System.out.println(canPack(0, 5, 4));
		// System.out.println(canPack(2, 2, 12));
		// System.out.println(canPack(-3, 2, 12));
		// System.out.println(canPack(1, 0, 6));
		// System.out.println(canPack(2, 1, 5));
		System.out.println(canPack(5,3,24));
	}
}
