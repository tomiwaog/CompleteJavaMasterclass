package classesninterfaces.innerclasses.abstracts;

public class Penguin extends Bird {

	public Penguin(String name) {
		super(name);
	}

	@Override
	public void fly() {
System.out.println(getName()+ " said 'Im not really good at flying, not my thing!'");		
	}

}
