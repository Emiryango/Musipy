package org.example.module.search;

import org.example.comp.SongsListComp;
import org.example.entities.abstracts.Song;
import org.example.entities.concretes.Playlist;
import org.example.entities.concretes.Artist;
import org.example.module.Singleton.Singleton;

import java.util.LinkedList;
import java.util.List;
public class Search {
    List<Song> songList = Singleton.getSituation().getSingletonList();
    public void searchSongName(String name) {
        List<Song> result = new LinkedList<>();
        for (Song song : songList) {
            if (song.getName().toLowerCase().contains(name.toLowerCase())) {
                result.add(song);
            }
        }
        if (result.isEmpty())
            System.out.println("Couldn't find recipe");

        else {
            for (Song song : result) {
                SongsListComp.showSong(song);
            }
        }
    }
    public void searchSongPlaylist(Playlist playlist) {
        List<Song> result = new LinkedList<>();
        for (Song song : songList) {
            for (Playlist songPlaylist : song.getPlaylist()) {
                if (songPlaylist.name().toLowerCase().contains(playlist.name().toLowerCase())) {
                    result.add(song);
                }
            }
        }
        if (result.isEmpty())
            System.out.println("Couldn't find any song");

        else {
            for (Song song : result) {
                SongsListComp.showSong(song);
            }
        }
    }

    public void searchSongArtist(String artist) {
        List<Song> result = new LinkedList<>();
        for (Song song : songList) {
            for (Artist songArtist : song.getArtist()) {
                if (songArtist.getName().toLowerCase().contains(artist.toLowerCase())) {
                    result.add(song);
                }
            }
        }
        if(result.isEmpty())
            System.out.println("Couldn't find any song");

        else {
            for (Song song : result) {
                SongsListComp.showSong(song);
            }
        }
    }

}
