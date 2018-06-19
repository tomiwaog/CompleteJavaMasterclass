package codingexercises.arrays;

import java.util.Scanner;

public class MinElement {
	static Scanner scanner = new Scanner(System.in);
	
	public static int[] readIntegers(int count){
		int [] myArr = new int[count];
		for (int i=0; i<count;i++){
			System.out.print("Enter number "+ (1+i)+": ");
			myArr[i]=scanner.nextInt();
			scanner.nextLine();
		}
		scanner.close();
		return myArr;
	}
	
	public static int findMin(int[] arr){
		int min = Integer.MAX_VALUE;
		for (int i=1;i<arr.length;i++){
			min = arr[0];
			if (arr[i]<min){
				min = arr[i];
			}
		}
		return min;
	}

	
	public static void main(String[] args) {
		System.out.print("Enter a count: ");
		int[] arr = readIntegers(scanner.nextInt());
		System.out.println(findMin(arr));
	}
}
