package oop.composition.room;

public class Lamp {

	private String style;
	private String name;
	private boolean battery;
	private int bulbRating;
	
	public Lamp(String style,boolean battery, int bulbRating){
		this.style = style;
		this.battery = battery;
		this.bulbRating = bulbRating;
	}
	
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
	
	public void turnOn(){
		System.out.println("Lamp is turning on");
	}
}
