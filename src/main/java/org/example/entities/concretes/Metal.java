package org.example.entities.concretes;

import org.example.entities.abstracts.Song;
import org.example.module.creation.concretes.SongType;

public class Metal extends Song {
    public Metal(String name) {
        super(name);
        super.setType(SongType.METAL);
    }
}
