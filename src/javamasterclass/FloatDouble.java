package javamasterclass;

public class FloatDouble {
	
	static double convertPtoKilo(int pound){
		double onePound = 0.45359237d;
		return pound*onePound;
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//width of 32 (4 bytes)
		float myFloat =5.5f; //Helps identify it as float. Double otherwise
		//width of 64 (8 bytes)
		double myDouble = 5.5d; //Java always assume number w/ decimal is DOUBLE
		float anotherFloat = (float)5.5; //Casting helps without the F		
		
		//Double is far more precise, 16 digits of precision
	
		//Convert £1 to kilograms
		System.out.println(convertPtoKilo(200));
	}

}
