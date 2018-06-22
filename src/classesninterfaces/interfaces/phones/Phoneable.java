package classesninterfaces.interfaces.phones;

public interface Phoneable {
	public void powerOn();
	void dial(int phoneNumber);
	void answer();
	boolean callPhone(int phoneNumber);
	boolean isRinging();
}
