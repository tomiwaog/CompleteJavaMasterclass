package noteandpractice;

import java.util.function.Predicate;

public class House {
	// Polymorphism demonstration
	Number printNum() {
		return 30;
	}


	public static void main(String[] args) {
		House house = new House();
		House room = new Room();
		System.out.println(house.printNum());
		System.out.println(room.printNum());
		
		Room realRoom = new Room();
		Object x = new String("Object");
		realRoom.resize(x);

		//Lambda use must be functional interface - interface with one abstract method
		@SuppressWarnings("unused")
		lambdaEx exp = fun -> 5 >3;
		System.out.println();
		
		Predicate<Integer> pre = param -> 4*6>30;
		System.out.println("Pre test is: "+pre.test(4));
		
	}
}

class Room extends House implements Resizable{

	@Override
	Integer printNum() {
		// Override of Class with subclass demonstration.
		return 15;
	}
	
	//In order to override only co-variant return type can be different, covariant type doesnt apply to Paramater list
	//If this method is commented out, then the base version will run
	@Override
	public String resize(Object obj){
		System.out.println("Object param version of Resize. Return type: String");
		return null;
	}

	//is not an overriden method, instead an overloaded one.
	public String resize(String obj){
		System.out.println("String version of Resize");
		return null;
	}
}

interface Resizable{
	default Object resize(Object obj){
		System.out.println("Interface | Object param version of Resize. Return type: Object");
		return null;
	}
}

interface lambdaEx{
	//Lambda expression can have other method type, but must have only one abstract type.
	abstract boolean check(Object o);
	
	default void justNot(){	
	}
	default void justNot2(){	
	}
	static void ok(){	
	}
	static void ok2(){	
	}
}