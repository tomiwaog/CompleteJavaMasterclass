package codingexercises;

public class PlayingCat {

	public static boolean isCatPlaying(boolean summer, int temperature){
		int minTemp = 25;
		int maxTemp = 35;
		if (summer){
			maxTemp = 45;
		}
		return(temperature>=minTemp && temperature<=maxTemp);
	}
	
	public static void main(String[] args) {
		System.out.println(isCatPlaying(true,10));
		System.out.println(isCatPlaying(false,36));
		System.out.println(isCatPlaying(false,35));
	}
}
