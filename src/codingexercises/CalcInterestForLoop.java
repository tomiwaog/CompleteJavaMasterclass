package codingexercises;

public class CalcInterestForLoop {

	public static void calcInterest(double amount, double maxInterest) {
		if (maxInterest < 0 || amount < 0) {
			System.out.println("Invalid Amount or interest entered");
		}
		for (int i = 0; i <= maxInterest; i++) {
			System.out.println("Interest at " + i + "% is £" + amount
					* (i / 100.00));
		}
	}

	public static void calcInterest(double amount, double lowestInterest,
			double maxInterest) {
		if (maxInterest < 0 || lowestInterest < 0 || amount < 0) {
			System.out.println("Invalid Amount or interest entered");
		} else if (lowestInterest > maxInterest) {
			System.out
					.println("Your lowest interest cannot be greater than your largest");
		} else {
			for (int i = 0; i <= maxInterest; i++) {
				System.out.println("Interest at " + i + "% is £" + amount
						* (i / 100.00));
			}
		}
	}

	public static void main(String[] args) {
		calcInterest(4000.00, -6);
		calcInterest(4000.00, 6, 3);
	}
}
