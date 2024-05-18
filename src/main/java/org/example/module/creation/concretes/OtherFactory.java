package org.example.module.creation.concretes;

import org.example.entities.abstracts.Song;
import org.example.entities.concretes.Other;
import org.example.module.creation.abstracts.Factory;
import org.example.module.Singleton.Singleton;
public class OtherFactory extends Factory {
    Song song;
    String name;
    public OtherFactory(String name) {
        super();
        this.name = name;
        System.out.println("Creating " + name + " Song");
    }


    @Override
    public Song createSong(String name) {
        song = new Other(name);
        Singleton.getSituation().addSong(song);
        return song;
    }
}
