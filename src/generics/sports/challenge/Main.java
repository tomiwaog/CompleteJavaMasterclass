package generics.sports.challenge;

public class Main {

	public static void main(String[] args) {
		League<Team<BasketballPlayer>> nba = new League<>("NBA");
		League<Team<FootballPlayer>> premierLeague = new League<>(
				"Premer League");

		// Creating Basketball Team
		Team<BasketballPlayer> raptors = new Team<>("Raptors");
		Team<BasketballPlayer> celtics = new Team<>("Celtics");
		Team<BasketballPlayer> heat = new Team<>("Heat");
		Team<BasketballPlayer> knicks = new Team<>("Knicks");

		// Creating Football Team
		Team<FootballPlayer> arsenal = new Team<>("Arsenal");
		Team<FootballPlayer> chelsea = new Team<>("Chelsea");

		// Add Team to Basketball League
		nba.addTeam(raptors);
		nba.addTeam(celtics);
		nba.addTeam(knicks);
		nba.addTeam(heat);

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