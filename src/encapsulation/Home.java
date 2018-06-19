package encapsulation;

public class Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Class without encapsulation
		//Max strength allowance was 100, input of 120 was denied
		Player easyPlayer = new Player("John", "Axe",120);
		easyPlayer.health=300; //Hacked easily by external
		easyPlayer.getHealth();
		easyPlayer.loseHealth(20);
		easyPlayer.getHealth();
		
		System.out.println("\n\n\n");
		//Encapsulated Class
		AdvPlayer player = new AdvPlayer("Tim", "Sword",100);
		player.getHealth();
		player.loseHealth(20);
		player.getHealth();
		
	}

}
