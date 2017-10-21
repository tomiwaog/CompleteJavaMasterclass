package Projects;

public class BMW extends Car {
	public int getRoadServiceMonths() {
		return roadServiceMonths;
	}

	private int roadServiceMonths;

	public BMW(int roadServiceMonths) {
		super("BMW", "4WD", 5, 5, 6, false);
		this.roadServiceMonths = roadServiceMonths;
	}

	public void accelerate(int rate){
		int newVelocity = getCurrentVelocity()+rate;
		System.out.println("Velocity is "+ newVelocity);
		if (newVelocity == 0)
			stop();
		else if (newVelocity >0 && newVelocity<=10)
			changeGear(1);
		else if (newVelocity>10 && newVelocity<=20)
			changeGear(2);
		else if (newVelocity>20 && newVelocity<=30)
			changeGear(3);
		else if (newVelocity>30 && newVelocity<=40)
			changeGear(4);
		else
			changeGear(5);
		
		if (newVelocity >0)
			changeVelocity(newVelocity, getCurrentDirection());
	}
}
