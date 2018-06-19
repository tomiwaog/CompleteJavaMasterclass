package javamasterclass;

public class Methods {

	public static void main(String[] args) {
		int levelCompleted = 5;
		int bonus = 100;
		boolean gameOver = true;
		int score = 800;
		calcScore(score, gameOver, levelCompleted, bonus);

		score = 10000;
		levelCompleted = 8;
		bonus = 200;
		calcScore(score, gameOver, levelCompleted, bonus);

		displayHiScorePos("Tomiwa", 1500);
		displayHiScorePos("Adetona", 900);

		System.out.println(calcHighScorePos(1250));
		System.out.println(calcHighScorePos(650));
	}

	public static int calcScore(int score, boolean gameOver,
			int levelCompleted, int bonus) {
		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 2000;
			return finalScore;
		}
		return -1;
	}

	public static void displayHiScorePos(String player, int position) {
		System.out.println(player+ " managed to get into position " + position
				+ " on the high score table!");
	}

	static int calcHighScorePos(int score) {
		if (score >= 1000)
			return 1;
		if (score >= 500 && score < 1000)
			return 2;
		if (score >= 100 && score < 500)
			return 3;
		else
			return 4;
	}
}
