package interfaces;

public interface ITelephone {
	public void powerOn();
	void dial(int phoneNumber);
	void answer();
	boolean callPhone(int phoneNumber);
	boolean isRinging();
}
