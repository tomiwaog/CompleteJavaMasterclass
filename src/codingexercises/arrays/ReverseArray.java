package codingexercises.arrays;

import java.util.Arrays;

public class ReverseArray {

	public static void reverse(int[] array) {
		int[] reversedArr = new int[array.length];
		for (int i = 0; i<array.length; i++) {
			reversedArr[i] = array[(array.length-1)-i];
		}
		
		for (int i=0;i<reversedArr.length;i++){
			array[i]=reversedArr[i];
		}
		
		//Better algo without creating new object and 2*n runtime.
//		int lastItem = array.length-1;
//		for (int i=0;i<array.length/2;i++){
//			int temp =array[i];
//			array[i] = array[lastItem-i];
//			array[lastItem-i]=temp;
//		}
}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		System.out.println("Array: " + Arrays.toString(array));
		reverse(array);
		System.out.println("Reversed Array: " + Arrays.toString(array));
	}
}