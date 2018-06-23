package classesninterfaces.innerclasses.abstracts;

public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog("Doggie");
		dog.breathe();
		dog.eat();

		System.out.println("---------------------------");
		//Bird parrot = new Bird("Parrot"); //Cannot instantiate abstract class
		Bird parrot = new Parrot("Yahoo");
		parrot.breathe();
		parrot.eat();
		parrot.fly();
		System.out.println("---------------------------");
		Bird pengo = new Penguin("Xixi");
		pengo.fly();
	}

}
