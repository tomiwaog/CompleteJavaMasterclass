package noteandpractice;

public class StaticVSInstance {
	static int x; // Static member/field
	String y; // Instance member
	int rando = randomStaticMethod(); //Instance variable accessing static method
	int xInstance = x; //Instance variable accessing static variable

	public static void setNumber(int number) {
		System.out.println("Number is " + number);
		x = number;
		

	}

	public void getWords() {
		this.y = "RandomWord";
		StaticVSInstance.x = 334;
		x = 454; // Instance method accessing static variable directly
		// Instance method can access static methods directly
		StaticVSInstance.setNumber(36);
		System.out.println("Word is :" + y);
		StaticVSInstance.randomStaticMethod(); //Instance method accessing static methods
	}

	public static void main(String[] args) {

		StaticVSInstance mine = new StaticVSInstance();
		mine.getWords();

		// Static method accessing static member directly
		StaticVSInstance.x = 100;
		x = 50;
		System.out.println(StaticVSInstance.x);
		// y= 3; //Static methods cannot access instance variables directly
		setNumber(12);
		// getWords(); //Static methods cannot access instance methods directly
	}

	public static int randomStaticMethod(){
		return 555;
	}
}