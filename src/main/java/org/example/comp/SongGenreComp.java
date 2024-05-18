package org.example.comp;

import org.example.module.creation.abstracts.Factory;
import org.example.module.creation.concretes.*;

import java.util.Scanner;

public class SongGenreComp {
    Scanner scanner = new Scanner(System.in);
    Factory getSongGenre() {
        Factory songFactory;

        System.out.println("---------- Song Genre Menu -----------");
        System.out.println("What Genre song do you want to create?");
        System.out.println("1.Arabesk Song");
        System.out.println("2.Rap Song");
        System.out.println("3.Pop Song");
        System.out.println("4.Rock Song");
        System.out.println("5.Metal Song");
        System.out.println("6.SeninIçinHazırlandı Song");
        System.out.println("7.Other Song");
        System.out.println("----------------------------------------");

        System.out.print("Enter your choice: ");
        int choice = 0;
        while (true){
            try {
                choice = Integer.parseInt(System.console().readLine());
                break;
            } catch (Exception e) {
                System.out.println("Please choose correctly.");
            }
        }

        switch (choice){
            case 1:
                System.out.println("Creating Arabesk Song.............");
                songFactory = new ArabeskFactory();
                return songFactory;
            case 2:
                System.out.println("Creating Rap Song.............");
                songFactory = new RapFactory();
                return songFactory;
            case 3:
                System.out.println("Creating Pop Song.............");
                songFactory = new PopFactory();
                return songFactory;
            case 4:
                System.out.println("Creating Rock Song.............");
                songFactory = new RockFactory();
                return songFactory;
            case 5:
                System.out.println("Creating Metal Song.............");
                songFactory = new MetalFactory();
                return songFactory;
            case 6:
                System.out.println("Creating Sen için.............");
                songFactory = new SeninIcinFactory();
                return songFactory;
            case 7:
                System.out.println("Creating Other Song.............");
                System.out.println("Please enter the genre of the song:  ");
                String style = scanner.nextLine();
                songFactory = new OtherFactory(style);
                return songFactory;
            default:
                System.out.println("Please choose correctly.");
                getSongGenre();
                return null;
        }
    }
}
