package noteandpractice;

public class CatchingErrors {

	public static void main(String[] args) {

		// You mustn't catch an Error, but here's a demonstration
		try {
			myMethod();
		}
		catch (StackOverflowError s) {
			for (int i=0;i<2;++i)
				System.out.println(i);
			//throw new FullMemory();
		}
	}

	public static void myMethod() {
		myMethod();
	}
}

@SuppressWarnings("serial")
class FullMemory extends StackOverflowError {

}