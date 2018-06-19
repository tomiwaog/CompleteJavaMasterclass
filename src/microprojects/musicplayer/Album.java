package microprojects.musicplayer;
import java.util.LinkedList;
import java.util.List;

public class Album {
	private String albumName;
	private String artist;
	private LinkedList<Song> songsList;

	public Album(String albumName, String artist) {
		super();
		this.albumName = albumName;
		this.artist = artist;
		songsList = new LinkedList<Song>();
	}

	public String getArtist() {
		return artist;
	}

	public String getAlbumName() {
		return albumName;
	}

	public LinkedList<Song> getSongsList() {
		return songsList;
	}

	public boolean addSong(String songName, double duration) {
		Song songFound = findSong(songName);
		if (songFound == null) {
			this.songsList.add(new Song(songName, duration));
			return true;
		}
		System.out.println("Song already exist");
		return true;
	}

	public Song findSong(String songName) {
		for (Song checkedSong : this.songsList) {
			if (checkedSong.getTitle().equals(songName)) {
				return checkedSong;
			}
		}
		return null;
	}

	public boolean addToPlayList(int trackNumber, List<Song> playList) {
		int index = trackNumber-1;
		if ((index >= 0) && (index < this.songsList.size())) {
			playList.add(this.songsList.get(index));
			return true;
		}
		System.out.println("The album does not contain track "+ trackNumber);
		return false;
	}

	public boolean addToPlayList(String songTitle, List<Song> playList) {
		Song checkSong = findSong(songTitle);
		if (checkSong !=null){
			playList.add(checkSong);
			return true;
		}
		else{
			System.out.println("The song "+songTitle+" is not in this album");
			return false;
		}
	}
}
