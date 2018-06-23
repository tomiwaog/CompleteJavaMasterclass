package classesninterfaces.innerclasses.abstracts;

//Bird is an abstract Class which extends another abstract class and implements CanFly interface
//Any Class with an abstract method must be declared as abstract class itself
public abstract class Bird extends Animal implements CanFly {
	
	//Abstract classes can have constructors unlike interfaces
	public Bird(String name) {
		super(name);
	}

	@Override
	public void eat() {
		System.out.println(getName() + " is pecking!");
	}

	@Override
	public void breathe() {
		System.out.println(getName() + " the " + getClass().getSimpleName()
				+ " is breathing");
	}

	@Override
	public void fly() {
		System.out.println(getName()+ " the "+ getClass().getSimpleName()+ " is flapping its wings");
	}

}
