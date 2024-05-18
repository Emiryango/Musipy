package org.example.module.creation.concretes;

import org.example.entities.abstracts.Song;

import org.example.entities.concretes.Metal;
import org.example.module.creation.abstracts.Factory;
import org.example.module.Singleton.Singleton;

public class MetalFactory extends Factory {
    Song song;
    public MetalFactory() {
        super();
        System.out.println("Created Metal Song");
    }


    @Override
    public Song createSong(String name) {
        song = new Metal(name);
        Singleton.getSituation().addSong(song);
        return song;
    }
}
