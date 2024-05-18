package org.example.module.creation.abstracts;

import org.example.entities.abstracts.Song;

public abstract class Factory {
    public abstract Song createSong(String name);
}
