package noteandpractice;

//Access modifier tests
class Printable {

	public static void main(String args) {
		System.out.println("Hello exam 2");
	}

	public static void main(String args[]) {
		System.out.println("Hello exam"); // Only this will run as it matches
											// the signature required to make it
											// executable.
	}

	public static void main(int number) {
		System.out.println("Hello exam 3");
	}

	public static void main(String[] main, String hey) {
		String hello = "I was always here in the summer";
		String[] myArr = hello.split(" ");
		int count = 0;
		for (String i : myArr) {
			System.out.println(count + " is : " + i);
			count++;
		}

		Hello newHello = new Hello();
		// newHello.hello(); //can't access method as its private to the class
		// alone.
		newHello.exNum(); // this however is accessing as it is package
							// protected.
	}
}

class Hello {
	private int i = myNum(); //Class only accessibility

	private int myNum() {
		return 50000;
	}

	int exNum() {
		return (i-1);
	}
}
