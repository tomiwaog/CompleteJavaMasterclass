package encapsulation;

public class Player {
	public String name,  weapon;
	public int health;
	
	public void loseHealth(int damage) {
		this.health -= damage;
		if (health ==0){
			System.out.println("Player knocked out");
		}
	}
	
	public int getHealth(){
		if (this.health == 100)
			System.out.println("FULL HEALTH");
		else
			System.out.println("Remaining Health: "+ this.health);
		return this.health;
	}

	public Player(String name, String weapon, int health) {
		this.name = name;
		this.weapon = weapon;
		
		if (health>=1 && health<=100)
			this.health = health;
	}

}
