package ds.arraylistboxing.linkedlist.musicplayer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

	private static List<Album> albumList = new ArrayList<Album>();

	public static void main(String[] args) {

		// Albums objects
		Album tpab = new Album("To Pimp a Butterfly", "Kend");
		Album machinology = new Album("Machinology", "Mack");

		// Songs added to Album
		tpab.addSong("Invisible", 4.2);
		tpab.addSong("King Kunta", 3.54);
		tpab.addSong("Institutionalized", 3.54);
		tpab.addSong("The Blacker the Berry", 3.54);
		tpab.addSong("Complexion", 3.54);
		albumList.add(tpab);

		machinology.addSong("Goodbye", 3.3);
		machinology.addSong("Beware of Goose", 5.0);
		albumList.add(machinology);

		List<Song> playList = new ArrayList<Song>();
		//Adding Item from the Album[0] to Playlist
		//Addition to playlist is valid as long as song is from the right album
		albumList.get(0).addToPlayList("Invisible", playList);
		albumList.get(0).addToPlayList("King Kunta", playList);
		albumList.get(0).addToPlayList("The Blacker the Berry", playList);
		albumList.get(0).addToPlayList("Beware of Goose", playList);
		albumList.get(0).addToPlayList(5, playList);
		
		//Adding songs from album machinology to playlist
		//Using track number instead of songTitle
		albumList.get(1).addToPlayList(3, playList);
		albumList.get(1).addToPlayList(1, playList);

		playMusicPlayList(playList);
	}

	public static void playMusicPlayList(List<Song> musicPlayList) {
		ListIterator<Song> i = musicPlayList.listIterator();
		System.out
				.println("\nNow Playing... " + i.next().toString());
		boolean quit = false;
		boolean goingForward = true;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		while (!quit) {
			int userOption = scanner.nextInt();
			scanner.nextLine();
			switch (userOption) {
			case 0:
				// Replay Current song
				if (goingForward) {
					System.out.println("Now Playing... "
							+ i.previous().toString());
					goingForward = false;
				} else {
					System.out.println("Now Playing... "
							+ i.next().toString());
					goingForward = true;
				}
				break;
			case 1:
				// Go to Previous song
				if (goingForward) {
					i.previous();
					goingForward = false;
				}
				if (i.hasPrevious()) {
					System.out.println("Now Playing... "
							+ i.previous().toString());
					goingForward = false;
				} else {
					System.out.println("Reached the start of the Playlist");
					System.out.println("Now Playing... "
							+ i.next().toString());
					goingForward = true;

				}
				break;
			case 2:
				// Next song
				if (!goingForward) {
					i.next();
				}
				if (i.hasNext()) {
					System.out.println("Now playing... "
							+ i.next().toString());
					goingForward = true;
				} else {
					System.out.println("Reached the end of the list");
					goingForward = true;
				}
				break;
			case 3:
				// Remove Current song from play-list
				if (musicPlayList.size() > 0) {
					if (i.hasNext()) {
						i.previous();
						System.out
								.println("Now playing " + i.next());
						
					} else if (i.hasPrevious()) {
						System.out.println("Now playing "
								+ i.previous());
					}
					System.out.println("song removed from the playlist.");
				}
				System.out.println("Empty!");
				break;
			case 4:
				// View Play list
				viewPlayList(musicPlayList);
				break;
			case 5:
				// Print Menu
				printMenu();
				break;
			case 6:
				quit = true;
				System.out.println("Goodbye! ...exiting Music Player...");
				break;
			}
		}
	}

	public static void viewPlayList(List<Song> musicPlayList) {
		System.out.println("Displaying your current PlayList: ");
		Iterator<Song> iterator = musicPlayList.iterator();
		int i = 0;
		System.out.println("=================================");
		if (musicPlayList.isEmpty()) {
			System.out.println("Your Play list is currently empty");
			return;
		} else {
			while (iterator.hasNext()) {
				System.out.println((++i) + ". " + iterator.next().getTitle());
			}
		}
		System.out.println("=================================");
	}

	public static void printMenu() {
		System.out.println("\nAvailable options: ");
		System.out
				.print("0 - replay | "
						+ "1 - previous song | "
						+ "2 - next song | 3 - remove current song | 4 - view playlist | 5 - Menu | 6- exit");
	}
}
