package noteandpractice;

import java.util.ArrayList;
import java.util.List;

public class Tom {

	public static void main(String[] args) {
		List<Animals> animals = new ArrayList<>();
		animals.add(new Animals("Snake", false, false));
		animals.add(new Animals("Kangaroo", true, false));
		animals.add(new Animals("Frog", true, true));
		animals.add(new Animals("Kangaroo", true, false));
		animals.add(new Animals("Dolphin", false, true));

		print(animals, new checkHop());
		System.out.println("Print Swimmable Animals\n");
		print(animals, new checkSwim());
	}

	static void print(List<Animals> animalList, checkTrait checker) {
		for (Animals animal : animalList) {
			if (checker.test(animal)) {
				System.out.println(animal);
			}
		}
	}
}

class checkHop implements checkTrait {
	public boolean test(Animals animal) {
		return animal.canHop;
	}
}

class checkSwim implements checkTrait{
	public boolean test(Animals animal) {
		return animal.canSwim;
	}
}
interface checkTrait {
	boolean test(Animals a);
}

class Animals {
	String name;
	boolean canHop = true;
	boolean canSwim = true;

	Animals(String name, boolean hop, boolean swim) {
		this.name = name;
		this.canHop = hop;
		this.canSwim = swim;
	}

	public String toString() {
		return name;
	}
}