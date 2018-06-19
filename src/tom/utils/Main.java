package tom.utils;
public class Main {
	public static void main(String[] args) {

		int[] myArr = new int[10];
		for (int i = 0; i < myArr.length; i++) {
			myArr[i] = RandNumGenerator.genRandNum();
		}

		int count = 1;
		for (int x : myArr) {
			System.out.println("Item #" + count + " is " + x);
			count++;
		}

		int[] yourArr = RandNumGenerator.insRandomIntArr(new int[15],800);

		count=1;
		System.out.println("");
		for (int x : yourArr) {
			System.out.println("Item #" + count + " is " + x);
			count++;
		}
	}

}
