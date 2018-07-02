package noteandpractice;

//import static java.lang.Math.abs; //Using import static to access static method of a class

public class Main extends Object {

	public static void main(String[] args) {
		// Dog rex = new Dog("rex");
		// Dog fluffy = new Dog("fluffy");
		//
		// rex.printName();
		// fluffy.printName();

		// Using full qualified name instead of simple name
		// int x = java.lang.Math.abs(3); // Accessing static method of a Class
		// java.util.Scanner sc = new java.util.Scanner(System.in);

		// Object doggy = new Dog("Doggy");
		// System.out.println(((Dog)doggy).OWNERS);

		// Main myMain = new Main();
		// //myMain.clashMethods(2, 3); //Compilation error as input is vague to
		// applicable methods
		// myMain.clashMethods(3.2, 3);
		
		//statement below is not valid as Dog constructor is set to private
		//Dog newDog = new Dog("Hello", 4); Testing Accessibility on constructors

	}

	// void clashMethods(double doub, int y) {
	// System.out.println("Called first");
	// if (4 < 2)
	// return;
	// System.out.println("Double is " + doub + " and Int is " + y);
	// }
	//
	// void clashMethods(int y, double doub) {
	// System.out.println("Called second");
	// System.out.println("Double is " + doub + " and Int is " + y);
	// }

}
