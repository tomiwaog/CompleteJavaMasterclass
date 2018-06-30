package noteandpractice;

class Emp {
	String name;
	static int bankVault;

	static int getBankVault() {
		return bankVault;
	}
	
	static class Joe{

		public void sleep() {
			// TODO Auto-generated method stub
			
		}
		
	}
}

public class Office {

	@SuppressWarnings({ "static-access", "null" })
	public static void main(String[] args) {
		//Still able to get class value even when object is set to null (i.e. not needed)
		Emp emp = null;
		
		System.out.println(emp.bankVault);
		System.out.println(emp.getBankVault());
		
		System.out.println(emp.name);
		
		Emp emp2 = new Emp();

		
	}
}