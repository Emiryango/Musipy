package org.example.module.rate.abstracts;

import org.example.entities.abstracts.Song;

public interface RateStrategy {
    void updateRate(Song song, float rating);
    double computeVote(Song song);
}
