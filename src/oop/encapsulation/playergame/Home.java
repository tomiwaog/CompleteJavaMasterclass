package oop.encapsulation.playergame;

public class Home {

	public static void main(String[] args) {
		// Class without encapsulated fields
		// Max strength allowance was 100, input of 120 was denied
		Player player = new Player("T", "Sword", 120);
		player.name="Time";
		player.health = 300; // Hacked easily by external
		player.getHealth();
		player.loseHealth(20);
		player.getHealth();

		System.out.println("\n\n\n");
		// Class with Encapsulated members
		EnhancedPlayer premPlayer = new EnhancedPlayer("John", "Sword", 100);
		premPlayer.getHealth();
		premPlayer.loseHealth(20);
		premPlayer.getHealth();

	}

}
