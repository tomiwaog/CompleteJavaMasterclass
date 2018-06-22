package classesninterfaces.innerclasses;
import java.util.ArrayList;
import java.util.List;

/**
 * BASE Class
 * @author Tomiwa Ogunbamowo
 *
 */
public class GearBox {
	private List<Gear> gears;
	private int maxGears;
	private int currentGear= 0;
	private boolean clutchIsIn;

	public GearBox(int maxGears) {
		this.maxGears = maxGears;
		this.gears = new ArrayList<Gear>();

		Gear neutral = new Gear(0, 0.0);
		this.gears.add(neutral);
		
		//addGear function only allows add from gear 1
		//Hence the for loop below doesn't affect the neutral gear above
		for (int i=0;i<maxGears;i++){
			//This is used instead of User creating Gear object
			addGear(i,i*5.3);
		}
	}

	/**
	 * INNER Class which is a member of GearBox
	 * @author Tomiwa Ogunbamowo
	 *
	 */
	private static class Gear {
		// Inner Class - class within a class
		private int gearNumber;
		private double ratio;
		public Gear(int gearNumber, double ratio) {
			super();
			//this.gearNumber ref to Gear Class
			this.gearNumber = gearNumber;
			this.ratio = ratio;
		}

		@SuppressWarnings("unused")
		public int getGearNumber() {
			return gearNumber;
		}

		public double getRatio() {
			return ratio;
		}

		@SuppressWarnings("unused")
		public double driveSpeed(int revs) {
			return revs * (this.ratio);
		}
	}
	
	public void operateClutch(boolean in) {
		this.clutchIsIn = in;
	}

	public void addGear(int number, double ratio){
		//Starts from 1 as we already have neutral with gear 0
		if (number>0 && number<=maxGears){
			this.gears.add(new Gear(number,ratio));
		}
	}
	
	public void changeGear(int number){
		if (number>=0 && number<=maxGears && number<gears.size() && clutchIsIn){
			//Can only change gear while Clutch is down and is less than maxGear possible
			this.currentGear = number;
			System.out.println("Gear "+currentGear+ " selected");
		}else{
			System.out.println("Grind!");
			currentGear = 0;
		}
	}

	public double wheelSpeed(int revs){
		if (clutchIsIn){
			System.out.println("Scream!!!");
			return 0.0;
		}
		else{
			//Gets wheel-spin when clutch is no longer on
			return revs * gears.get(currentGear).getRatio();
		}
	}
}

