package codingexercises;

public class getPrimesNumbers {

	public static boolean isPrime(int number) {
		if (number == 1)
			return false;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	// Better algorithm
	public static boolean isPrime2(int number) {
		if (number == 1)
			return false;
		for (int i = 2; i < number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	// Even Better algorithm
	public static boolean isPrime3(int number) {
		if (number == 1)
			return false;
		for (int i = 2; i <= (long) Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void getPrimeNum(int max, int numOfPrime) {
		int i = 2;
		int count = 0;
		while (i <= max) {
			if (isPrime(i) && isPrime2(i) && isPrime3(i)) {
				// Testing all isPrime methods
				count++;
				System.out.println(i);
				if (count == numOfPrime) {
					System.out.println("Found " + numOfPrime
							+ " Primes, exiting forLoop!");
					break;
				}
			}
			i++;
		}
		if (count < numOfPrime) {
			System.out.println("Could not find " + numOfPrime + " primes");
		}
	}

	public static void getPrimeNum(int max) {
		int i = 2;
		int count = 0;
		while (i <= max) {
			if (isPrime(i) && isPrime2(i) && isPrime3(i)) {
				// Testing all isPrime methods
				count++;
				System.out.println(i);
			}
			i++;
		}
		System.out.println("Found " + count + " prime Numbers in " + max);
	}

	public static void main(String[] args) {
		// System.out.println(isPrime(7));
		//getPrimeNum(7, 5);
		getPrimeNum(17);
	}

}
