package org.example.comp;

import org.example.entities.concretes.Playlist;
import org.example.module.search.Search;

public class SearchComp {
    static Search search = new Search();
    public static void SearchSong() {
        System.out.println("---------------- Search Song -----------------");
        System.out.println("1.Search Song By Name");
        System.out.println("2.Search Song By Playlist");
        System.out.println("3.Search Song By Artist");
        System.out.println("------------------------------------------------");

        System.out.print("Enter your choice: ");
        int choice;
        while (true) {
            try {
                choice = Integer.parseInt(System.console().readLine());
                break;
            } catch (Exception e) {
                System.out.println("Please choose correctly.");
                return;
            }
        }

        switch (choice) {
            case 1:
                searchSongName();
                break;
            case 2:
                searchSongPlaylist();
                break;
            case 3:
                searchSongArtist();
                break;
            default:
                System.out.println("Please choose correctly.");
                break;
        }
    }
    public static void searchSongName() {
        System.out.println("---------- Search Song By Name ----------");
        System.out.print("Enter Song name: ");
        String name = System.console().readLine();
        search.searchSongName(name);
        System.out.println("-------------------------------------------");

    }
    private static void searchSongPlaylist() {
        System.out.println("---------- Search Song by Playlist ----------");
        Playlist playlist = PlaylistComp.choosePlaylist();
        search.searchSongPlaylist(playlist);
        System.out.println("-----------------------------------------------");
    }

    private static void searchSongArtist() {
        System.out.println("---------- Search Song Artist ----------");
        System.out.println("Enter Artis name: ");
        String name = System.console().readLine();
        search.searchSongArtist(name);
        System.out.println("-------------------------------------------------");
    }

}
