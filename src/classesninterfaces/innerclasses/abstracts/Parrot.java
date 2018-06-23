package classesninterfaces.innerclasses.abstracts;

public class Parrot extends Bird {

	public Parrot(String name) {
		super(name);
	}

	@Override
	public void fly() {
		System.out.println(getName() + " Flitting from branch to branch");
	}
}
