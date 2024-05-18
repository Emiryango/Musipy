package org.example.entities.abstracts;

import org.example.entities.concretes.Playlist;
import org.example.entities.concretes.Artist;
import org.example.module.creation.concretes.SongType;
import org.example.module.rate.abstracts.RateStrategy;
import org.example.module.rate.concretes.AverageStrategy;

import java.util.*;

public abstract class Song {
    private Long id;
    private String name;
    private SongType type;
    private final List<Artist> artist = new LinkedList<>();
    private final Set<Playlist> playlist = new HashSet<>(3);
    private RateStrategy ratingStrategy;
    private int totalRate;
    private double averageRate;

    public Song(String name) {
        this.id = new Random().nextLong();
        this.name = name;
        ratingStrategy = new AverageStrategy();
        playlist.add(Playlist.NONE);
    }
    public void setRateStrategy(RateStrategy strategy) {
        ratingStrategy = strategy;
    }
    public void addRate(float rate) {
        ratingStrategy.updateRate(this, rate);
    }
    public double getVote() {
        return ratingStrategy.computeVote(this);
    }
    public double getAverageRate() {
        return averageRate;
    }
    public int getTotalRate() {
        return totalRate;
    }
    public void setTotalRate(int totalRate) {
        this.totalRate = totalRate;
    }
    public void setAverageRate(double averageRate) {
        this.averageRate = averageRate;
    }


    public void addArtist(Artist artist) {
        this.artist.add(artist);
    }
    public void addPlaylist(Playlist playlist) {
        this.playlist.remove(Playlist.NONE);

        if (this.playlist.size() < 3) {
            this.playlist.add(playlist);
        } else {
            System.out.println("No more than 3 playlist.");
        }
    }

    public void setPlaylist(HashSet<Playlist> playlists) {
        this.playlist.clear();
        for (Playlist playlist : playlists) {
            this.playlist.add(playlist);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public List<Artist> getArtist() {
        return artist;
    }

    public void setArtist(List<Artist> artist) {
        this.artist.clear();
        this.artist.addAll(artist);
    }

    public Set<Playlist> getPlaylist() {
        return playlist;
    }


    public SongType getType() {
        return type;
    }

    public void setType(SongType type) {
        this.type = type;
    }
}
