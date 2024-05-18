package org.example.comp;

import org.example.entities.abstracts.Song;
import org.example.module.rate.concretes.TotalStrategy;
import org.example.module.Singleton.Singleton;

import java.util.List;

public class SongLister {
    static Singleton BookSingleton = Singleton.getSituation();

    public static void listSong() {
        List<Song> songList = BookSingleton.getSingletonList();
        Song song;
        for (int i = 0; i < songList.size(); i++) {
            song = songList.get(i);
            SongsListComp.showSong(song, i);
        }
    }


    public static void listSongTotalRating() {
        List<Song> songList = BookSingleton.getSingletonList();
        Song song;
        for (int i = 0; i < songList.size(); i++) {
            song = songList.get(i);
            song.setRateStrategy(new TotalStrategy());
            SongsListComp.showAverageRating(song);
        }
    }


    public static void listSongAverageRating() {
        List<Song> songList = BookSingleton.getSingletonList();
        Song song;
        for (int i = 0; i < songList.size(); i++) {
            song = songList.get(i);
            SongsListComp.showAverageRating(song);
        }
    }
}
