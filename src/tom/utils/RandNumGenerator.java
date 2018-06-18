package tom.utils;
/** 
 * <h1>Random Number Generators</h1>
 * The RandNumGenerator generates numbers in different formats. A simpler library to use.
 * @author Tomiwa ogunbamowo
 * @version 1.0
 * @since 2018-06-18
 * @link https://www.tomiwa.io
 * @param maxNumber This is the upper bound of number to generate. 
 *@param arr in insRandomIntArr(int[] arr, int)This is the array to be passed into the function
 */

public class RandNumGenerator {
	/** 
	 * Generates a random number from 1 to 100. 
	 * Method takes no parameter and return a random number between 1 and 100.
	 */
	public static int genRandNum() {
		return (int) (Math.random() * 100) + 1;
	}
	
	/** 
	 * Generates a random number from 1 to maxNumber(parameter specified). 
	 * Returns a random integer number between 1 and maxNumber.
	 * @param maxNumber This is the maximum number (upper bound) of the random generation.
	 * @return Random integer greater than or equals to 1 and less than or equals to 100.
	 */
	public static int genRandNum(int maxNumber) {
		return (int) (Math.random() * maxNumber) + 1;
	}

	/** Fill up received array with random number between 1 and 100.
	 * 
	 * @param arr The array to be filled or replaced with random numbers
	 * @return an array with random numbers.
	 */
	public static int[] insRandomIntArr(int[] arr) {
		// Inserts and Returns random numbers in the array passed
		for (int i = 0; i < arr.length; i++) {
			arr[i] = genRandNum();
		}
		return arr;
	}
	
	/**
	 * This method takes an array input with maxNumber. the array is filled with random number from 1 to maxNumber
	 * @param arr The array to be manipulated.
	 * @param maxNumber The upperbound of number to be generated for array index.
	 * @return An array with random number from 1 to maxNumber
	 */
	public static int[] insRandomIntArr(int[] arr, int maxNumber) {
		// Inserts and Returns random numbers in the array passed
		for (int i = 0; i < arr.length; i++) {
			arr[i] = genRandNum(maxNumber);
		}
		return arr;
	}
}
