package noteandpractice;

public class CatchingErrors {

	public static void main(String[] args) {

		// You mustn't catch an Error, but here's a demonstration
		try {
			myMethod();
		} catch (StackOverflowError s) {
			System.out.println("\naaaaCaught an Error stopping now!");
			throw new FullMemory();
		}
	}

	public static void myMethod() {
		System.out.println("Running my Method!");
		myMethod();
	}
}

@SuppressWarnings("serial")
class FullMemory extends StackOverflowError {

}