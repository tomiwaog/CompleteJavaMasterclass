package generics.sports.challenge;

public class Main {

	public static void main(String[] args) {
		
		//Creating Players
		BasketballPlayer kevinDurant = new BasketballPlayer("Kevin Durant");
		BasketballPlayer stephCurry = new BasketballPlayer("Stephen Curry");
		BasketballPlayer dwyaneWade = new BasketballPlayer("Dwyane Wayne");
		BasketballPlayer derozan = new BasketballPlayer("Demar DeRozan");
		
		FootballPlayer beckham = new FootballPlayer("David Beckham");
		
		// Creating Leagues
		League<Team<BasketballPlayer>> nba = new League<>("NBA");
		League<Team<FootballPlayer>> premierLeague = new League<>(
				"Premer League");

		
		// Creating Basketball Team
		Team<BasketballPlayer> raptors = new Team<>("Toronto Raptors");
		Team<BasketballPlayer> celtics = new Team<>("Celtics");
		Team<BasketballPlayer> heat = new Team<>("Heat");
		Team<BasketballPlayer> knicks = new Team<>("Knicks");
		Team<BasketballPlayer> goldenState = new Team<>("Golden State Warriors");
		Team<BasketballPlayer> lakers = new Team<>("Lakers");


		// Creating Football Team
		Team<FootballPlayer> arsenal = new Team<>("Arsenal");
		Team<FootballPlayer> chelsea = new Team<>("Chelsea");

		//Adding Players to Team
		goldenState.addPlayer(kevinDurant);
		heat.addPlayer(dwyaneWade);
		goldenState.addPlayer(kevinDurant);
		goldenState.addPlayer(stephCurry);
		raptors.addPlayer(derozan);
		
		arsenal.addPlayer(beckham);
		
		
		
//		//Demonstrating Raw types
//		Team rawTeam = new Team("Raw Team");
//		
//		rawTeam.addPlayer(derozan);
//		rawTeam.addPlayer(beckham);
//		premierLeague.addTeam(rawTeam);
//		nba.addTeam(rawTeam);
//		
//		League<Team> rawLeague = new League<>("Raw League");
//		rawLeague.addTeam(lakers);
//		rawLeague.addTeam(chelsea);
//		rawLeague.addTeam(rawTeam);
//		
//		League reallyRaw = new League<>("Really Raw League");
//		reallyRaw.addTeam(chelsea);
//		reallyRaw.addTeam(goldenState);
//		reallyRaw.addTeam(rawTeam);
		
		
		
		// Add Team to Basketball League
		nba.addTeam(raptors);
		nba.addTeam(celtics);
		nba.addTeam(knicks);
		nba.addTeam(heat);
		nba.addTeam(goldenState);
		nba.addTeam(lakers);

		// Add Team to Football League
		premierLeague.addTeam(arsenal);
		premierLeague.addTeam(chelsea);

		raptors.matchResult(celtics, 23, 53);
		raptors.matchResult(heat, 80, 17);
		celtics.matchResult(knicks, 90, 90);
		celtics.matchResult(knicks, 90, 90);
		knicks.matchResult(raptors, 110, 90);
		knicks.matchResult(heat, 110, 90);
		heat.matchResult(raptors, 110, 90);
		heat.matchResult(celtics, 110, 90);
		
		System.out.println();
		arsenal.matchResult(chelsea, 1, 3);

		nba.showLeagueTable();
		premierLeague.showLeagueTable();

	}
}