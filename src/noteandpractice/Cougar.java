package noteandpractice;

interface HasTail{
	int getLength();
}
abstract class Puma implements HasTail{
	  public int getLength(){
		return 0;
	}
}

