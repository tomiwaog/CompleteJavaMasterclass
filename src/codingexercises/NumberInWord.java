package codingexercises;

public class NumberInWord {

	public static void printNumberInWord(int number) {
		String numberText = null;
		switch (number) {
		case 0:
			numberText = "ZERO";
			break;
		case 1:
			numberText = "ONE";
			break;
		case 2:
			numberText = "TWO";
			break;
		case 3:
			numberText = "THREE";
			break;
		case 4:
			numberText = "FOUR";
			break;
		case 5:
			numberText = "FIVE";
			break;
		case 6:
			numberText = "SIX";
			break;
		case 7:
			numberText = "SEVEN";
			break;
		case 8:
			numberText = "EIGHT";
			break;
		case 9:
			numberText = "NINE";
			break;
			default:
				numberText = "OTHER";
				break;
		}
		System.out.println(numberText);
	}
}
