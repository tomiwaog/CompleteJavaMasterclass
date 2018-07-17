package randomonlinechallenges;

/**
 * 
 * @author Tomiwa
 * Finds missing number in an Integer array of 1 to 100
 */
public class FindMissingNumber {
	private static int expectedSum = getSum();

	private static int getSum() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		return sum;
	}
	
	static void findMissingNum(int[] arr){
		int sum=0;
		for (int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		int difference = expectedSum-sum;
		System.out.println("Missing number is "+ (difference>0? difference:  3));
		
		{
			System.out.println("Just a non static block here");
		}
	}

	void nonStaticMethod(){
		System.out.println("syso in a non static method, before the non-static block");
		{
			System.out.println("Syso in a non static ini block");
		}
		System.out.println("syso in a non static method, AFTER the non-static block");

	}
}
