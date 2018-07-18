package noteandpractice;

public class AlbaSub extends Albatross{

	@Override
	Long fly() {
		return null;
	}
	
	//Must have different signature to that of superclass to overload
	protected void fly(int height){
		
	}
	
	//Can't override, only overload is possible
	public Number fly(int d, int s){
		return 5;
	}
}

abstract class Albatross{
	abstract Long fly();
}
abstract class SeaBird{
	
}