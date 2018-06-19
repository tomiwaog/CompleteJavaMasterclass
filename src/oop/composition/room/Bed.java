package oop.composition.room;

public class Bed {
	private String brand,bedtype;
	private int height, sheets, pillows, quilts;
	
	
	public Bed(String brand, String bedtype, int height,
			int sheets, int pillows, int quilts) {
		super();
		this.brand = brand;
		this.bedtype = bedtype;
		this.height = height;
		this.sheets = sheets;
		this.pillows = pillows;
		this.quilts = quilts;
	}

	

	public String getBrand() {
		return brand;
	}



	public String getBedtype() {
		return bedtype;
	}



	public int getHeight() {
		return height;
	}



	public int getSheets() {
		return sheets;
	}



	public int getPillows() {
		return pillows;
	}



	public int getQuilts() {
		return quilts;
	}



	public void make() {
		System.out.println("Bed->Making");
		
	}
}
