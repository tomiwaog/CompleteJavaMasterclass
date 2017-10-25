package Projects;
//Using Bubble Sort Sorting Algo
public class SortArrayDescend {

	public static void main(String[] args) {
		//First Algo on Unsorted Array
		System.out.println("\t* Using First Algo, Bubble Sort withOUT Flag.\n");
		int[] unsortedArr = { 5, 8, 3, 1, 55, 9, 6, 11, 0, 8, -8, -23, -45, 6, 1, -1, -2, -3, -4, -5, -6 };
		int resultArr[] = sortIntArray(unsortedArr); //Sorting unsorted Array with Bubble Sort
		for (int eacho : resultArr) {
			System.out.print(eacho + " ");
		}
		System.out.println("\n");
		
		//First Algo on Sorted Array
		int[] sortedArr = {21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};		
		resultArr = sortIntArray(sortedArr);
		for (int eacho : resultArr) {
			System.out.print(eacho + " ");
		}
		System.out.println("");
		
		
		//Using Second Algo with Flag
		System.out.println("\n\n\t* Using Second Algo, Bubble Sort with Flag.\n");
		int[] unsortedArr2= { 5, 8, 3, 1, 55, 9, 6, 11, 0, 8, -8, -23, -45, 6, 1, -1, -2, -3, -4, -5, -6 };
		resultArr = sortIntArrayFlag(unsortedArr2);
		for (int eacho : resultArr) {
			System.out.print(eacho + " ");
		}
		System.out.println("");
		
		int[] sortedArr2 = {21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};	
		resultArr = sortIntArrayFlag(sortedArr2);
		for (int eacho : resultArr) {
			System.out.print(eacho + " ");
		}
	}

	public static int[] sortIntArray(int[] arr) {
		System.out.println("Expected iteration is ["+arr.length +" - "+1 + "]: "+(arr.length - 1));
		int temp = 0;
		int swapCount = 0;
		// Using bubble sort O(n^2)
		for (int j = arr.length - 2; j >= 0; j--) {
			swapCount++;
			for (int i = 0; i <= j; i++) {
				if (arr[i] < arr[i + 1]) {
					temp = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = temp;

				}
			}
		}
		System.out.println("Iteration count: " + swapCount);
		return arr;
	}

	public static int[] sortIntArrayFlag(int[] arr) {
		int temp = 0;
		int swapCount = 0;
		// Using bubble sort O(n^2) with Flag Counter
		boolean flag = true;
		while (flag) {
			flag = false;
			swapCount++;
			for (int i = 0; i <= arr.length - 2; i++) {
				if (arr[i] < arr[i + 1]) {
					temp = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = temp;
					flag = true;
				}
			}
		}
		System.out.println("Iteration count: " + swapCount);
		return arr;
	}
}
