package mobilephone;

public class Sim extends SimTypes {
	private String name;
	private String network;
	String phoneNum;

	public String getName() {
		return name;
	}

	public String getNetwork() {
		return network;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public Sim(String network, String phoneNum, String simType) {
		super();
		this.network = network;
		this.phoneNum = phoneNum;
		this.simTypeName = simType;
	}

	public String getSimDetails() {
		return "My Number :" + getPhoneNum() + "\tNetwork : " + getNetwork()
				+ "\tSim Type :" + getSimTypeName() + "\tSim size : "
				+ getSimSize();
	}
}
