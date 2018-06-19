package interfaces;

public class Main {

	public static void main(String[] args) {
		ITelephone tomsPhone = new DeskPhone(779555);;
		//tomsPhone = new DeskPhone(779555);
		tomsPhone.powerOn();
		tomsPhone.callPhone(779555);
		tomsPhone.answer();
		
		tomsPhone = new MobilePhone(54321);
		tomsPhone.powerOn();
		tomsPhone.callPhone(54321);
		
		
	}

}
