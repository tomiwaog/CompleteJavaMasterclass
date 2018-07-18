package noteandpractice;

public class AbstractClasses {
	
}

class Human implements Runner{

	@Override
	public void jump() {		
	}

	@Override
	public void chestOut() {
		System.out.println("Leaned to win");
	}
	
	public void tiring(){
		
	}
	
}

class Horse extends Animal implements Runner{
	@Override
	public void jump() {
	}
	
}

class Animal{
	public void tiring(){
		
	}
	
}

interface Runner{
	void jump(); //implicitly abstract
	
	default void chestOut(){
		System.out.println("leaned out to win");
	}
	
	static void allSlowDown() {
		
	}
	
	void tiring();
}