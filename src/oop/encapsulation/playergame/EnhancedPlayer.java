package oop.encapsulation.playergame;

public class EnhancedPlayer {
	// Encapsulated
	private String name, weapon;
	private int health;

	public void loseHealth(int damage) {
		this.health -= damage;
		if (health <= 0) {
			System.out.println("Player knocked out");
		} else
			System.out.println("You been shot. DAMAGE: " + damage);
		// getHealth();
	}

	public String getName() {
		return name;
	}

	public String getWeapon() {
		return weapon;
	}

	public int getHealth() {
		if (this.health == 100)
			System.out.println("FULL HEALTH: "+ this.health);
		else
			System.out.println("Remaining Health: " + this.health);
		return this.health;
	}

	public EnhancedPlayer(String name, String weapon, int health) {
		this.name = name;
		this.weapon = weapon;

		if (health >= 1 && health <= 100)
			this.health = health;
	}

}
