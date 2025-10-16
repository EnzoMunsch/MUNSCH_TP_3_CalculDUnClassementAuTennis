package fr.btsciel;

import clavier.In;

public class Tp_3 {
    public static void main(String[] args) {

        //initialisation des variables
        int playerRank;
        int playerCapital = 0;
        int playerVictory = 0;
        int playerTotalVictory = 0;
        int playerBonusVictory = 0;
        int playerTotalDefeat = 0;
        int playerDefeat = 0;
        int playerVictoryRank = 0;
        int playerVictoryPoint = 0;
        int playerGlobalPoint = 0;
        int playerDefeatPoint1 = 0;
        int playerDefeatPoint2 = 0;
        int playerDefeatPoint3 = 0;
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
        boolean rankDown = false;
        boolean rankUp = false;
        String rankName = "";


        //Tableau du classement
        System.out.println("""
                
                _____________CLASSEMENT_____________
                
                     0) Non classé    1) 40
                    
                    2) 30/5          7) 30
                    3) 30/4          8) 15/5
                    4) 30/3          9) 15/4
                    5) 30/2
                    6) 30/1
                
             """);


        //Demande du classement du joueur
        System.out.print("Entrez votre classement : ");
        playerRank = In.readInteger();
        System.out.print("Entrez votre nombre de victoires : ");
        playerTotalVictory = In.readInteger();
        System.out.print("Entrez votre nombre de défaites : ");
        playerTotalDefeat = In.readInteger();



        for (int i = 0; i != playerTotalDefeat; i++) {

            //menu des victoires par echelon
            System.out.println("""
                    
                    1) Défaite à échelon égal.
                    2) Défaite à 1 échelon en dessous.
                    3) Défaite à 2 échelons en dessous.
                    
                    """);

            System.out.print("Veuillez saisire une défaite : ");
            playerDefeat = In.readInteger();

            switch (playerDefeat) {
                case 1:
                    playerDefeatPoint1 ++;
                    break;
                case 2:
                    playerDefeatPoint2 ++;
                    break;
                case 3:
                    playerDefeatPoint3 ++;
                    break;
            }
        }
        //Indice de victoire bonus
        playerBonusVictory = playerTotalVictory - playerDefeatPoint1 - (2 * playerDefeatPoint2) - (5 * playerDefeatPoint3);

        //mise du capital de depart dans la variable de point total
        playerGlobalPoint += Mth_Tp_3.capital(playerRank);

        //Association du nombre de victoire par rapport au rang du joueur.
        if (playerRank > 4){
            playerVictory = 6;
        }else {
            playerVictory = 5;
        }

        //Ajout du nombre de victoire bonus



        //Eviter de lui demander plus de victoire qu'il n'en a reelement.
        if (playerVictory > playerTotalVictory) {
            playerVictory = playerTotalVictory;
        }
        System.out.println("\nVous avez le droit a " + playerVictory + " victoires.\n");







        //Boucle de calcule du nouveau classement selon les victoires/defaites.
        for (int i = 0; i != playerVictory; i++) {

            //menu des victoires par echelon
            System.out.println("""
                
                1) Victoire à 2 échelons au dessus et plus.
                2) Victoire à 1 échelon au dessus.
                3) Victoire à échelon égal.
                4) Victoire à 1 échelon en dessous.
                5) Victoire à 2 échelons en dessous.
                6) Victoire à 3 échelons en dessous.
                7) Victoire à 4 échelons en dessous et plus.
                0) Aucune victoire à ajouter.
                
                """);

            System.out.print("Veuillez saisire une victoires : ");
            playerVictoryRank = In.readInteger();
            playerVictoryPoint = Mth_Tp_3.victoryPoint(playerVictoryRank);

            //calcul des points totale apres chaque entrée de victoire
            playerGlobalPoint = playerGlobalPoint + playerVictoryPoint;

        }
        switch (playerRank) {
            case NC:

                if (playerGlobalPoint > 50) {
                    playerRank++;
                    rankUp = true;
                    rankName = "40";
                }

                break;
            case _40:

                if (playerGlobalPoint > 80) {
                    playerRank++;
                    rankUp = true;
                    rankName = "30/5";
                } else if (playerGlobalPoint < 30) {
                    playerRank--;
                    rankDown = true;
                    rankName = "NC";
                }

                break;
            case _30_5:

                if (playerGlobalPoint > 150) {
                    playerRank++;
                    rankUp = true;
                    rankName = "30/4";
                } else if (playerGlobalPoint < 50) {
                    playerRank--;
                    rankDown = true;
                    rankName = "40";
                }

                break;
            case _30_4:

                if (playerGlobalPoint > 260) {
                    playerRank++;
                    rankUp = true;
                    rankName = "30/3";
                    playerVictory = 6; //Ajoute une victoire max lors de la montée d'échelon.
                } else if (playerGlobalPoint < 90) {
                    playerRank--;
                    rankDown = true;
                    rankName = "35/5";
                }

                break;
            case _30_3:

                if (playerGlobalPoint > 340) {
                    playerRank++;
                    rankUp = true;
                    rankName = "30/2";
                } else if (playerGlobalPoint < 145) {
                    playerRank--;
                    rankDown = true;
                    rankName = "30/4";
                    playerVictory = 5; //Enlève une victoire lors du derank.
                }

                break;
            case _30_2:

                if (playerGlobalPoint > 410) {
                    playerRank++;
                    rankUp = true;
                    rankName = "30/1";
                } else if (playerGlobalPoint < 205) {
                    playerRank--;
                    rankDown = true;
                    rankName = "30/3";
                }

                break;
            case _30_1:

                if (playerGlobalPoint > 480) {
                    playerRank++;
                    rankUp = true;
                    rankName = "30";
                } else if (playerGlobalPoint < 245) {
                    playerRank--;
                    rankDown = true;
                    rankName = "30/2";
                }

                break;
            case _30:

                if (playerGlobalPoint > 510) {
                    playerRank++;
                    rankUp = true;
                    rankName = "15/5";
                } else if (playerGlobalPoint < 290) {
                    playerRank--;
                    rankDown = true;
                    rankName = "30/5";
                }

                break;
            case _15_5:

                if (playerGlobalPoint > 580) {
                    playerRank++;
                    rankUp = true;
                    rankName = "15/4";
                } else if (playerGlobalPoint < 325) {
                    playerRank--;
                    rankDown = true;
                    rankName = "30";
                }

                break;
            case _15_4:

                if (playerGlobalPoint > 660) {
                    rankName = "rang max";
                } else if (playerGlobalPoint < 395) {
                    playerRank--;
                    rankDown = true;
                    rankName = "15/5";
                }

                break;
        }
        if (rankUp == true){
            System.out.println("\nFélicitation, vous passez au rang supperieur !\nVeuillez de nouveau rentrer vos victoires en prenant en compte votre nouveau rang. (" + rankName + ")");
            //Indique le capital de depart
            playerVictoryPoint = Mth_Tp_3.capital(playerRank);
            System.out.println("Vous avez le droit a " + playerVictory + " victoires");
        }else if (rankDown == true){
            System.out.println("Vous baissez d'un rang.");
        }//else if (rankdown et rankup)

    }
}

