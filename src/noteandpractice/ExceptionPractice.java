package noteandpractice;

public class ExceptionPractice {
	public static void main(String[] args) {
		String str = "Infinity";

		System.out.println("Char at 5 is " + str.charAt(5));

		try {
			System.out.println("Char at 15 is " + str.charAt(15));
		} catch (StringIndexOutOfBoundsException s) {
			System.out
					.println("There is no character at that index. index is higher than length-1. | "
							+ s);
		}

		if (str.length() > 3) {
			System.out.println("about to throw ArrayIndexOutOfBoundsException");
			try {
				// Unchecked Exceptions doesn't follow declare-or-handle rule
				throw new RE();

				// Checked exception such as FileNotFoundException however must
				// follow the rule
				// throw new FileNotFoundException();
			} catch (ArrayIndexOutOfBoundsException x) {
				System.out.println(x);
			}
		}
		System.out.println("Thrown ArrayIndexOutOfBoundsException");
	}

}

class RE extends ArrayIndexOutOfBoundsException {

	public String toString() {
		return "RE stands for RuntimeException";
	}
}
