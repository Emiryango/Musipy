package org.example.entities.concretes;

import org.example.entities.abstracts.Song;
import org.example.module.creation.concretes.SongType;

public class Arabesk extends Song {
    public Arabesk(String name) {
        super(name);
        super.setType(SongType.ARABESK);
    }
}
