package Projects;

public class Main {

	public static void main(String[] args) {
/*		// TODO Auto-generated method stub
		BMW x = new BMW(36);
		x.accelerate(30);
		x.accelerate(20);*/
		
		Printer p1 = new Printer(32,true);
		p1.getTonerLevel();
		
		for (int i=0;i<27;i++)
			p1.usePrinter();
		
		p1.fillToner(70);
		
		p1.getPagePrint();
	}

}
