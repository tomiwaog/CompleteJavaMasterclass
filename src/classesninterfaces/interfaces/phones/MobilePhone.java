package classesninterfaces.interfaces.phones;

public class MobilePhone implements Phoneable {

	private int myNumber;
	private boolean isRinging;
	private boolean isMobileOn = false;

	public MobilePhone(int myNumber) {
		this.myNumber = myNumber;
	}
	
	@Override
	public void powerOn() {
		System.out.println("Powering on Mobile");
		isMobileOn = true;
	}

	@Override
	public void dial(int phoneNumber) {
		if (isMobileOn) {
			System.out.println("Now ringing " + phoneNumber + " on mobile Phone");
		}else{
			System.out.println("Phone is switched OFF");
		}
	}

	@Override
	public void answer() {
		if (isRinging) {
			System.out.println("Answering Mobile Phone");
			isRinging = false; //Ensuring Ringing isnt always ON except when called.
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



	@Override
	public boolean isRinging() {
		return isRinging;
	}

}
