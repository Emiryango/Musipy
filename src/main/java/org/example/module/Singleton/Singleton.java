package org.example.module.Singleton;

import org.example.entities.abstracts.Song;

import java.util.LinkedList;
import java.util.List;

public class Singleton {
    private static Singleton situation;
    private final List<Song> songList = new LinkedList<>();
    private Singleton() {
    }
    public List<Song> getSingletonList() {
        return songList;
    }

    public static Singleton getSituation() {
        if (situation == null) {
            situation = new Singleton();
        }
        return situation;
    }
    public void addSong(Song song) {
        songList.add(song);
    }
}
