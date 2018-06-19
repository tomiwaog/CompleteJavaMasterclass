package oop.encapsulation.printer;


public class Main {

	public static void main(String[] args) {
		
		Printer p1 = new Printer(50,true);
		//p1.getTonerLevel();
		p1.printPages(4);
		//p1.fillToner(70);
		
		p1.getPagePrint();
		p1.printPages(2);
		p1.getPagePrint();
	}

}
