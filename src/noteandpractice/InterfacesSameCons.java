package noteandpractice;

public class InterfacesSameCons implements boy,girl {
void print(){}
	
	public static void main(String[] args) {
		
		InterfacesSameCons person = new InterfacesSameCons();
		person.print(); 
		
		//System.out.println(person.gender); //Would be ambiguous call.
		System.out.println(boy.gender);
		//System.out.println(boy.gender="Man"); //Wouldn't work as Interfaces variables are [static final]
	}


	@Override
	public int currPos() {
		return 0;
	}

}

interface boy{
	String gender="Boy";
	int currPos();
}

interface girl{
	String gender="Boy"; 
	int currPos(); //Uncomment for understanding.[int currPos(int y); would count as seperate method which would require implementation.
}