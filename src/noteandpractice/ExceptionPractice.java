package noteandpractice;

public class ExceptionPractice {
	public static void main(String[] args) {
		String str = "Infinity";
		
		System.out.println("Char at 5 is "+str.charAt(5));
		//System.out.println("Char at 15 is "+str.charAt(15));
		
		
		
		if (str.length()>3){
			System.out.println("about to throw");
			throw new RE(); //Unchecked Exceptions doesn't follow the declare-or-handle rule.
			//throw new FileNotFoundException(); //Checked exception such as FileNotFoundException however must follow the rule
		}
	}
	
	
}

class RE extends ArrayIndexOutOfBoundsException{}

