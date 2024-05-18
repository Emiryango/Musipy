package org.example.entities.concretes;

import org.example.entities.abstracts.Song;
import org.example.module.creation.concretes.SongType;

public class Rap extends Song {
    public Rap(String name) {
        super(name);
        super.setType(SongType.RAP);
    }
}
