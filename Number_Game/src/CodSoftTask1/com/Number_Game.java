package CodSoftTask1.com;

import java.util.Scanner;

public class Number_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);f

        int score = 0;
        int no_of_chances=7;
        boolean playGame = true;
        System.out.println("*****************************************************");
        System.out.println("WELCOME TO THE NUMBER GUESSING GAME...");
        System.out.println("******************************************************");
        System.out.println("GUESS THE NUMBER BETWEEN 1 TO 100");
        System.out.println("******************************************************");
        System.out.println("YOU HAVE "+no_of_chances+" CHANCES TO WIN THIS GAME..");
        System.out.println("*******************************************************");
        while (playGame){
            int randomNo = getrandNo(1,100);
            boolean isGuess = false;
            for(int i =1; i<=no_of_chances; i++){
                System.out.print("CHANCE "+i+" :  ENTER YOUR GUESSED NUMBER : ");

                int user_guess = sc.nextInt();
                if(user_guess==randomNo){
                    isGuess = true;
                    score = score+1;
                    System.out.println("YOU GUESSED IT RIGHT...YOU WIN...");
                    System.exit(0);
                }
                else if(user_guess>randomNo){
                    System.out.println("NUMBER IS TOO HIGH...");
                }
                else if(user_guess<randomNo){
                    System.out.println("NUMBER IS TOO LOW...");
                }
            }
            if(isGuess == false){
                System.out.println("SORRY YOU LOST THE GAME.. ");
                System.out.println("THE NUMBER IS: "+randomNo);
            }
            System.out.println("*******************************************************");
            System.out.println("IF YOU WANT TO PLAY AGAIN ENTER(Y) OTHERWISE (N): ");
            String again_play = sc.next();
            playGame = again_play.equalsIgnoreCase("Y");
        }
        System.out.println("GAME IS OVER....");
        System.out.println();
        System.out.println("HERE IS YOUR SCORE: "+score);
    }
    public static int getrandNo(int min, int max){
        return (int)(Math.random()*(max-min+1)+min);
    }
}