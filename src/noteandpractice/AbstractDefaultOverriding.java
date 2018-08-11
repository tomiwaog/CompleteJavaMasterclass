package noteandpractice;

interface AnimalsInt {
	public default String getName(){
		return null;
	}
	
	default String getHobbie(){
		return null;
	}
	
	abstract void getNothing();
}

interface Mammal{
	public default String getName(){
		return null;
	}
	
	static String getHobbie(){
		return null;
	}
	
	abstract void getNothing();
}

public abstract class AbstractDefaultOverriding implements Mammal, AnimalsInt{
	public abstract String getName(); //Same default methods must be overridden if implemented by the same class
	
	//getHobbie needs no overriding - no ambiguity since one of the methods is static
	//getNothing also needs no overriding since implementing method would have to override the method anyway
}