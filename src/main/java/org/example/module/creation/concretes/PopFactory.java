package org.example.module.creation.concretes;

import org.example.entities.abstracts.Song;
import org.example.entities.concretes.Pop;
import org.example.module.creation.abstracts.Factory;
import org.example.module.Singleton.Singleton;

public class PopFactory extends Factory {
    Song song;
    public PopFactory() {
        super();
        System.out.println("Created Pop Song");
    }


    @Override
    public Song createSong(String name) {
        song = new Pop(name);
        Singleton.getSituation().addSong(song);
        return song;
    }
}
