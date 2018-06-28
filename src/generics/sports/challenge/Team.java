package generics.sports.challenge;

import java.util.ArrayList;

//Bounder type parameter added to prevent the wrong class being created
public class Team<T extends Player> implements Comparable<Team<T>> {
	String name;
	int won;
	int lost;
	int tied;
	public int gamePlayed;

	ArrayList<T> members = new ArrayList<>();

	public Team(String name) {
		this.name = name;
	}

	boolean addPlayer(T newPlayer) {
		if (!members.contains(newPlayer)) {
			members.add(newPlayer);
			System.out.println(newPlayer.getName() + " is picked for "
					+ this.name);
			return true;
		}
		// Casting would be required inorder to get access to Player's methods.
		// if T doesn't extend Player like below:
		System.out.println("Player:" + ((Player) newPlayer).getName()
				+ " is already exist in Team");
		return false;
	}

	int getSize() {
		return members.size();
	}

	String getTeamName() {
		return name;
	}

	void matchResult(Team<T> opponent, int theirScore, int ourScore) {
		gamePlayed++;
		String message;
		if (theirScore > ourScore) {
			lost++;
			message = " lost to ";
		} else if (theirScore == ourScore) {
			tied++;
			message = " drew with ";
		} else {
			won++;
			message = " beat ";
		}
		if (opponent != null) {
			System.out.println(this.getTeamName() + message
					+ opponent.getTeamName());
			// Runs the same program on opponent object. notice ourScore and
			// their score position swap.
			opponent.matchResult(null, ourScore, theirScore);
		}

	}

	public int ranking() {
		return (won * 2) + tied;
	}

	@Override
	public int compareTo(Team<T> team) {
		if (this.ranking() < team.ranking()) {
			return 1;
		} else if (this.ranking() > team.ranking()) {
			return -1;
		}
		return 0;
	}
}
