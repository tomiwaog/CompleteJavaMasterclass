package oop.composition.room;

public class BedRoom {
	private String roomName;
	private String size;
	
	private Bed bed;
	private Chair chair;
	private Wall wal1,wall2,wall3,wall4;
	private Ceiling celing;
	private Lamp lamp;
	
	public BedRoom(String roomName, Bed bed, Wall wal1, Wall wall2, Wall wall3,
			Wall wall4, Ceiling ceiling, Lamp lamp) {
		this(roomName, "",bed,new Chair(),wal1,wall2,wall3,wall4,ceiling,lamp);
	}


	public BedRoom(String roomName, String size, Bed bed, Chair chair, Wall wal1,
			Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Lamp lamp) {

		this.roomName = roomName;
		this.size = size;
		this.bed = bed;
		this.chair = chair;
		this.wal1 = wal1;
		this.wall2 = wall2;
		this.wall3 = wall3;
		this.wall4 = wall4;
		this.celing = ceiling;
		this.lamp = lamp;
	}

	
	public String getRoomName() {
		return roomName;
	}


	public String getSize() {
		return size;
	}


	public Bed getBed() {
		return bed;
	}


	public Chair getChair() {
		return chair;
	}


	public Wall getWal1() {
		return wal1;
	}


	public Wall getWall2() {
		return wall2;
	}


	public Wall getWall3() {
		return wall3;
	}


	public Wall getWall4() {
		return wall4;
	}


	public Ceiling getCeling() {
		return celing;
	}



	
	public void makeBed(){
		System.out.println("Making bed!");
		bed.make();
	}
	
	public Lamp getLamp(){
		return this.lamp;
	}
	
}
