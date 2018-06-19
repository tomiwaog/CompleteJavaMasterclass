package failCodes;

public class NumberSpeller {

	public static void spellNumber(int number) {
		while (number > 0) {
			System.out.println(speller(number));
			number %= (countDigits(number)*10);
		}

	}

	public static int countDigits(int number) {
		int counter = 0;
		while (number > 0) {
			number /= 10;
			counter++;
		}
		return counter; //
	}

	public static String speller(int number) {
		@SuppressWarnings("unused")
		int maths = 1;
		String words = "";
		int counter = countDigits(number);
		switch (counter) {
		case 1:
			maths = 1;
			break;
		case 2:
			maths = 10;
			break;
		case 3:
			maths = 100;
			words = "hundred";
			break;
		case 4:
			maths = 1000;
			words = "thousand";
			break;
		default:
			maths = -1;
			break;
		}
		return Integer.toString(getFirstNum(number)) + " " + words;
		// return (number/maths)*maths;
	}

	public static int getFirstNum(int number) {
		while (number > 10) {
			number /= 10;
		}
		return number;
	}

	public static void main(String[] args) {
		// System.out.println(countDigits(5200));
		spellNumber(5484);
		// System.out.println(speller(5484));
	}

}
