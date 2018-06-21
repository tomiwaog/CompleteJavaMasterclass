package classesinterface.interfaces.phones;

public class MobilePhone implements ITelephone {

	private int myNumber;
	private boolean isRinging;
	private boolean isMobileOn = false;

	@Override
	public void powerOn() {
		System.out.println("Powering on Mobile");
		isMobileOn = true;
	}

	@Override
	public void dial(int phoneNumber) {
		if (isMobileOn) {
			System.out.println("Now ringing " + phoneNumber + " on deskphone");
		}else{
			System.out.println("Phone is switched OFF");
		}
	}

	@Override
	public void answer() {
		if (isRinging) {
			System.out.println("Answering Mobile");
			isRinging = false;
		}
	}

	@Override
	public boolean callPhone(int phoneNumber) {
		if (phoneNumber == myNumber && isMobileOn) {
			isRinging = true;
			System.out.println("Mobile melody!");
		} else {
			isRinging = false;
			System.out.println("mobile is sitched OFF or number different");
		}
		return isRinging;
	}

	public MobilePhone(int myNumber) {
		super();
		this.myNumber = myNumber;
	}

	@Override
	public boolean isRinging() {
		return isRinging;
	}

}
