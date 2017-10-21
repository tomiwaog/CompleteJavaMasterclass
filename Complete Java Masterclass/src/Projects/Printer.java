package Projects;

public class Printer {
	private int tonerLevel;
	private boolean duplex;
	private int pagePrint;

	public boolean isDuplex() {
		return duplex;
	}

	public void fillToner(int toner) {
		if (toner > 0 && toner <= 100) {
			if (this.tonerLevel + toner <= 100)
				this.tonerLevel += toner;
			else
				System.out.println("Too much toner. Available space is "
						+ (100 - this.tonerLevel));
		} else
			System.out.println("Toner must be beween 0 and 100");

		getTonerLevel();
	}

	public Printer(int tonerLevel, boolean duplex) {
		this.tonerLevel = tonerLevel;
		this.duplex = duplex;
		this.pagePrint = 0;
	}

	public int getTonerLevel() {
		if (tonerLevel == 100)
			System.out.println("Toner level is FULL");
		else if (tonerLevel == 0)
			System.out.println("Toner is EMPTY. Please Refill");
		else if (tonerLevel < 20)
			System.out.println("Toner level is running low");

		System.out.println("Toner Level is " + tonerLevel + "\n");
		return tonerLevel;
	}

	public void usePrinter() {
		if (tonerLevel > 1 && !isDuplex()) {
			printPage();
			tonerLevel -= 2;
		} else if (tonerLevel > 3 && isDuplex()){
			printPage();
			tonerLevel -= 4;
		}
		else
			System.out.println("cannot Print.");
		getTonerLevel();
	}

	private void printPage() {
		System.out.println("Ive just printed a page");
		pagePrint++;
	}

	public int getPagePrint() {
		System.out.println("You printed a total of "+ pagePrint+ " pages");
		return pagePrint;
	}
}
