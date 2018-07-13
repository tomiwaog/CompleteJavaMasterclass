package noteandpractice;

public class ImplictNExplicitCasting {

	public static void main(String[] args) {

		// WHOEVER SAYS SIZE DONT MATTERS
		System.out.println("Char is: " + Character.MAX_VALUE);
		System.out.println("Byte is: " + Byte.MAX_VALUE);
		System.out.println("short is: " + Short.MAX_VALUE);
		System.out.println("int is: " + Integer.MAX_VALUE);
		System.out.println("Long is: " + Long.MAX_VALUE);
		System.out.println("Float is: " + Long.MAX_VALUE);
		System.out.println("Double is: " + Double.MAX_VALUE);

		char char1 = 'b';
		byte byte2 = 2;
		short short3 = 3;
		int int4 = 4;
		long long5 = 5;
		float float6 = 6;
		double doubl7 = 7;

		
		// Short requires casting for size Integer, Long, Float and double and Char since char is stored as int
		char1 = (char)char1; // requires explicit casting to compile
		char1 = (char)byte2; // requires explicit casting to compile
		char1 = (char)short3; // requires explicit casting to compile
		char1 = (char) int4; // requires explicit casting to compile
		char1 = (char) long5; // requires explicit casting to compile
		char1 = (char) float6; // requires explicit casting to compile
		char1 = (char) doubl7; // requires explicit casting to compile
		
		// Byte requires casting for size Integer, Long, Float and double and Char since char is stored as int
		byte2 = (byte)char1; // requires explicit casting to compile
		byte2 = (byte)short3; // requires explicit casting to compile
		byte2 = (byte) int4; // requires explicit casting to compile
		byte2 = (byte) long5; // requires explicit casting to compile
		byte2 = (byte) float6; // requires explicit casting to compile
		byte2 = (byte) doubl7; // requires explicit casting to compile
		
		// Short requires casting for size Integer, Long, Float and double and Char since char is stored as int
		short3 = (short)char1; // requires explicit casting to compile
		short3 = byte2;
		short3 = (short) int4; // requires explicit casting to compile
		short3 = (short) long5; // requires explicit casting to compile
		short3 = (short) float6; // requires explicit casting to compile
		short3 = (short) doubl7; // requires explicit casting to compile

		// Integer requires casting for size Long, Float and double
		int4 = char1;
		int4 = byte2;
		int4 = short3;
		int4 = (int) long5; // requires explicit casting to compile
		int4 = (int) float6; // requires explicit casting to compile
		int4 = (int) doubl7; // requires explicit casting to compile

		// Long requires casting for size Float and double
		long5 = char1;
		long5 = byte2;
		long5 = short3;
		long5 = int4;
		long5 = (long) float6; // requires explicit casting to compile
		long5 = (long) doubl7; // requires explicit casting to compile

		// Float requires casting for size double
		float6 = char1;
		float6 = byte2;
		float6 = short3;
		float6 = int4;
		float6 = long5;
		float6 = (float) doubl7; // requires casting to compile

		// Implicit casting done by compiler for Double
		doubl7 = char1;
		doubl7 = byte2;
		doubl7 = short3;
		doubl7 = int4;
		doubl7 = long5;
		doubl7 = float6;

	}
}
