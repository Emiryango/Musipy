package org.example.module.creation.concretes;

import org.example.entities.abstracts.Song;
import org.example.entities.concretes.Rock;
import org.example.module.creation.abstracts.Factory;
import org.example.module.Singleton.Singleton;

public class RockFactory extends Factory {
    Song song;
    public RockFactory() {
        super();
        System.out.println("Created Rock Song");
    }


    @Override
    public Song createSong(String name) {
        song = new Rock(name);
        Singleton.getSituation().addSong(song);
        return song;
    }
}
