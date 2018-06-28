package generics.sports.challenge;


public class Main {

	public static void main(String[] args) {
		League<BasketballTeam> nba = new League<BasketballTeam>("NBA");
		League<FootballTeam> premierLeague = new League<FootballTeam>("Premer League");
		League<Team <BasketballPlayer>> x;

		BasketballTeam raptors = new BasketballTeam("Raptors");
		BasketballTeam celtics = new BasketballTeam("Celtics");
		BasketballTeam heat = new BasketballTeam("Heat");
		BasketballTeam knicks = new BasketballTeam("Knicks");

		FootballTeam arsenal = new FootballTeam("Arsenal");
		FootballTeam chelsea = new FootballTeam("Chelsea");

		nba.addTeam(raptors);
		nba.addTeam(celtics);
		nba.addTeam(knicks);
		nba.addTeam(heat);

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

		System.out.println("\nRaptors :" + raptors.ranking());
		System.out.println("Celtics :" + celtics.ranking());
		System.out.println("Heat :" + heat.ranking());
		System.out.println("Knicks :" + knicks.ranking());
		System.out.println("");

		nba.showLeagueTable();
	
		
	}
}