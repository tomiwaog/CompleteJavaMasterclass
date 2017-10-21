package javamasterclass;

public class MethodOverloading {

	public static void main(String[] args) {

		int result = calcScore("Tom",500);
		System.out.println(" "+result);
		
		int result2 = calcScore(666);
		System.out.println(" "+ result2);
		
		calcScore();
		
	}

	public static void calcScore() {
		System.out.print("No name no scores.");
	}
	
	public static int calcScore(String player, int score){
		System.out.print("player "+player+" scored "+score + " points.");
		return score*1000;
	}
	
	//Method Overloading (lol underloading)
	public static int calcScore(int score){
		System.out.print("Unnamed Player scored "+score + " points.");
		return score*1000;
	}
	

}
