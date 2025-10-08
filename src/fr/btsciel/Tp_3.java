package fr.btsciel;

import clavier.In;

public class Tp_3 {
    public static void main(String[] args) {

        //initialisation des variables
        int joueurClassement;
        int joueurCapital = 0;
        int joueurVictoire = 0;
        final int NC = 0;
        final int _40 = 1;
        final int _30 = 2;
        final int _30_5 = 3;
        final int _30_4 = 4;
        final int _30_3 = 5;
        final int _30_2 = 6;
        final int _30_1 = 7;
        final int _15 = 8;
        final int _15_5 = 9;
        final int _15_4 = 10;


        //Tableau du classement
        System.out.println("""
                
                _____________CLASSEMENT_____________
                
                     0) Non classé    1) 40
                    
                     2) 30           8) 15
                    3) 30/5          9) 15/5
                    4) 30/4         10) 15/4
                    5) 30/3
                    6) 30/2
                    7) 30/1
                
             """);


        //Demande du classement du joueur
        System.out.print("Entrez votre classement : ");
        joueurClassement = In.readInteger();

        //Indique le capital de depart
        switch (joueurClassement) {
            case NC:

                joueurVictoire = ;
                joueurClassement = 0;

                break;
            case _40:

                joueurVictoire = ;
                joueurClassement = 2;

                break;
            case _30_5:

                joueurVictoire = ;
                joueurClassement = 5
                ;
                break;
            case _30_4:

                joueurVictoire = ;
                joueurClassement = 10;

                break;
            case _30_3:

                joueurVictoire = ;
                joueurClassement = 20;

                break;
            case _30_2:

                joueurVictoire = ;
                joueurClassement = 30;

                break;
            case _30_1

                break;
            case _30:

                break;
            case _15:

                break;
            case _15_5:

                break;
            case _15_4:

                break;
        }

    }
}
