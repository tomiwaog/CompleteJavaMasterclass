package oop.composition.pc;

public class PC {
	private Case theCase;
	private Monitor monitor;
	private MotherBoard motherboards;

	public PC(Case theCase, Monitor monitor, MotherBoard motherboards) {
		super();
		this.theCase = theCase;
		this.monitor = monitor;
		this.setMotherboards(motherboards);
	}
	
	public void powerUp(){
		theCase.pressPowerBtn();
		drawLogo();
	}

	private void drawLogo() {
		monitor.drawPixelAt(1200, 30, "Green");
	}

	public MotherBoard getMotherboards() {
		return motherboards;
	}

	public void setMotherboards(MotherBoard motherboards) {
		this.motherboards = motherboards;
	}

}
