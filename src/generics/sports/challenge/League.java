package generics.sports.challenge;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team<?>> {
	private String name;

	private ArrayList<T> league = new ArrayList<>();

	public League(String name) {
		this.name = name;
	}

	public boolean addTeam(T team) {
		if (league.contains(team)) {
			return false;
		}
		league.add(team);
		return true;
	}

	public int getSize() {
		return league.size();
	}

	public String getName() {
		return name;
	}

	public void showLeagueTable() {
		System.out.println();
		System.out.println(this.getName()+" LEAGUE TABLE:");
		Collections.sort(league);
		int counter = 1;
		;
		for (T team : league) {
			System.out.println(counter + ". " + team.getTeamName() + ": "
					+ team.ranking());
			counter++;
		}
	}

}
