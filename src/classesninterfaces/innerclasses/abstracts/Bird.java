package classesninterfaces.innerclasses.abstracts;

//Bird is an abstract Class which extends another abstract class and implemenets CanFly interface
public abstract class Bird extends Animal implements CanFly {
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
	
	//Any Class with an abstract method must be declared as abstract class itself
	//public abstract void fly();

}
