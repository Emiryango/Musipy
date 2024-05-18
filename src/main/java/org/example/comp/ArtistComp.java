package org.example.comp;

import org.example.entities.concretes.Artist;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArtistComp {

    static List<Artist>  createArtistArrayList() {
        List<Artist> artists = new ArrayList<>();
        System.out.println("-------------------------- Add Artist Info --------------------------");
        System.out.println("Creating Artist. (write '.' as the name when you are finish) ");

        while (true) {
            System.out.println("Please enter the information of the artist: ");
            String name = System.console().readLine();
            if (name.equals(".")) {
                break;
            }
            Artist artist = createArtist(name);

            if (artist != null) {
                artists.add(artist);
            }

        }
        return artists;
    }

    private static Artist createArtist(String name){
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                break;
            } catch (Exception e) {
                System.out.println("Please choose correctly");
                return null;
            }
        }
        return new Artist(name);
    }
}
