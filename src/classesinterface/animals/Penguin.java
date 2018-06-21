package classesinterface.animals;

public class Penguin extends Bird {

	public Penguin(String name) {
		super(name);
	}

	@Override
	public void fly() {
		super.fly();
		System.out
				.println("I'll fly when humans can, Im a different kinda bird!");
	}

}
