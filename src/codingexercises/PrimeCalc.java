package codingexercises;

//A number that only divides itself and by 1
//3, 5, 7, 11, 13
public class PrimeCalc {

	public static boolean isPrime(int num) {
		if (num == 1)
			return false;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {

		//Prime between two numbers
		int counter=0;
		for (int i=10;i<20;i++){
			if (isPrime(i)){
				System.out.println(i + " is prime!");
				counter++;
				
				if (counter==3){
					break;
				}
			}
		}
	}
}