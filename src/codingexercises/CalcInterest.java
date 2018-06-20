package codingexercises;

public class CalcInterest {
	public static void main(String[] args) {
		//double amountOwed = calcInterestMonthly(3750, 3.33, 1000);
		
		for (int i=8; i>=2;i--){
			System.out.println("10000 at "+ i +" % interest = "+String.format("%.2f", calcInterest(10000.0d,i)));
		}
		/*
		for (int i = 0; i < 12; i++) {
			calcInterestMonthly(amountOwed, 3.33, 2000);
		}
		*/
	}
	
	public static double calcInterest(double amount, double intRate) {
		return (amount * (intRate / 100));
	}
	
	/*
	static int month = 1;
	public static double calcInterestMonthly(double amount, double intRate,
			double paid) {
		System.out.println("\nMonth " + month++);
		System.out.println("owed " + amount + ". paid " + paid);
		System.out.println("amount left: " + (amount - paid));
		double interest = (amount - paid) * (intRate / 100);
		System.out.println("interest is £" + (int) interest);
		System.out.println("Applying £" + interest + " on remaining "
				+ (amount - paid));
		double newtotal = interest + (amount - paid);
		System.out.println("newtotal is " + newtotal);
		return newtotal;
	}
	*/
}