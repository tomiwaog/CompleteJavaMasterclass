package abstractninterfaces.interfaces.phones;

public class Main {

	public static void main(String[] args) {
		
		Phoneable tomsPhone = new DeskPhone(779555);;
		//tomsPhone = new DeskPhone(779555);
		tomsPhone.powerOn();
		tomsPhone.callPhone(779555);
		tomsPhone.answer();
		
		/**
		 * Since we've used the Interface for the declaration, 
		 * it could be used to create object from both classes implementing it
		 * i.e. Desktop as well as MobilePhone.
		 */
		
		tomsPhone = new MobilePhone(54321);
		//tomsPhone.powerOn(); //Test case, shouldn't respond if mobile is OFF
		tomsPhone.callPhone(54321);
		tomsPhone.callPhone(547321); //Test Case. Shouldn't call if Number is different
		
		
	}

}
