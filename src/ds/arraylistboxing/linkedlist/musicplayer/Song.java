package ds.arraylistboxing.linkedlist.musicplayer;

public class Song {
	private String title;
	private Double duration;
	
	public Song(String title, Double duration) {
		super();
		this.title = title;
		this.duration = duration;
	}
	
	public static Song newSong(String title, Double duration){
		return new Song(title,duration);
	}

	public String getTitle() {
		return title;
	}

	public Double getDuration() {
		return duration;
	}
	
	public String toString(){
		return title + " : "+duration;
	}
}
