import java.util.HashMap;
import java.util.Random;

//import javax.swing.plaf.synth.SynthOptionPaneUI;
//import java.util.Locale;
//import java.util.Scanner;
//
public class Test {
//

    public static void game(){
        HashMap<Integer, String> numComp = new HashMap<Integer, String>();
        numComp.put(0, "rock");
        numComp.put(1, "paper");
        numComp.put(2, "scissors");
        Random random = new Random();
// Generates random integers 0 to 2
        int x = random.nextInt(3);
        System.out.println(numComp.get(x));

    }
//
    public static void main(String[] args) {
//        Main.game();

        // creating an object of Random class
        Random random = new Random();
// Generates random integers 0 to 49
        int x = random.nextInt(4);
// Generates random integers 0 to 999
        int y = random.nextInt(4);
// Prints random integer values
        System.out.println("Randomly Generated Integers Values");
        System.out.println(x);
        System.out.println(y);
//
//
/////*
//        MainMenu.welocmeMessage();
//        Scanner sc = new Scanner(System.in);
//        String playerInput = sc.nextLine().toLowerCase(Locale.ROOT);
//        if (playerInput.equals("play")) {
//            System.out.println("Welcome to Rock, Paper, Scissors!");
//            System.out.println("ENTER 1 for 2 Player or ENTER 2 to play against a Computer ");
//            int playerInput1 = sc.nextInt();
//            if(playerInput1 == 1){
//                System.out.println("YOU DECIDED TO PLAY AGAINST ANOTHER HUMAN COMPETITOR");
//                ClassPlayer.playerInputs();
//            }
//        } else if (playerInput.equals("history")) {
//            System.out.println("history option here ");
//        } else if (playerInput.equals("quit")) {
//            System.out.println("You decided to quit the game");
//        } else {
//            MainMenu.errorMessage();
//        }
////*/
    }
}

