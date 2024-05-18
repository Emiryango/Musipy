package org.example.module.modification;

import org.example.entities.abstracts.Song;
import org.example.entities.concretes.Playlist;
import org.example.entities.concretes.Artist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
public class ModifySong {
    Song song;
    public ModifySong(Song song) {
        this.song = song;
    }
    public void modifyName(String name) {
        song.setName(name);
    }
    public void modifyArtist(List<Artist> artist) {
        song.setArtist(artist);
    }
    public void modifyPlaylist(HashSet<Playlist> playlist) {
        song.setPlaylist(playlist);
    }

}


