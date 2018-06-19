package microprojects;
import java.util.Arrays;
import java.util.Scanner;

public class SortDescending {

	public static void main(String[] args) {
		
		int[] val1 = {1,2,9,4,5,6,7};
        int[] val2 = val1;
        val2[0] = 200;
        System.err.println("Array Value "+val1[0]);
        
        
		int[] myArray = getIntegers(5);
		int[] afterSort = sortArrayDescFlag(myArray);
		printArray(afterSort);
	}

	
	
	
	public static int[] getIntegers(int numOfArray) {
		int[] newArr = new int[numOfArray];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < numOfArray; i++) {
			System.out.print("Enter integer No." + (1 + i) + ": ");
			newArr[i] = sc.nextInt();
		}
		sc.close();
		return newArr;
	}

	public static int[] sortArrayDescending(int[] array) {
		int [] arr = Arrays.copyOf(array,0);
		// Descending Sort using Bubble Sort
		int temp;
		int size = arr.length;
		for (int i = size - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] <= arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

	public static int[] sortArrayDescFlag(int[] arrays) {
		// Sort Array with Flags
		int[] arr = arrays.clone(); //Object must be copied or cloned. 
		int temp = 0;
		boolean flag = true;
		while (flag) {
			flag = false;
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] <= arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = true;
				}
			}
		}
		return arr;
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i != arr.length - 1)
				System.out.print(", ");
		}
	}
}
