package abstractninterfaces.interfaces.playermonster;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
	private String name;
	private int hitPoints;
	private int strength;
	private String weapon;

	//Constructor
	public Player(String name, int hitPoints, int strength) {
		super();
		this.name = name;
		this.hitPoints = hitPoints;
		this.strength = strength;
		this.weapon = "Sword";
	}

	//Setters and getters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	//Overriding built-in toString() method
	@Override
	public String toString() {
		return "Player [name=" + name + ", hitPoints=" + hitPoints
				+ ", strength=" + strength + ", weapon=" + weapon + "]";
	}

	/**
	 * Method creates a new List,
	 * Adds object's states to the list
	 */
	@Override
	public List<String> write() {
		List<String> values = new ArrayList<String>();
		//Saves object's states to the list
		values.add(0, this.name);
		values.add(1,""+ this.hitPoints);
		values.add(2,""+ this.strength);
		values.add(3,this.weapon);
		return values;
	}

	/**
	 * Method reads value from an input (list type) and assigns them to state of object calling it. i.e loads the data
	 */
	@Override
	public void readValues(List<String> savedValues) {
		//Checks for list instantiation && emptiness
		if (savedValues != null && savedValues.size()>0){
			this.name = savedValues.get(0);
			//In the write() method hitPoint was saved to index 1, and strengths 2.
			this.hitPoints = Integer.parseInt(savedValues.get(1));
			this.strength = Integer.parseInt(savedValues.get(2));
			this.weapon = savedValues.get(3);
		}
	}

	
}
