package ds.arraylistboxing.autoboxing;

/**
 * TomNumber is an attempt of a wrapper class for primitive int type
 * @author Tomiwa Ogunbamowo
 *
 */
public class TomNumber {
	static int x;
	private int objectValue;
	
	
	public TomNumber(int integer){
		objectValue=integer;
	}

	/**
	 * Auto-boxing - converting int value to Class type
	 * @param integer
	 * @return - Returns an Integer instance with the specified int value.
	 */
	public static TomNumber valueOf (int integer){
		x=integer;
		return new TomNumber(x);
	}
	
	//Unboxing - converting back to primitive type
	public int intValue(){
		return objectValue;
	}
	
	
	
}
