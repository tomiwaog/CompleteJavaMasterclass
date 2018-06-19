package codingexercises;

public class GreatestCommonDivisor {

	public static int getGreatestCommonDivisor(int x, int y){
		if (x <10 || y<10)
			return -1;
		
		int largest = y;
		int smallest = x;
		if (x >=y){
			largest=x;
			smallest = y;
		}
		for (int i=smallest;i>0;i--){
			if (largest%i==0 && smallest %i==0){
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		System.out.println(getGreatestCommonDivisor(25, 15));
		System.out.println(getGreatestCommonDivisor(12, 30));
		System.out.println(getGreatestCommonDivisor(9, 18));
		System.out.println(getGreatestCommonDivisor(81, 153));
	}
}
