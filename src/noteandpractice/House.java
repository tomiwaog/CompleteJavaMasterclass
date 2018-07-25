package noteandpractice;

public class House {
	// Polymorphism demonstration
	Number printNum() {
		return 30;
	}

	public static void main(String[] args) {
		House house = new House();
		House room = new Room();
		System.out.println(house.printNum());
		System.out.println(room.printNum());
	}
}

class Room extends House {

	@Override
	Integer printNum() {
		// Override of Class with subclass demonstration.
		return 15;
	}

}