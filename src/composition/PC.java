package composition;

public class PC {
	private Case theCase;
	private Monitor monitor;
	private MotherBoard motherboards;

	public Case getTheCase() {
		return theCase;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public MotherBoard getMotherboards() {
		return motherboards;
	}

	public PC(Case theCase, Monitor monitor, MotherBoard motherboards) {
		super();
		this.theCase = theCase;
		this.monitor = monitor;
		this.motherboards = motherboards;
	}

}
