package classesninterfaces.innerclasses.abstracts;

public class Dog extends Animal{
	public Dog(String name) {
		super(name);
	}

	@Override
	public void eat() {
		System.out.println(getClass().getSimpleName()+ " aka "+getName()+ " is eating!");
	}

	@Override
	public void breathe() {
		System.out.println(getName()+" is Breathing!");
	}

}
