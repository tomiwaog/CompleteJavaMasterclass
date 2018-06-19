package javamasterclass;

public class ByteShortInt {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		//int has width of 8bits (1 byte)
	
		byte minByte = -128; //-2**7
		byte maxByte = 127; //2**7-1
		
		//Short has width of 16bits (2 bytes)
		short minShort = -32768; //-2**16
		short maxShort = 32767; //2**16-1
		
		//int has width of 32 (4 bytes)
		int minint = -2147483648; //-2**31
		int maxInt = 2_147_483_647;//2**31-1
		
		//Long has a width of 64 (8 bytes)
		long minLong = -9_223_372_036_854_775_808L; //-2**63
		long maxLong =  9_223_372_036_854_775_807L; //2**63-1


		long var = 50000L+ 10L*(10+20+50);
		System.out.println(var);
		

	}

}
