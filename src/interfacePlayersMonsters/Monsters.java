package interfacePlayersMonsters;

import java.util.ArrayList;
import java.util.List;

public class Monsters implements ISaveable{
	private String name;
	private int hitPoints;
	private int strengths;
	
	//Constructors
	public Monsters(String name, int hitPoints, int strengths) {
		super();
		this.name = name;
		this.hitPoints = hitPoints;
		this.strengths = strengths;
	}
	
	
	public String getName() {
		return name;
	}


	public int getHitPoints() {
		return hitPoints;
	}


	public int getStrengths() {
		return strengths;
	}


	@Override
	public List<String> writeToList() {
		ArrayList<String> values = new ArrayList<String>();	
		values.add(0, this.name);
		values.add(1, ""+this.hitPoints);
		values.add(2, ""+this.strengths);
		return values;
	}

	@Override
	public void read(List<String> savedValues) {
		//Reads indexes from a List
		//If list is instantiated and not empty
		if (savedValues != null && savedValues.size()>0){
			//indexes of the list is assign to object states
			this.name = savedValues.get(0);
			this.hitPoints = Integer.parseInt(savedValues.get(1));
			this.strengths = Integer.parseInt(savedValues.get(2));
		}
	}


	@Override
	public String toString() {
		return "Monsters [name=" + name + ", hitPoints=" + hitPoints
				+ ", strengths=" + strengths + "]";
	}


}
