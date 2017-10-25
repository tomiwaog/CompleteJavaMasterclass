package Projects;

public class SortArrayDescend {

	public static void main(String[] args) {
		int[] arr = { 5, 8, 3, 1, 9, 6, 11, 0, 8, -8 };
		int resultArr[] = sortIntArray(arr);

		for (int eacho : resultArr) {
			System.out.println("order: " + eacho);
		}
	}

	public static int[] sortIntArray(int[] arr) {
		int temp = 0;

		// Using bubble sort O(n^2)
		for (int j = arr.length - 2; j > 0; j--)
			for (int i = 0; i <= j; i++) {
				if (arr[i] < arr[i + 1]) {
					temp = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = temp;
				}
			}
		return arr;
	}
}
