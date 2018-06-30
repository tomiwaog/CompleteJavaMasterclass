package noteandpractice;

public class Dog {
	static int foodNutrient; //Can be changed but all object witness change
	static final int OWNERS =81; //Cannot be changed, by any objects, so its static anyway
	
	private String name;
	//private static String name; //Static version
	
	public Dog(String name){
		this.name = name;
	}
	
	public void printName(){
		System.out.println("Name = "+ name);
	}
}



