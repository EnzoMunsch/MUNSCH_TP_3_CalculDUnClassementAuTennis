package fr.btsciel;

public class Mth_Tp_3 {
    public static int capital (int rank){
        int playerCapital = 0;

        switch (rank) {
            case 0:     //Non classé
                playerCapital = 0;
                break;
            case 1:     //40
                playerCapital = 2;
                break;
            case 2:     //30/5
                playerCapital = 5;
                break;
            case 3:     //30/4
                playerCapital = 10;
                break;
            case 4:     //30/3
                playerCapital = 20;
                break;
            case 5:     //30/2
                playerCapital = 30;
                break;
            case 6:     //30/1
                playerCapital = 50;
                break;
            case 7:     //30
                playerCapital = 80;
                break;
            case 8:     //15/5
                playerCapital = 120;
                break;
            case 9:     //15/4
                playerCapital = 160;
                break;
        }
        return playerCapital;
    }

    public static int victoryPoint(int playerVictoryRank){
        int playerVictoryPoint = 0;
        switch (playerVictoryRank) {
            case 0:
                playerVictoryPoint = 0;
                break;
            case 1:
                playerVictoryPoint = 150;
                break;
            case 2:
                playerVictoryPoint = 100;
                break;
            case 3:
                playerVictoryPoint = 50;
                break;
            case 4:
                playerVictoryPoint = 30;
                break;
            case 5:
                playerVictoryPoint = 20;
                break;
            case 6:
                playerVictoryPoint = 15;
                break;
            case 7:
                playerVictoryPoint = 0;
                break;
            default:
                System.out.println("Mauvaise saisie.");
                break;
        }
        return playerVictoryPoint;
    }
}
