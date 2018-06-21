package abstractnsinterfaces.animals;

public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog("Doggie");
		dog.breathe();
		dog.eat();
		
		//Bird parrot = new Bird("Parrot"); //Cannot instantiate abstract class
		Parrot parrot = new Parrot("Yahoo");
		parrot.breathe();
		parrot.eat();
		parrot.fly();
		
		Bird pengo = new Penguin("Xixi");
		pengo.fly();
	}

}
