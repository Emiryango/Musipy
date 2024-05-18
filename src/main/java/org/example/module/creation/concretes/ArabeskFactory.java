package org.example.module.creation.concretes;

import org.example.entities.abstracts.Song;
import org.example.entities.concretes.Arabesk;
import org.example.module.creation.abstracts.Factory;
import org.example.module.Singleton.Singleton;

public class ArabeskFactory extends Factory {
    Song song;
    public ArabeskFactory() {
        super();
        System.out.println("Created Arabesk Song");
    }


    @Override
    public Song createSong(String name) {
        song = new Arabesk(name);
        Singleton.getSituation().addSong(song);
        return song;
    }
}
