// Create a method called displayHighScorePosition
// it should a players name as a parameter, and a 2nd parameter as a position in the high score table
// You should display the players name along with a message like " managed to get into position " and the
// position they got and a further message " on the high score table".
//
// Create a 2nd method called calculateHighScorePosition
// it should be sent one argument only, the player score
// it should return an int
// the return data should be
// 1 if the score is >=1000
// 2 if the score is >=500 and < 1000
// 3 if the score is >=100 and < 500
// 4 in all other cases
// call both methods and display the results of the following
// a score of 1500, 900, 400 and 50
//

package com.company;

public class Main {

    public static void main(String[] args) {
        String pName = "Alex";
        int position = calculateHighScorePosition(1500);
        displayHighScorePosition(pName, position);
        pName = "Bob";
        position = calculateHighScorePosition(900);
        displayHighScorePosition(pName, position);
        pName = "John";
        position = calculateHighScorePosition(400);
        displayHighScorePosition(pName, position);
        pName = "Stuart";
        position = calculateHighScorePosition(50);
        displayHighScorePosition(pName, position);


    }

    public static void displayHighScorePosition(String pName, int position){
        System.out.println(pName + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int pScore){
        if (pScore >= 1000){
            return 1;
        }else if(pScore >= 500){
            return 2;
        }else if (pScore >= 100){
            return 3;
        }else{
            return 4;
        }
    }

}
