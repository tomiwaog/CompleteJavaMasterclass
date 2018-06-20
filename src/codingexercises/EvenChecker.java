package codingexercises;

public class EvenChecker {

	public static boolean isEven(int number) {
		return number % 2 == 0;
	}

	public static void main(String[] args) {
		if (isEven(46))
			System.out.println("Yes number is even");
		else
			System.out.println("Yes number is NOT even");

		// using while
		int maxnum = 20;
		int number = 5;
		int tempi=number;
		int findCount=0;
		while (number <= maxnum) {
			if (isEven(number)){
				System.out.println(number + " is even");
				findCount++;
				
				if (findCount==5)//breaks after 5 finds
					break;
			}
			number++; //increment i for the next loop check
		}
		System.out.println("Counted "+findCount+" even nums from "+tempi+" and "+ maxnum);
	}

}
