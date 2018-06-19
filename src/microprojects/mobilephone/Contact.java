package microprojects.mobilephone;

public class Contact {
	private String name;
	private String phoneNum;
	
	public String getPhoneNum() {
		return phoneNum;
	}

	public String getEmail() {
		return email;
	}

	public String getAddress() {
		return address;
	}

	private String email;
	private String address;

	public Contact(String name, String phoneNum) {
		this(name,phoneNum, "", "");
	}

	public Contact(String name, String phoneNum, String email, String address) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.email = email;
		this.address = address;
	}

	public String getContactDetails() {
		return "Name :" + name + "\tTelephone: " + phoneNum + "\temail: " + email
				+ "\taddress :" + address;
	}
	
	public String getName(){
		return name;
	}
	public static Contact createContact(String name, String phoneNum){
		return new Contact(name, phoneNum);
	}
	
	public static Contact createContact(String name, String phoneNum, String email, String address){
		return new Contact(name, phoneNum, email, address);
	}
	public void setName(String name){
		this.name = name;
	}
}
