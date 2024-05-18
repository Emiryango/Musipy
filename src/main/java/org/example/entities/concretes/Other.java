package org.example.entities.concretes;

import org.example.entities.abstracts.Song;
import org.example.module.creation.concretes.SongType;

public class Other extends Song {
    public Other(String name) {
        super(name);
        super.setType(SongType.OTHER);
    }
}
