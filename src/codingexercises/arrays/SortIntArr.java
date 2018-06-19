package codingexercises.arrays;

import java.util.Scanner;

public class SortIntArr {

	static int[] arr = new int[0];

	public static void getIntegers() {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many numbers?: ");
		int num = sc.nextInt();
		sc.nextLine();
		arr = new int[num];
		for (int i = 0; i < num; i++) {
			System.out.print("Please enter number #" + (1 + i) + ": ");
			arr[i] = sc.nextInt();
			sc.nextLine();
		}
		sc.close();
	}
	
	public static int[] getIntegers(int number) {
		System.out.println("You can enter "+number+" numbers");
		Scanner sc = new Scanner(System.in);
		int[] myArr = new int[number];
		for (int i = 0; i < number; i++) {
			System.out.print("Please enter number #" + (1 + i) + ": ");
			myArr[i] = sc.nextInt();
			sc.nextLine();
		}
		sc.close();
		return myArr;
	}

	public static void printArrays() {
		for (int x : arr) {
			System.out.print(x + " ");
		}
	}

	public static void printArrays(int[] array) {
		for (int x : array) {
			System.out.print(x + " ");
		}
	}
	
	public static int[] sortIntegers() {
		int[] sortedArr = arr.clone();
		//int [] y = Arrays.copyOf(arr, arr.length); //Alternatives
		int length = sortedArr.length;
		int temp = 0;
		// Using Bubble Sort Big O(n'2)
		// for (int i=(length-1);i>0;i--){
		// for (int j=0;j<length-1;j++){
		// if (sortedArr[j]<sortedArr[j+1]){
		// temp = sortedArr[j];
		// sortedArr[j]= sortedArr[j+1];
		// sortedArr[j+1]=temp;
		// }
		// }
		// }
		// Using Bubble Sort with Flag (Best case O(n))
		boolean flag = true;
		while (flag) {
			flag = false;
			for (int i = 0; i < length - 1; i++) {
				if (sortedArr[i]<sortedArr[i+1]){
					temp = sortedArr[i];
					sortedArr[i]= sortedArr[i+1];
					sortedArr[i+1]= temp;
				}

			}
		}
		arr = sortedArr;
		return arr;
	}

	public static int[] sortIntegers(int[] array) {
		//Parameterised version
		int[] sortedArr = array;
		int length = sortedArr.length;
		int temp = 0;

		boolean flag = true;
		while (flag) {
			flag = false;
			for (int i = 0; i < length - 1; i++) {
				if (sortedArr[i]<sortedArr[i+1]){
					temp = sortedArr[i];
					sortedArr[i]= sortedArr[i+1];
					sortedArr[i+1]= temp;
				}

			}
		}
		return sortedArr;
	}
	public static void main(String[] args) {
//		getIntegers();
//		sortIntegers();
//		printArrays();
		
		int[] x = getIntegers(5);
		printArrays(sortIntegers(x));

	}
}
