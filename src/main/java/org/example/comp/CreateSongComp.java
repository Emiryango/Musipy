package org.example.comp;

import org.example.entities.abstracts.Song;
import org.example.entities.concretes.Playlist;
import org.example.entities.concretes.Artist;
import org.example.module.creation.abstracts.Factory;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class CreateSongComp {
    static Scanner scanner = new Scanner(System.in);
    public static void CreateSong(){
        System.out.println("-------------------------- Create Song -------------------------- ");
        Song song = null;

        SongGenreComp SongStyleComponent = new SongGenreComp();
        Factory songFactory = SongStyleComponent.getSongGenre();

        System.out.println("Please enter the name of the song : ");
        String name = System.console().readLine();



        try {
            song = songFactory.createSong(name);
            addPlaylist(song);
            addArtist(song);
            System.out.println("Song created successfully!");
        } catch (Exception e) {
            System.out.println("Please choose correctly.");
        }

    }

    private static Song addPlaylist(Song song) {
        HashSet<Playlist> playlists = PlaylistComp.createPlaylist();

        for (Playlist playlist : playlists) {
            song.addPlaylist(playlist);
        }
        return song;
    }


    private static Song addArtist(Song song) {
        List<Artist> artists = ArtistComp.createArtistArrayList();

        for (Artist artist : artists) {
            song.addArtist(artist);
        }

        return song;
    }

}
