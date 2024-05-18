package org.example.comp;

import org.example.entities.abstracts.Song;

public class RateSongComp {
    public static void RateSong() {

        System.out.println("----------------  Rate Song  ---------------- ");
        Song song = SelectComp.selectSong();
        System.out.println("----------------------------------------------");

        System.out.println("Enter rating between 0-10: ");

        float rating;
        while (true){
            try {
                rating = Integer.parseInt(System.console().readLine());
                if(rating < 0 || rating > 10)
                    System.out.println("Please choose correctly.");
                else
                    break;
            } catch (Exception e) {
                System.out.println("Please choose correctly.");
            }
        }

        song.addRate(rating);
    }
}
