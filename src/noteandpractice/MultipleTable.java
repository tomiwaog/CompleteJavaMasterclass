package noteandpractice;

public class MultipleTable {
	static int multipleMatrix[][];
	static int maxTable;

	public static void main(String[] args) {
		getMultipleTable(5);
		printArr(4);
		printAll();

	}

	private static boolean printArr(int num) {
		if (num <= maxTable) {

			for (int j = 0; j < 12; j++) {
				System.out.println(num + " x " + (j + 1) + " = "
						+ multipleMatrix[4][j]);
			}
			return true;
		}
		System.out.println("Invalid num");
		return false;
	}

	static void getMultipleTable(int timesTable) {
		maxTable = timesTable;
		multipleMatrix = new int[timesTable][12];
		for (int i = 0; i < timesTable; i++) {

			for (int j = 0; j < 12; j++) {
				multipleMatrix[i][j] = ((i + 1) * (j + 1));
			}
		}
	}

	static void printAll() {
		for (int i = 0; i < maxTable; i++) {
			for (int j = 0; j < 12; j++) {
				System.out
						.println(i + " x " + j + " = " + multipleMatrix[i][j]);
			}
			System.out.println();
		}
	}
}
