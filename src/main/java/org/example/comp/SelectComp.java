package org.example.comp;

import org.example.entities.abstracts.Song;
import org.example.module.Singleton.Singleton;

import java.util.List;
public class SelectComp {
    public static Song selectSong() {
        Singleton songBookSingleton = Singleton.getSituation();
        List<Song> songList = songBookSingleton.getSingletonList();
        Song song;

        org.example.comp.SongLister.listSong();
        System.out.println("Select the song you want (Enter Song No): ");
        int choice;

        while (true){
            try {
                choice = Integer.parseInt(System.console().readLine());

                if(choice < songList.size() && choice >= 0)
                    break;
                else
                    System.out.println("Please choose correctly.");

            } catch (Exception e) {
                System.out.println("Please choose correctly.");
            }
        }
        song = songList.get(choice);

        return song;
    }

}
