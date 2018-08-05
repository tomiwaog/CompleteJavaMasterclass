package noteandpractice;

public class InterfacesSameCons implements Boy,Girl {
	
	public static void main(String[] args) {
		
		InterfacesSameCons person = new InterfacesSameCons();
		
		//System.out.println(person.gender); //Would be ambiguous call.
		//System.out.println(person.specialInt); //on the other hand would work as there aren't any duplicates.
		System.out.println(Boy.gender);
		//System.out.println(boy.gender="Man"); //Wouldn't work as Interfaces variables are [static final]
		
		System.out.println(person.maxLength());
		//System.out.println(Person.x); //Ambiguous as both interfaces utilises the same name. Interface.variable would work
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

interface Boy{
	int x= 555;
	String gender="Boy";
	int currPos();
	
	static int maxLength(){
		return 4;
	}
	
	static int distance(){
		return 0;
	}
}

interface Girl{
	int x=5;
	int specialInt =000;
	String gender="Boy"; 
	//String currPos(); //implementer wont compile if it also implements Boy. Uncomment for understanding. | int currPos(int y); would on the other hand would count as separate method which would require implementation.
	
	static int distance(){
		return 0;
	}
}