package codingexercises;

public class LargestPrime {
	// Gets Largest Prime Number from an input.

	public static boolean isPrime(int number) {
		if (number <= 1)
			return false;
		for (int i = 2; i <= (long) Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int getLargestPrime(int number) {
		for (int i = 1; i <= number; i++) {
			
			if (isPrime(i)) {
				if (isPrime(number / i) && i * (number / i) == number ) {
					return number/i;
				}else if((number / (i*i)) * i * i == number){
					return number/(i*i);
				}

			}
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
	}

}
