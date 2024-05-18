package org.example.module.creation.concretes;

import org.example.entities.abstracts.Song;
import org.example.entities.concretes.SeninIcin;
import org.example.module.creation.abstracts.Factory;
import org.example.module.Singleton.Singleton;

public class SeninIcinFactory extends Factory {
    Song song;
    public SeninIcinFactory() {
        super();
        System.out.println("Created SeninIcin Song");
    }


    @Override
    public Song createSong(String name) {
        song = new SeninIcin(name);
        Singleton.getSituation().addSong(song);
        return song;
    }
}
