package org.example.module.rate.concretes;

import org.example.entities.abstracts.Song;
import org.example.module.rate.abstracts.RateStrategy;

public class TotalStrategy implements RateStrategy {

    @Override
    public void updateRate(Song song, float rating) {
        song.setTotalRate(song.getTotalRate() + 1);
    }

    @Override
    public double computeVote(Song song) {
        return song.getTotalRate();
    }
}
