package microprojects.mobilephone;

public class SimTypes {
	private String[] allTypes = { "Standard", "Micro", "Nano" };
	private String simSize = "";
	protected String simTypeName;

	protected String getSimSize() {
		if (simTypeName == "Standard") {
			simSize = "25x15mm";
		} else if (simTypeName == "Micro") {
			simSize = "15x12mm";
		} else if (simTypeName == "Nano") {
			simSize = "12.3x8.8mm";
		} else {
			simSize = null;
		}
		return simSize;
	}

	public void setSimTypeName(String name) {
		for (String eachType : allTypes) {
			if (eachType == name) {
				simTypeName = name;
			}
			System.out.println("Sim Type not Set");
		}
	}

	public String getSimTypeName() {
		return simTypeName;
	}

}
