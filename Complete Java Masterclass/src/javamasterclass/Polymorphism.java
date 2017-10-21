package javamasterclass;

class Movie {

	private String name;

	public Movie(String name) {
		this.name = name;
	}

	public String plot() {
		return "no plot here";
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
}

class Jaws extends Movie {

	public Jaws() {
		super("Jaws");
	}
	public String plot(){
		return "Shark eats lots of people";
	}
}

class BigDaddy extends Movie{

	public BigDaddy() {
		super("Big Daddy");
	}
	
	public String plot(){
		return "Grown Adam Sandler has no job, looked down on by Ex";
	}
}

class IndependenceDay extends Movie{

	public IndependenceDay() {
		super("Independence Day");
	}

	@Override
	public String plot() {
		return "Alians attends to take over the planet";
	}	
}

class MazeRunner extends Movie{

	public MazeRunner() {
		super("Maze Runner");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String plot() {
		// TODO Auto-generated method stub
		return "Kids try and escape a maze";
	}	
}

class Forgetable extends Movie{

	public Forgetable() {
		super("Forgetable");
		// TODO Auto-generated constructor stub
	}
}

public class Polymorphism {
	public static void main(String[] args) {
		//System.out.println((int) (Math.random()));
		
		for (int i=1;i<=15;i++){
			Movie movie = randomMovie();
			System.out.println("Movie #"+i
					+ " : "+movie.getName()+"\n"
							+ movie.plot());
		}
		
	}
	
	public static Movie randomMovie(){
		int randomNum = (int)(Math.random()*5)+1;
		System.out.println("rando was "+randomNum);
		switch(randomNum){
			case 1:
				return new Jaws();
			case 2:
				return new BigDaddy();
			case 3:
				return new IndependenceDay();
			case 4:
				return new MazeRunner();
			case 5:
				return new Forgetable();
		}
		return null;
	}
}
