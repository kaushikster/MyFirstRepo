package com.Kaushik;

public class Main {

    public static void main(String[] args) {
        scoreCalculation(true,800,5,100);
        scoreCalculation(true,10000,8,200);

        displayHighscorePosition("Kaushik",calculateHighscorePosition(1500));
        displayHighscorePosition("Niranjali",calculateHighscorePosition(900));
        displayHighscorePosition("ninakau",calculateHighscorePosition(400));
        displayHighscorePosition("kaunina",calculateHighscorePosition(50));

    }

    private static int scoreCalculation(boolean gameOver,int newScore,int newLevelCompleted,int newBonus){
        if(gameOver) {
            int finalScore = newScore + (newLevelCompleted * newBonus);
            System.out.println("The new score is " + finalScore);
            return finalScore;
        }
        return -1;
    }
    public static void displayHighscorePosition(String name, int position){
        System.out.println(name + " got to a position "+position);
    }
    public static int calculateHighscorePosition(int playerScore){
        if(playerScore>1000){
            return 1;
        }
        else if(playerScore>500&&playerScore<1000){
            return 2;
        }
        else if(playerScore>100&&playerScore<500){
            return 3;
        }
        else return 4;
    }
}
