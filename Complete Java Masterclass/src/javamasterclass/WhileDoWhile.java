package javamasterclass;

public class WhileDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
		// While
		while (counter < 6) {
			System.out.println("count is " + counter);
			counter += 1;
		}
		System.out.println("final count = " + counter);

		// Do while
		do {
			System.out.println("counter is now " + counter);
			counter--;
		} while (counter >= 0);

		System.out.println("final count = " + counter);

		// While true
		while (true) {
			if (counter == 8) {
				break;
			}
			System.out.println("counter while true is " + counter);
			counter++;
		}
		System.out.println("final count = " + counter);
		
		//wont run because counter is currently <9 (8)
		while (!(counter<9)){
			System.out.println("counter is "+ counter);
			counter++;
		}
		
		
		System.out.println("\nstart line 40\n");
		counter=6;
		do{
			System.out.println("count was "+counter);//runs at least once
			counter++;
			
			if (counter>100) //loop will run infinitely without this cond
				break;
		}while(counter!=6);
		System.out.println("\nfinal count = " + counter);

	}

}
