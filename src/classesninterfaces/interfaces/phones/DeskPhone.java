package classesninterfaces.interfaces.phones;

public class DeskPhone implements Phoneable {
	private int myNumber;
	private boolean isRinging;

	public DeskPhone(int myNumber) {
		this.myNumber = myNumber;
	}

	@Override
	public void powerOn() {
		System.out.println("DeskPhone has no Power button");
	}

	@Override
	public void dial(int phoneNumber) {
		System.out.println("Now ringing " + phoneNumber + " on deskphone");
	}

	@Override
	public void answer() {
		if (isRinging) {
			System.out.println("Answering on Deskphone");
			isRinging = false; //Ensuring Ringing isnt always ON except when called.
		}
	}

	@Override
	public boolean callPhone(int phoneNumber) {
		if (phoneNumber == myNumber) {
			isRinging = true;
			System.out.println("RING RING! ");
		} else {
			System.out.println("Not ringing");
			isRinging = false;
		}
		return isRinging;
	}

	@Override
	public boolean isRinging() {
		return isRinging;
	}

}
