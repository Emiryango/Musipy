package org.example.comp;

import org.example.entities.abstracts.Song;

public class RateChooseComp {
    public static void SongRating() {

        System.out.println("Choose 1 to show rating by average");
        System.out.println("Choose 2 to show rating by total ratings");

        int choice;
        while (true){
            try {
                choice = Integer.parseInt(System.console().readLine());
                if(choice < 1 || choice > 2)
                    System.out.println("Please choose correctly.");
                else
                    break;
            } catch (Exception e) {
                System.out.println("Please choose correctly.");
            }
        }

        if(choice == 1)
            SongLister.listSongAverageRating();
        else
            SongLister.listSongTotalRating();
    }
}
