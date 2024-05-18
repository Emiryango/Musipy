package org.example.entities.concretes;

import org.example.entities.abstracts.Song;
import org.example.module.creation.concretes.SongType;

public class SeninIcin extends Song {
    public SeninIcin(String name) {
        super(name);
        super.setType(SongType.SENINICIN);
    }
}
