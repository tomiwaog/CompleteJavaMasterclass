package oop.polymorphism;

public class MovieMain{
	public static void main(String[] args) {	
//		Robot x = new Robot();
//		System.out.println(x.getName());
		
		for (int i = 1; i <= 10; i++) {
			Movie movieRetrieved = randomMovie();
			System.out.println("Main #" + i + " : " + movieRetrieved.getName()
					+ "\n" + movieRetrieved.plot());
		}
	}	
	
	public static Movie randomMovie() {
		//Generates random number
		int randomNum = (int) (Math.random() * 6) + 1;
		switch (randomNum) {
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
		case 6:
			return new Robot();
		}
		return null;
	}
	
}