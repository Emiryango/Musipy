package org.example.module.creation.concretes;

import org.example.entities.abstracts.Song;

import org.example.entities.concretes.Rap;
import org.example.module.creation.abstracts.Factory;
import org.example.module.Singleton.Singleton;

public class RapFactory extends Factory {
    Song song;
    public RapFactory() {
        super();
        System.out.println("Created Rap Song");
    }


    @Override
    public Song createSong(String name) {
        song = new Rap(name);
        Singleton.getSituation().addSong(song);
        return song;
    }
}
