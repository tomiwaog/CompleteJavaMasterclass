package oop;

public class BankAccount {

	private static int accGen;
	private String accNum, phoneNum;
	private double accBalance;
	private String custName, custEmail;
	private double overDraft = 0;

	public String getAccNum() {
		return accNum;
	}

	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public double getAccBalance() {
		return accBalance;
	}

	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustEmail() {
		return custEmail;
	}

	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	public void depositFunds(double money) {
		System.out.println("... Depositing £" + money);
		accBalance += money;
		System.out.println(getStatement());
	}

	public String getStatement() {
		double balance = this.accBalance;
		double availability;
		if(balance>=0){
			availability=balance+overDraft;
		}
		else{
			System.out.println("");
			availability = (overDraft - (-1*balance));
		}


		return "Balance is "+balance+" and You have £" + availability + " available to spend";
	}

	public void withdrawFunds(double money) {
		System.out.println("... Withdrawing £" + money);
		if (this.accBalance - money >= 0) {
			accBalance -= money;

		} else{
			if (this.overDraft>0 && (this.accBalance - money)>=(0-overDraft)){
				accBalance -= money;
			}
			else System.out.println("Insufficient funds!");
		}
	}
	public double getOverDraft() {
		return overDraft;
	}

	public BankAccount(String accNum, double accBalance, String custName,
			String custEmail, String phoneNum) {
		this.accNum = accNum;
		this.accBalance = accBalance;
		this.custName = custName;
		this.custEmail = custEmail;
		this.phoneNum = phoneNum;
		System.out.println("Full Parameterised Constructor called!");
	}

	public BankAccount(String custName, String custEmail, String phoneNum, double overDraft) {
		this("gen"+(++accGen), 500.00d, custName, custEmail,phoneNum);
		this.overDraft = overDraft;
	}

	
	public static void main(String[] args) {
//		BankAccount tay = new BankAccount("Titi Ogunbamowo","titi@gmail.com", "0779 435 3492",0);
//		tay.withdrawFunds(600);
//		System.out.println(tay.getStatement());
//		System.out.println(tay.accNum);
//		BankAccount taya = new BankAccount("Titi Ogunbamowo","titi@gmail.com", "0779 435 3492",0);
//		System.out.println(taya.accNum);
		
		VIPCustomer x = new VIPCustomer();
		x.getCreditLimit();
	}


}
