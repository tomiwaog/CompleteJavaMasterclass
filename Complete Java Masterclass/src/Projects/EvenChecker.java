package Projects;

public class EvenChecker {

	public static boolean isEven(int number) {
		return number % 2 == 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if (isEven(46))
			System.out.println("Ye number is even");
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
			number++; //incre i for the next loop check
		}
		System.out.println("Counted "+findCount+" even nums from "+tempi+" and "+ maxnum);
	}

}
