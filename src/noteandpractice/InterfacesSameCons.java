package noteandpractice;

public class InterfacesSameCons implements boy,girl {
	
	public static void main(String[] args) {
		
		InterfacesSameCons person = new InterfacesSameCons();
		
		//System.out.println(person.gender); //Would be ambiguous call.
		System.out.println(boy.gender);
		//System.out.println(boy.gender="Man"); //Wouldn't work as Interfaces variables are [static final]
		
		System.out.println(person.maxLength());
	}


	@Override
	public int currPos() {
		return 0;
	}


	public int distance() {
		return 0;
	}


	public int maxLength() {
		return 5;
	}

}

interface boy{
	String gender="Boy";
	int currPos();
	
	static int maxLength(){
		return 4;
	}
}

interface girl{
	String gender="Boy"; 
	//String currPos(); //Uncomment for understanding.[int currPos(int y); would count as seperate method which would require implementation.
	
	static int distance(){
		return 0;
	}
}