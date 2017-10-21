package oop;

public class Fish extends Animal{
	public Fish(String name, int size, int weight, int gills, int eyes, int fin) {
		super(name, 1, 1, size, weight);
		// TODO Auto-generated constructor stub
		this.gills = gills;
		this.eyes=eyes;
		this.fin= fin;
	}

	private int gills,eyes, fin;
	
	public int getGills() {
		return gills;
	}
	public int getEyes() {
		return eyes;
	}
	public int getFin() {
		return fin;
	}
	public void rest(){
		
	}
	public void moveMuscles(){
		
	}
	public void moveBackFin(){
		
	}
	
	public void swim(int speed){
		moveMuscles();
		moveBackFin();
		super.move(speed); 
	}
}
