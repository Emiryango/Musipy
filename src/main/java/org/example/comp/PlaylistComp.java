package org.example.comp;

import org.example.entities.concretes.Playlist;

import java.util.HashSet;

public class PlaylistComp {

    static HashSet<Playlist> createPlaylist() {
        HashSet<Playlist> playlists = new HashSet<Playlist>(3);

        System.out.println("-------------------------- PLAYLISTS --------------------------");

        System.out.println("Please Choose the category of the recipe (up to 3 different Categories): ");
        System.out.println("1.Playlist1            2.Playlist2              3.Playlist3 ");
        System.out.println("4.Playlist4            5.Playlist5              6.Playlist6 ");
        System.out.println("7.None                                                      ");


        while (playlists.size() < 2) {
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(System.console().readLine());
            if (choice == 7) break;
            switch (choice) {
                case 1:
                    playlists.add(Playlist.Playlist1);
                    break;
                case 2:
                    playlists.add(Playlist.Playlist2);
                    break;
                case 3:
                    playlists.add(Playlist.Playlist3);
                    break;
                case 4:
                    playlists.add(Playlist.Playlist4);
                    break;
                case 5:
                    playlists.add(Playlist.Playlist5);
                    break;
                case 6:
                    playlists.add(Playlist.Playlist6);
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Please choose correctly");
                    break;
            }
        }
        return playlists;
    }

    static Playlist choosePlaylist() {

        System.out.println("-------------------------- PLAYLISTS --------------------------");
        System.out.println("1.Playlist1            2.Playlist2              3.Playlist3 ");
        System.out.println("4.Playlist4            5.Playlist5              6.Playlist6 ");
        System.out.println("7.None                                                      ");

        System.out.print("Select the category: ");

        int choice;
        while (true) {
            try {
                choice = Integer.parseInt(System.console().readLine());
                if (choice > 0 && choice < 8) break;
                else System.out.println("Please choose correctly");
            } catch (Exception e) {
                System.out.println("Please choose correctly");
            }
        }
        Playlist playlist = Playlist.NONE;

        switch (choice) {
            case 1:
                playlist = Playlist.Playlist1;
                break;
            case 2:
                playlist = Playlist.Playlist2;
                break;
            case 3:
                playlist = Playlist.Playlist3;
                break;
            case 4:
                playlist = Playlist.Playlist4;
                break;
            case 5:
                playlist = Playlist.Playlist5;
                break;
            case 6:
                playlist = Playlist.Playlist6;
                break;
            case 7:
                playlist = Playlist.NONE;
                break;
            default:
                System.out.println("Please choose correctly");
                break;
        }
        return playlist;
    }
}
