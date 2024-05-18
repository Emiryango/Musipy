package org.example.entities.concretes;

import org.example.entities.abstracts.Song;
import org.example.module.creation.concretes.SongType;

public class Pop extends Song {
    public Pop(String name) {
        super(name);
        super.setType(SongType.POP);
    }
}
