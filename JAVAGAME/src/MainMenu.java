import com.sun.tools.javac.Main;

import java.util.Locale;
import java.util.Scanner;

public class MainMenu {

    public static void playerChoice(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER 1 for a TwoPlayer Game or ENTER 2 to play against a Computer");
        String playerInput1 = sc.nextLine();
        if(playerInput1.equals("1")){
            System.out.println("YOU DECIDED TO PLAY AGAINST ANOTHER HUMAN COMPETITOR");
            ClassPlayer.playerInputs();
        }
         else if(playerInput1.equals("2")){
            System.out.println("YOU DECIDED TO PLAY AGAINST A COMPUTER");
            ComputerClass.playerInputs();
        } else {
            System.out.println("INVALID CHOICE PLEASE RE-ENTER EITHER 1 OR 2");
             playerChoice();
        }

        }



    public static void welocmeMessage(){

        System.out.println("MAIN MENU\n" +
                "=====\n" +
                "1. Type 'play' to play.\n" +
                "2. Type 'history' to view your game history.\n" +
                "3. Type 'quit' to stop playing.\n");

        Scanner sc = new Scanner(System.in);
        String playerInput = sc.nextLine().toLowerCase(Locale.ROOT);
        if (playerInput.equals("play")) {
            System.out.println("Welcome to Rock, Paper, Scissors!");
            MainMenu.playerChoice();
//            }


//            System.out.println("Welcome to Rock, Paper, Scissors!");
//            System.out.println("ENTER 1 for a TwoPlayer Game or ENTER 2 to play against a Computer");
//            int playerInput1 = sc.nextInt();
//            if(playerInput1 == 1){
//                System.out.println("YOU DECIDED TO PLAY AGAINST ANOTHER HUMAN COMPETITOR");
//                ClassPlayer.playerInputs();
//            }
//            if(playerInput1 == 2){
//                System.out.println("YOU DECIDED TO PLAY AGAINST A COMPUTER");
//                ComputerClass.playerInputs();
//            }
//            if(playerInput1 != 1 || playerInput1 !=2){
//
//            }
        } else if (playerInput.equals("history")) {
            System.out.println("history option here ");
        } else if (playerInput.equals("quit")) {
            System.out.println("EXITING THE GAME");
        }else{
        MainMenu.errorMessage();
            MainMenu.welocmeMessage();
        }
    }


    public static void errorMessage(){
        System.out.println("INPUT ERROR PLEASE TRY AGAIN");
    }


    public static void main(String[] args) {
        MainMenu.welocmeMessage();
    }
}
