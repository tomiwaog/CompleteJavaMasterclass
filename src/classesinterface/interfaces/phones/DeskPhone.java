package classesinterface.interfaces.phones;

public class DeskPhone implements ITelephone {
private int myNumber;
private boolean isRinging;
	@Override
	public void powerOn() {
		System.out.println("DeskPhone has no Power");
	}

	@Override
	public void dial(int phoneNumber) {
		System.out.println("Now ringing "+ phoneNumber + " on deskphone");
	}

	@Override
	public void answer() {
		if (isRinging){
			System.out.println("Answering!");
			isRinging = false;
		}
	}

	@Override
	public boolean callPhone(int phoneNumber) {
		if (phoneNumber == myNumber){
			isRinging = true;
			System.out.println("RING RING!");
		}else{
			isRinging = false;
		}
		return isRinging;
	}


	public DeskPhone(int myNumber) {
		super();
		this.myNumber = myNumber;
	}

	@Override
	public boolean isRinging() {	
		return isRinging;
	}

}
