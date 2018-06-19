package nestedClasses;

public class GearBoxTest {

	public static void main(String[] args) {
		GearBox mcLaren = new GearBox(6);
		// can create new Gear object if Gear class was public as bellow
		// GearBox.gear first= mcLaren.new(1,20.3);
		// TGEar change Scenario: Clutch down->Change Gear-> clutch up
		mcLaren.operateClutch(true);
		mcLaren.changeGear(1);
		mcLaren.operateClutch(false);
		System.out.println(mcLaren.wheelSpeed(1000));
		mcLaren.changeGear(2); // Expected to fail since Clutch is off prior to
								// function call. WheelSpin reset to zero
		System.out.println(mcLaren.wheelSpeed(3000));
		mcLaren.operateClutch(true);
		mcLaren.changeGear(3);
		System.out.println(mcLaren.wheelSpeed(6000)); // Also expected to fail
														// while Clutch is still
														// on
		mcLaren.changeGear(3);
		mcLaren.operateClutch(false);
		System.out.println(mcLaren.wheelSpeed(6000)); // Pass

	}
}