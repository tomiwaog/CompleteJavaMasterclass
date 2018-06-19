package oop.polymorphism;

public class Movie {
	private String name;

	public Movie(String name) {
		this.name = name;
	}

	public String plot() {
		return "no plot here";
	}

	public String getName() {
		return name;
	}
}

class Jaws extends Movie {

	public Jaws() {
		super("Jaws");
	}

	public String plot() {
		return "Shark eats lots of people";
	}
}

class BigDaddy extends Movie {

	public BigDaddy() {
		super("Big Daddy");
	}

	public String plot() {
		return "Grown Adam Sandler has no job, looked down on by Ex";
	}
}

class IndependenceDay extends Movie {

	public IndependenceDay() {
		super("Independence Day");
	}

	@Override
	public String plot() {
		return "Alians attempts to take over the planet";
	}
}

class MazeRunner extends Movie {

	public MazeRunner() {
		super("Maze Runner");
	}

	@Override
	public String plot() {
		return "Kids try and escape a maze";
	}
}

class Forgetable extends Movie {

	public Forgetable() {
		super("Name forgotten");
	}
}


