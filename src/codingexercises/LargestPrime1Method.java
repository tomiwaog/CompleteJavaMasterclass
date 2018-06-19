package codingexercises;

public class LargestPrime1Method {
	// Gets Largest Prime Number from an input.
	public static int getLargestPrime(int number) {
		if (number <= 1)
			return -1;

		for (int i = 2; i <= (long) Math.sqrt(number); i++) {
			int candidate = number / i;

			for (int j = 2; j <= (long) Math.sqrt(candidate); j++) {
				if (i*i*(number/(i*i))==number){
					return number/(i*i);
				}
				if (candidate % j == 0) {
					continue;
				}

				if (candidate*i==number){
					return candidate;
				}
			}
		}
		int k=1; 
		while(k<=number){
			if (number%k==0|| number==2){
				return number;
			}
			k++;
		}
		return -1;
	}

	public static void main(String[] args) {

		System.out.println("\nresult is: " + getLargestPrime(21));
		System.out.println("\nresult is: " + getLargestPrime(217));
		System.out.println("\nresult is: " + getLargestPrime(0));
		System.out.println("\nresult is: " + getLargestPrime(45));
		System.out.println("\nresult is: " + getLargestPrime(-1));
		System.out.println("\nresult is: " + getLargestPrime(7));
		System.out.println("\nresult is: " + getLargestPrime(2));
	}

}
