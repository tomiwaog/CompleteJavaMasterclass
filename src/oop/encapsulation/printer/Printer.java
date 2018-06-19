package oop.encapsulation.printer;

public class Printer {
	private int tonerLevel;
	private boolean isDuplex;
	private int pagesPrinted;

	//Constructor for new instance
	public Printer(int tonerLevel, boolean duplex) {
		if (tonerLevel >= 0 && tonerLevel <= 100) {
			this.tonerLevel = tonerLevel;
		} else {
			tonerLevel = -1;
		}
		this.isDuplex = duplex;
		this.pagesPrinted = 0;
	}

	
	// Top up Printer toner - Perhaps should return boolean
	public int fillToner(int tonerAmount) {
		if (tonerAmount > 0 && tonerAmount <= 100) {
			if (this.tonerLevel + tonerAmount <= 100)
				this.tonerLevel += tonerAmount;
			else {
				System.out.println("Too much toner. Available space is "
						+ (100 - this.tonerLevel));
			}
		} else
			System.out.println("Toner must be beween 0 and 100");

		return getTonerLevel();
	}

	//getter for TonerLevel - no modification
	public int getTonerLevel() {
		if (tonerLevel == 100)
			System.out.println("Toner level is FULL");
		else if (tonerLevel <= 0)
			System.out.println("Toner is EMPTY. Please Refill");
		else if (tonerLevel < 20)
			System.out.println("Toner level is running low");
		System.out.println("Toner Level is " + tonerLevel + "\n");
		return tonerLevel;
	}
	
	public int printPages(int numberOfPages) {
		int pagesToPrint = numberOfPages;
		if (this.isDuplex) {
			pagesToPrint = ((pagesToPrint + 1) / 2);
			System.out.println("Printing in Duplex mode");
		}
		pagesPrinted += pagesToPrint;
		return pagesPrinted;
	}

	public int getPagePrint() {
		System.out.println("You printed a total of " + pagesPrinted + " pages");
		return pagesPrinted;
	}
}
