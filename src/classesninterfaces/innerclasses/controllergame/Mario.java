package classesninterfaces.innerclasses.controllergame;

public class Mario implements Button.OnClickListener {

	@Override
	public void onClick(String title) {
		System.out.println("Button '" + title + "' detected for "
				+ getClass().getSimpleName());
		if (title == "A")
			System.out.println("A for Attack");
		else if (title == "B")
			System.out.println("B shoots fireballs");
		else if (title == "left")
			System.out.println("Left Direction");
		else if (title == "right")
			System.out.println("Right Direction");
		else
			System.out.println("button not familiar");
	}
}