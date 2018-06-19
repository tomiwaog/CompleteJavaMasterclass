package musicPlayerAppV2;

import java.util.LinkedList;
import java.util.List;

public class Album {
	private String albumName;
	private String artist;
	private SongList songs;

	public Album(String albumName, String artist) {
		super();
		this.albumName = albumName;
		this.artist = artist;
		songs = new SongList();
	}

	public String getArtist() {
		return artist;
	}

	public String getAlbumName() {
		return albumName;
	}

	public boolean addSong(String songName, double duration) {
		return this.songs.addSong(new Song(songName, duration));
	}

	public Song findSong(String songName) {
		return songs.findSong(songName);
	}

	public boolean addToPlayList(int trackNumber, List<Song> playList) {
		Song checkSongByNum = this.songs.findSong(trackNumber);
		if (checkSongByNum != null) {
			playList.add(checkSongByNum);
			return true;
		}
		System.out.println("The album '"+this.albumName+"' does not contain track " + trackNumber);
		return false;
	}

	public boolean addToPlayList(String songTitle, List<Song> playList) {
		Song checkSong = songs.findSong(songTitle);
		if (checkSong != null) {
			playList.add(checkSong);
			return true;
		} else {
			System.out.println("The song " + songTitle
					+ " is not in this album");
			return false;
		}
	}

	class SongList {
		// Inner Class
		private LinkedList<Song> songsList;

		SongList() {
			this.songsList = new LinkedList<Song>();
		}

		public boolean addSong(Song song) {
			if (this.songsList.contains(song)) {
				return false;
			} else {
				this.songsList.add(song);
				return true;
			}
		}

		public Song findSong(String songName) {
			for (Song checkedSong : this.songsList) {
				if (checkedSong.getTitle().equals(songName)) {
					return checkedSong;
				}
			}
			return null;
		}

		public Song findSong(int songIndex) {
			int index = songIndex - 1;
			if (index >= 0 && index < songsList.size()) {
				return songsList.get(index);
			}
			return null;
		}
	}
}
