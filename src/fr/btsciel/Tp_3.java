package fr.btsciel;

import clavier.In;

public class Tp_3 {
    public static void main(String[] args) {

        //initialisation des variables
        int playerRank;
        int playerCapital = 0;
        int playerVictory = 0;
        int playerTotalVictory;
        int playerVictoryRank;
        int playerVictoryPoint;
        final int NC = 0;
        final int _40 = 1;
        final int _30 = 2;
        final int _30_5 = 3;
        final int _30_4 = 4;
        final int _30_3 = 5;
        final int _30_2 = 6;
        final int _30_1 = 7;
        final int _15_5 = 8;
        final int _15_4 = 9;


        //Tableau du classement
        System.out.println("""
                
                _____________CLASSEMENT_____________
                
                     0) Non classé    1) 40
                    
                     2) 30           8) 15/5
                    4) 30/4          9) 15/4
                    5) 30/3
                    6) 30/2
                    7) 30/1
                
             """);


        //Demande du classement du joueur
        System.out.print("Entrez votre classement : ");
        playerRank = In.readInteger();
        System.out.print("Entrez votre nombre de victoires : ");
        playerTotalVictory = In.readInteger();

        //Indique le capital de depart
        switch (playerRank) {
            case NC:

                playerVictory = 5;
                playerCapital = 0;

                break;
            case _40:

                playerVictory = 5;
                playerCapital = 2;

                break;
            case _30_5:

                playerVictory = 5;
                playerCapital = 5;
                break;
            case _30_4:

                playerVictory = 5;
                playerCapital = 10;

                break;
            case _30_3:

                playerVictory = 6;
                playerCapital = 20;

                break;
            case _30_2:

                playerVictory = 6;
                playerCapital = 30;

                break;
            case _30_1:

                playerVictory = 6;
                playerCapital = 50;

                break;
            case _30:

                playerVictory = 6;
                playerCapital = 80;

                break;
            case _15_5:

                playerVictory = 6;
                playerCapital = 120;

                break;
            case _15_4:

                playerVictory = 6;
                playerCapital = 160;

                break;
        }
        System.out.println("\nVous avez le droit a " + playerVictory + " victoires.\n");
        System.out.println("""
                
                1) Victoire à 2 échelons au dessus et plus.
                2) Victoire à 1 échelon au dessus.
                3) Victoire à échelon égal.
                4) Victoire à 1 échelon en dessous.
                5) Victoire à 2 échelons en dessous.
                6) Victoire à 3 échelons en dessous.
                7) Victoire à 4 échelons en dessous et plus.
                
                """);
        for (int i = 0; i == playerVictory; i++) {
            System.out.println("Veuillez saisire vos victoires : ");

        }
    }
}
