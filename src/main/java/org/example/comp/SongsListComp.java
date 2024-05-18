package org.example.comp;

import org.example.entities.abstracts.Song;
import org.example.entities.concretes.Artist;

import java.util.ArrayList;

public class SongsListComp {

    static void showSong(Song song, int songIndex) {
        System.out.println("---------------------------------------------------------");
        System.out.println("Recipe No: " +songIndex +
                "\n# Song Name: "+ song.getName() +" from the "+ song.getType());
        System.out.println("--------------------------------------------------------");
        System.out.println("Rating : "+ song.getAverageRate());
        System.out.println("--------------------------------------------------------");
        System.out.println("Playlist: " + song.getPlaylist() );
        System.out.println("--------------------------------------------------------");
        System.out.println("Artist");
        getArtist(song);
        System.out.println("--------------------------------------------------------");
    }

    public static void showSong(Song song){
        System.out.println("---------------------------------------------------------");
        System.out.println(""+ song.getName() +" from the "+ song.getType());
        System.out.println("--------------------------------------------------------");
        System.out.println("Rating : "+ song.getAverageRate());
        System.out.println("--------------------------------------------------------");
        System.out.println("Playlist: " + song.getPlaylist() );
        System.out.println("--------------------------------------------------------");
        System.out.println("Artist");
        getArtist(song);
        System.out.println("--------------------------------------------------------");
    }


    private static void getArtist(Song song) {
        for (Artist artist : song.getArtist()) {
            System.out.println(" ");
            System.out.println(" "+artist.getName());
        }
    }


    public static void showAverageRating(Song song){
        System.out.println("--------------------------------------------------------");
        System.out.println("Song Name: "+ song.getName() +"    Rate: "+ song.getVote()+ "  ");
        System.out.println("--------------------------------------------------------");
    }
}
