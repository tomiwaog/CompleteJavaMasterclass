package noteandpractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionPractice {
	public static void main(String[] args) {

		// Demonstrating double return in Try catch block. i.e. return in catch
		// and finally
		DualReturn dual = new DualReturn();
		System.out.println("In main :" + dual.getInt());

		//Try block with Finally only
		try{
			System.out.println(4/2);
		}
		finally{
			
		}
		String str = "Infinity";
		System.out.println("Char at 5 is " + str.charAt(5));
		try {
			System.out.println("Char at 15 is " + str.charAt(15));
		} catch (StringIndexOutOfBoundsException s) {
			System.out
					.println("There is no char at that index. index is higher than length-1. | "
							+ s);
		}

		if (str.length() > 3) {
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

		try {
			myChEx();
		} catch (FileNotFoundException e) {
			System.out.println("Cant find file | " + e);
			try {
				throw new NullPointerException();
			} catch (NullPointerException nuller) {
				System.out.println("Object is null my friend | " + nuller);
			}
		}
	}

	// Checked Exceptions requires declaration.
	static void myChEx() throws FileNotFoundException {
		FileInputStream y = new FileInputStream("");
		System.out.println("my ChEx method ends!");
	}
}

class RE extends ArrayIndexOutOfBoundsException {
	public String toString() {
		return "RE stands for RuntimeException";
	}
}

class DualReturn {
	int getInt() {
		int returnVal = 10;
		try {
			String[] students = { "Aaa", "Bbb" };
			System.out.println(students[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("about to return " + returnVal);
			return returnVal;
		} finally {
			returnVal +=10;
			System.out.println("Return value is now "+ returnVal);
		}
		return returnVal;
	}
}