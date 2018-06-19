package oop.polymorphism;
//Class must be in its own files if it required public modifier
public class Robot extends Movie{
	
	public Robot() {
		super("I Robot");
	}
	public String plot(){
		return "Robots taking over the world!";
		
	}
}
