package classesninterfaces.innerclasses.controllergame;

import classesninterfaces.innerclasses.controllergame.Button.OnClickListener;

public class Mains {

	public static void main(String[] args) {
		Button a = new Button("A");
		Button b = new Button("B");
		Button x = new Button("X");
		Button y = new Button("Y");

		// Outer Class
		OnClickListener marioGame = new Mario();
		a.setOnClickListener(marioGame);
		a.onClick();

		b.setOnClickListener(marioGame);
		b.onClick();

		// Emulator Games requires button - Inner anonymous class
		a.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(String title) {
				System.out.println("Emulator using button " + title);
			}
		});
		b.onClick();

		// Inner anonymous class
		y.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(String title) {
				System.out.println("Emulator using button" + title);
			}
		});
		y.onClick();

		a.setOnClickListener(new StreetFighter());
		a.onClick();
		b.setOnClickListener(new StreetFighter());
		b.onClick();
		x.setOnClickListener(new StreetFighter());
		x.onClick();
		y.setOnClickListener(new StreetFighter());
		y.onClick();


		//Local Class
		class Checkers implements Button.OnClickListener {
			@Override
			public void onClick(String title) {
				System.out.println("Checkers detected "+title);
			}
		}

		a.setOnClickListener(new Checkers());
		a.onClick();

	}

}

class StreetFighter implements Button.OnClickListener {

	@Override
	public void onClick(String title) {
		System.out.println("Button: " + title + " on "
				+ getClass().getSimpleName());
		System.out.println("COMBO ACTIVATED on " + title);
	}

}