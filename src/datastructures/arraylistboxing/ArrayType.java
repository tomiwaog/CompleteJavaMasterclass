package datastructures.arraylistboxing;

import java.util.Scanner;

public class ArrayType {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int arrNum[] = getArrNums(5);
		
		for (int i = 0; i < arrNum.length; i++)
			System.out.println("Object at " + i + " is " + arrNum[i]);
		
		getAverage(arrNum);
	}

	private static int[] getArrNums(int num) {
		System.out.println("Enter " + num + " integer nums:");
		int[] newArr = new int[num];
		for (int i = 0; i < newArr.length; i++)
			newArr[i] = scanner.nextInt();
		return newArr;
	}

	//Gets average of numbers
	public static double getAverage(int[] arr){
		double sum = 0;
		for(int eacho : arr)
			sum+=eacho;
		double average = sum / arr.length;
		
		System.out.println(average);
		return average;
	}
}
