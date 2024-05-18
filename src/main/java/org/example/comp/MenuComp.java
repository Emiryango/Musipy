package org.example.comp;

public class MenuComp {

    public static void showMenu() {


        boolean quit = false;

        while (!quit) {
            System.out.println("------------ Main Menu -----------");
            System.out.println("1. Create Song");
            System.out.println("2. Search Song");
            System.out.println("3. Modify Song");
            System.out.println("4. Rate Song");
            System.out.println("5. List All Songs");
            System.out.println("6. Show Ratings");
            System.out.println("7. Quit");
            System.out.println("----------------------------------");

            System.out.print("Enter your choice: ");
            int choice = 0;
            try {
                choice = Integer.parseInt(System.console().readLine());
            } catch (Exception e) {
                System.out.println("Please choose correctly.");
            }

            switch (choice) {
                case 1:
                    System.out.println("Create Song selected");
                    org.example.comp.CreateSongComp.CreateSong();
                    break;
                case 2:
                    System.out.println("Search Song selected");
                    org.example.comp.SearchComp.SearchSong();
                    break;
                case 3:
                    System.out.println("Modify Song selected");
                    org.example.comp.ModifySongComp modifySong = new org.example.comp.ModifySongComp();
                    modifySong.modifySong();
                    break;
                case 4:
                    System.out.println("Rate Song selected");
                    org.example.comp.RateSongComp.RateSong();
                    break;
                case 5:
                    org.example.comp.SongLister.listSong();
                    break;
                case 6:
                    System.out.println("Show Ratings selected");
                    org.example.comp.RateChooseComp.SongRating();
                    break;
                case 7:
                    System.out.println("Exiting the program...");
                    quit = true;
                    break;
                default:
                    System.out.println("Please choose correctly.");
                    break;
            }
            System.out.println();
        }
    }

}


