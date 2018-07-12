package noteandpractice;

// import static java.lang.Math.abs; 
// Using import static to access static method of a class

public class Main extends Object {

	public static void main(String[] args) {

		// TEsting boolean assignment instead of comparison
		// boolean x = false;
		// if (x=true)
		// System.out.println("x is "+ x);
		
		//Java choosing its own else statement without curly braces
		int score = 110;
		if (score > 200)
			if (score < 400)
				if (score > 300)
					System.out.println(1);
				else
					System.out.println(2);
		else
				System.out.println(3);

		// Testing local variable without block
		// if (!s.isEmpty())
		// String lol = "lol"; //local variables are only allowed in a code
		// block

		// Testing addition of integer into a Long type ArrayList
		// ArrayList<Long> x = new ArrayList<>();
		// x.add(34);
		// Long myLong = new Long(4);
		// System.out.println(myLong);
		// Testing DateTimeFormatter
		// DateTimeFormatter i = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		// LocalDate d = LocalDate.parse("2057-05-22", i);
		//
		// LocalDate dNoP = LocalDate.parse("2057-05-22");
		// System.out.println(i.format(dNoP));
		// System.out.println();
		// DateTimeFormatter dtf1 =
		// DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		// DateTimeFormatter dtf2 =
		// DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL);
		// DateTimeFormatter dtf3 =
		// DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
		// DateTimeFormatter dtf4 =
		// DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG,
		// FormatStyle.SHORT);
		// System.out.println(dtf1.toString());
		// System.out.println(dtf2.toString());
		// System.out.println(dtf3.toString());
		// System.out.println(dtf4);

		// switch statement analysis
		// int tom =0;
		// final int x=4;
		// switch(tom){
		// case 0:
		// System.out.println();
		// case x:
		// System.out.println("case 1");
		// break;
		// case (int)'f':
		// System.out.println("F Char allowed");
		// default:
		// System.out.println("Default");
		// }
		// Recreating String to assigning to array
		// ArrayList<String> arr = new ArrayList<>();
		// arr.add("One");
		// arr.add("Two");
		// arr.add("Three");
		//
		// for(String i: arr){
		// arr.set(arr.indexOf(i), i+i.length());
		// }
		// for (String i : arr){
		// System.out.println(i);
		// }

		// Achieving String manipulation using StringBuilder
		// No new object created or reassigning required like string
		// ArrayList<StringBuilder> arrSB = new ArrayList<>();
		// arrSB.add(new StringBuilder("One"));
		// arrSB.add(new StringBuilder("Two"));
		// arrSB.add(new StringBuilder("Three"));
		//
		// for (StringBuilder j : arrSB) {
		// j.append(j.length());
		// }
		// for (StringBuilder j : arrSB) {
		// System.out.println(j);
		// }

		// Equals method of String works differently to that of StringBuilder
		// StringBuilder x = new StringBuilder("One");
		// StringBuilder y = new StringBuilder("One");
		// String i = new String("One");
		// String j = new String("One");
		// System.out.println(x.equals(y)); //false
		// System.out.println(i.equals(j)); //true
		// Dog rex = new Dog("rex");
		// Dog fluffy = new Dog("fluffy");

		// rex.printName();
		// fluffy.printName();

		// Using full qualified name instead of simple name
		// int x = java.lang.Math.abs(3); // Accessing static method of a Class
		// java.util.Scanner sc = new java.util.Scanner(System.in);

		// Object doggy = new Dog("Doggy");
		// System.out.println(((Dog)doggy).OWNERS);

		// Main myMain = new Main();
		// // Compilation error as input is vague to applicable methods
		// // myMain.clashMethods(14, 3);
		// int x = Integer.MAX_VALUE;
		// myMain.testWide(2 * x);
		// System.out.println(Integer.MAX_VALUE == Math.pow(2, 31) - 1);

		// String myStr = new String("my string");
		// String yourStr = myStr;
		// System.out.println(yourStr=="my string");

		// myMain.clashMethods(3.2, 3);

		// statement is not valid if Dog constructor access is set to private
		// Dog newDog = new Dog("Hello", 4); Testing Accessibility on
		// constructors

		// Dog justDog = new Dog(); // Will not work as there's no longer a
		// default constructor (u create 2 param cons)
		// Dog justDog = new Dog("Joe");
		// Dog newDog = new Dog("Hello", 4);
		// Office x = new Office(); //no constructors specified, just
		// initialiser block

		// Person person1 = new Person("John");
		// Person person2 = new Person("Paul");
		// System.out.println("\nP1 is now " + person1.getName() + " and P2 is "
		// + person2.getName());
		//
		// swap(person1, person2);
		// System.out.println("\nP1 is now " + person1.getName() + " and P2 is "
		// + person2.getName());

		// String Builder Mutation
		// StringBuilder x = new StringBuilder();
		// x.append("Hello\n");
		// x.append(34);
		// x.append('T');
		// x.append(5>2);
		// x.append(34.2);
		// x.append("\n");
		// x.append("ToTomiwaOg",2,"ToTomiwaOg".length()-2);
		// x.append(new StringBuilder("\nJoe\n"));
		// x.append(new Dog("DogBuilder"));
		// System.out.println(x);

		// StringBuilder sb1 = new StringBuilder("123\n");
		// char[] name = {'J','a','v','a','l','o','v'};
		// sb1.append(name,2,3);
		// // sb1.insert(1, name,1,3);
		// String tom = "Javalov";
		// sb1.append(tom,2,3);
		// System.out.println(sb1);

		// // Random implementation of a matrix table
		// int arr[][] = new int[5][5];
		// for (int i = 0; i < arr.length; i++) {
		// for (int j = 0; j < arr[i].length; j++) {
		// arr[i][j] = (i + j);
		// }
		// }

		// //Testing null access in a multidimensional array
		// //1 //String[][] x = { {"1"} , null, { "3", "4", "5" } };
		// String[][] x = { {"1"} , {null}, { "3", "4", "5" } };
		// System.out.println(x[1][0]); //Fails to run with commented code, as
		// null wasn't wrapped as an object
		//
		// String[]y = { "1" , null, "3" };
		// System.out.println(y[1]);

		// //Accessing Null test
		// Dog[] myDogArray = new Dog[3];
		// myDogArray[0] = new Dog("Firsto");
		// myDogArray[1] = null;
		// myDogArray[2] = new Dog("Lasto");
		//
		// System.out.println("DIrect access: " + myDogArray[1]);
		//
		// for (Dog dogg : myDogArray) {
		// if (dogg != null) {
		// dogg.printName();
		// } else {
		// System.out.print("found a null one: ");
		// System.out.println(dogg);
		// }
		// }

		// myInt[] interfArray = new myInt[1];
		// CatInterface[] newCatArr = { new Lion(), new Tiger(),null };
		//
		// for (CatInterface i : newCatArr) {
		// System.out.println(i);
		// }
		//
		// //This declaration below also words, as all the classes extends
		// Object Class, hence typed Object
		// Object[] newCatArrs = { new Lion(),new java.util.Date(), new
		// Tiger(),null, new String("String heys"), new Integer[6], new
		// Double[]{4.0,5.5}};
		// for (Object i : newCatArrs) {
		// System.out.println(i);
		// }
	}
	// public static void swap(Person p1, Person p2) {
	// System.out.println("BEFORE SWAP\nP1 is now " + p1.getName()
	// + " and P2 is " + p2.getName());
	//
	// Person temp = p1;
	// p1 = p2;
	// p2 = temp;
	// System.out.println("AFTER SWAP\nP1 is now " + p1.getName()
	// + " and P2 is " + p2.getName());
	//
	// String s = "Java";
	// s.concat("SE 6");
	// s.replace('r', '5');
	// System.out.println(s);
	// }

	// void testWide(long i) {
	// System.out.println("Widened to long");
	// }
	//
	// void testWide(Long i) {
	// System.out.println("Widened to Wrapper Long");
	// }
	//
	// void testWide(int i) {
	// System.out.println("Widened to int");
	// }
	//
	// void testWide(Integer i) {
	// System.out.println("Widened to Wrapper Integer");
	// }
	//
	// void clashMethods(double doub, int y) {
	// System.out.println("Double is " + doub + " and Int is " + y);
	// }
	//
	// void clashMethods(int y, double doub) {
	// System.out.println("Double is " + doub + " and Int is " + y);
	// }
}

class Lion implements CatInterface {
}

class Tiger implements CatInterface {
}

interface CatInterface {
}