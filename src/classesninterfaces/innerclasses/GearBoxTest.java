package classesninterfaces.innerclasses;

public class GearBoxTest {

	public static void main(String[] args) {
		GearBox mcLaren = new GearBox(6);
		//Possible to create new Gear object if Gear class was public as below
		 //GearBox.Gear first= mcLaren.new Gear(1, 12.3); //Declaring inner class
		// TGEar change Scenario: Clutch down->Change Gear-> clutch up
		mcLaren.operateClutch(true);
		mcLaren.changeGear(1);
		mcLaren.operateClutch(false);
		System.out.println(mcLaren.wheelSpeed(1000));
		mcLaren.changeGear(2); // Expected to fail since Clutch is off prior to
								// function call. WheelSpin reset to zero
		System.out.println(mcLaren.wheelSpeed(3000));
		mcLaren.operateClutch(true);
		// Also expected to fail while Clutch is still on
		mcLaren.changeGear(3);
		System.out.println(mcLaren.wheelSpeed(6000)); 
		mcLaren.changeGear(3);
		mcLaren.operateClutch(false);
		System.out.println(mcLaren.wheelSpeed(6000)); // Pass

	}
}