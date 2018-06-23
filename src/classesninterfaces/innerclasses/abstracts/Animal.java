package classesninterfaces.innerclasses.abstracts;

public abstract class Animal {
	//Abstract Classes can have member variables which can be inherited,
	//But variables in Interfaces are static final and cannot be changed
	//Non static variable requires instance but you can't instantiate an Interface
	//Abstract Classes can have constructors unlike Interfaces
	//Methods of Abstract classes can have any visibility but Interface can only be public
	//Abstract Classes can have implementation, while Interfaces only have signature
	private String name;

	public Animal(String name) {
		this.name = name;
	}
	
	//Classes extending Animal must implements the abstract methods
	public abstract void eat(); 
	public abstract void breathe();

	public String getName() {
		return name;
	}
	
}
