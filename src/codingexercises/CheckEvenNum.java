package codingexercises;

public class CheckEvenNum {

	public static boolean isEvenNumber(int num) {
		return (num % 2 == 0);
	}

	public static void findEven(int minNum, int maxNum) {
		int evenCounter = 0;
		do {
			minNum++;
			if (!isEvenNumber(minNum)) {
				continue;
			}
			evenCounter++;
			System.out.println(minNum + " is Even");
			
			if (evenCounter == 5) {
				break;
			}
		} while (minNum < maxNum);
		System.out.println(evenCounter + " total number of even found");
	}

	public static void main(String[] args) {
		findEven(4, 20);
	}
}
