package generics.sports;

public class Main {

	public static void main(String[] args) {
		FootballPlayer musa = new FootballPlayer("Muhammed Musa");
		BaseballPlayer jackie = new BaseballPlayer("Jackie Robinson");
		SoccerPlayer beckham = new SoccerPlayer("David Beckham");
		BasketballPlayer demar = new BasketballPlayer("Demar DeRozan");
		
		Team<FootballPlayer> torontoRaptors = new Team<>("Toronto Raptors");
		
//		torontoRaptors.addPlayer(jackie);
//		torontoRaptors.addPlayer(musa);
//		torontoRaptors.addPlayer(beckham);
		
//		System.out.println(torontoRaptors.getSize());
		
		Team<BasketballPlayer> goldenState = new Team<>("The Golden State");
		goldenState.addPlayer(demar);
		
		Team<BaseballPlayer> chicagoCubs = new Team<>("Chicago Cubs");
		chicagoCubs.addPlayer(jackie);
		
		Team<BasketballPlayer> nyNicks = new Team<>("New York Nicks");
		Team<BasketballPlayer> chiBulls = new Team<>("Chicago Bulls");
		System.out.println(nyNicks.getTeamName());
		goldenState.matchResult(nyNicks, 23, 53);
		goldenState.matchResult(chiBulls, 80, 105);
		goldenState.matchResult(nyNicks, 90, 90);
		System.out.println(goldenState.ranking());
		
		//The below, would compile(with exception at run time due to our casting in Team Class), if bounder type parameters wasn't set in Team Class
		//Team<String> broken = new Team<>("Testing broken"); 
		//broken.addPlayer("Hello");
	}
}
