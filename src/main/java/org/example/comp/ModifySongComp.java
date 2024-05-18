package org.example.comp;

import org.example.entities.abstracts.Song;
import org.example.entities.concretes.Playlist;
import org.example.entities.concretes.Artist;
import org.example.module.modification.ModifySong;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ModifySongComp {

    private Song song = chooseSongModify();
    ModifySong modifySong = new ModifySong(song);

    void modifySong() {
        System.out.println("---------------- Modify Song -----------------");
        System.out.println("1.Modify Song Name");
        System.out.println("2.Modify Song Artist");;
        System.out.println("3.Modify Song Playlist");
        System.out.println("4.Exit");
        System.out.println("------------------------------------------------");

        System.out.print("Enter your choice: ");
        int choice;
        while(true) {
            try {
                choice = Integer.parseInt(System.console().readLine());
                break;
            } catch (Exception e) {
                System.out.println("Please Choose Correctly.");
            }
        }
        switch (choice) {
            case 1:
                System.out.println("Modify Song Name selected");
                modifyName();
                break;
            case 2:
                System.out.println("Modify Recipe Artists selected");
                modifyArtist();
                break;
            case 3:
                System.out.println("Modify Recipe Playlist selected");
                modifyPlaylist();
                break;
            case 4:
                System.out.println("Exiting Song Modification...");
                break;
            default:
                System.out.println("Please choose correctly.");
                break;
        }

    }
    private  void modifyName() {
        System.out.println("Enter new name: ");
        String newName = System.console().readLine();
        modifySong.modifyName(newName);
        System.out.println("Song name changed to: " + song.getName());
        System.out.println("Here is your new song: ");
        SongsListComp.showSong(song);
    }




    private  void modifyArtist() {
        List<Artist> artists = ArtistComp.createArtistArrayList();
        modifySong.modifyArtist(artists);
        System.out.println("Song artists modified successfully " );
        System.out.println("Here is your new song: ");
        SongsListComp.showSong(song);
    }



    private  void modifyPlaylist() {
        HashSet<Playlist> playlists = PlaylistComp.createPlaylist();
        modifySong.modifyPlaylist(playlists);
        System.out.println("Song playlists modified successfully " );
        SongsListComp.showSong(song);
    }

    private Song chooseSongModify() {
        return SelectComp.selectSong();
    }


}
