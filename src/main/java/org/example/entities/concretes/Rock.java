package org.example.entities.concretes;

import org.example.entities.abstracts.Song;
import org.example.module.creation.concretes.SongType;

public class Rock extends Song {
    public Rock(String name) {
        super(name);
        super.setType(SongType.ROCK);
    }
}
