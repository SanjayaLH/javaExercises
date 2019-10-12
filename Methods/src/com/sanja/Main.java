package com.sanja;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(gameOver, score, levelCompleted, bonus);

        score = 10000;
        System.out.println(" score was " + score);
        levelCompleted = 8;
        bonus = 200;

        calculateScore(gameOver, score, levelCompleted, bonus);

        String name1 = "A";
        score = 1500; //score = 900;score = 400;score = 50;
        int playerPosition = calculateHighScorePosition(score);
        displayHighScorePosition(name1,playerPosition);

        String name2 = "B";
        score = 900;
        playerPosition = calculateHighScorePosition(score);
        displayHighScorePosition(name2,playerPosition);

        String name3 = "C";
        score = 400;
        playerPosition = calculateHighScorePosition(score);
        displayHighScorePosition(name3,playerPosition);

        String name4 = "D";
        score = 500;
        playerPosition = calculateHighScorePosition(score);
        displayHighScorePosition(name4,playerPosition);

//        if (gameOver) {
//            int finalScore = score + (levelCompleted * bonus);
//            finalScore += 1000;
//            System.out.println("Your final score was " + finalScore);
//        }


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }else {
            return -1;
        }

    }

    public static void displayHighScorePosition(String playerName, int position){
        System.out.println(playerName+ " manage to get into position " +position+ " on the high score table");

    }
    public static int calculateHighScorePosition(int playerScore){
        int position = 0;
        if(playerScore >= 1000){
            System.out.println("P1");
            return position = 1;
        }else if (playerScore >= 500 && playerScore < 1000){
            System.out.println("P2");
            return position = 2;

        }else if(playerScore >= 100 && playerScore < 500){
            System.out.println("P3");
            return position = 3;

        }else {
            System.out.println("P4");
            return position = 4;
        }

    }
}
