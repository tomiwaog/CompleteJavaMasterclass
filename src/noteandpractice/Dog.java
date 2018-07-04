package noteandpractice;

public class Dog {
	private String name;
	static int counter = 1;
	static int foodNutrient; // Can be changed but all object witness change
	static final int OWNERS = 81; // Cannot be changed, by any objects, so its
									// static anyway
	{
		// Initialiser block - executes for every object created
		System.out.println("Initializer block for class "
				+ getClass().getSimpleName() + " for object " + counter);
		counter++;
	}

	static{
		System.out.println("Expected to run once");
	}
	public Dog(String x, int y) {
		System.out.println("Dog constructor with 2 param");
	}

	public Dog(String name) {
		this.name = name;
	}

	public void printName() {
		System.out.println("Name = " + name);
	}

}
