package room;

public class Lamp {

	private String style;
	public String getStyle() {
		return style;
	}
	public String getName() {
		return name;
	}
	public boolean isBattery() {
		return battery;
	}
	public int getBulbRating() {
		return bulbRating;
	}
	private String name;
	private boolean battery;
	private int bulbRating;
	
	public void turnOn(){
		System.out.println("Lamp is turning on");
	}
}
