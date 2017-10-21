package javamasterclass;

public class CharAndBoolean {

	public static void main(String[] args) {
		//width of 16 (2 bytes)
		char myChar = '\u00A9'; //Unicode
		
		System.out.println(myChar);
		
		@SuppressWarnings("unused")
		boolean myBool = true;
		
		//Registered symbol on Copyright
		System.out.println('\u00AE');
		
		
		//Boolean operator
		boolean myCar = false;
		if (myCar)
			System.out.println("My car runs");
		
		//Ternary operator
		boolean yourCar = myCar? false: true; //if myCar is true, print False, else True
		System.out.println(yourCar);
	}

}
