import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Locale;
import java.util.Scanner;

public class ClassPlayer extends AbstractPlayer {


    public static void playerInputs() {
        Scanner sc = new Scanner(System.in);
        ClassPlayer player1 = new ClassPlayer();
        ClassPlayer player2 = new ClassPlayer();

        System.out.println("PLAYER 1 ENTER ROCK, PAPER, OR SCISSORS");
        System.out.println("TYPE quit FOR MAIN MENU");
        do {
            String playerInput1 = sc.nextLine().toLowerCase(Locale.ROOT);
            player1.setPlayerChoice(playerInput1);
            if(player1.getPlayerChoice().equals("rock") || player1.getPlayerChoice().equals("paper") || player1.getPlayerChoice().equals("scissors"))
                break;
            System.out.println("INVALID INPUT");
            System.out.println("PLAYER 1 REENTER CHOICE OF ROCK, PAPER, OR SCISSORS");
            System.out.println("TYPE quit FOR MAIN MENU");
            if(player1.getPlayerChoice().equals("quit"))
                MainMenu.welocmeMessage();
        }while (true);
            System.out.println("PLAYER 2 ENTER ROCK, PAPER, OR SCISSORS");

        do {
//            System.out.println("ENTER ROCK, PAPER, OR SCISSORS PLAYER 2");
            String playerInput2 = sc.nextLine().toLowerCase(Locale.ROOT);
            player2.setPlayerChoice(playerInput2);
//            System.out.println(playerInput2);
            if(player2.getPlayerChoice().equals("rock") || player2.getPlayerChoice().equals("paper") || player2.getPlayerChoice().equals("scissors"))
                break;
            System.out.println("INVALID INPUT");
            System.out.println("PLAYER 2 RE-ENTER CHOICE OF ROCK, PAPER, OR SCISSORS");
            System.out.println("TYPE quit FOR MAIN MENU");
            if(player2.getPlayerChoice().equals("quit"))
                MainMenu.welocmeMessage();

        }while (true);

//        System.out.println("this is the second part");

        if (player1.getPlayerChoice().equals("rock")) {
            if (player2.getPlayerChoice().equals("rock")) {
                System.out.println("THE GAME IS TIED");
            } else if (player2.getPlayerChoice().equals("paper")) {
                System.out.println("player 2 wins");
            } else if (player2.getPlayerChoice().equals("scissors")) {
                System.out.println("player 1 wins");
            } else
                System.out.println("INVALID INPUT PLEASE TRY AGAIN");
        }

        if (player1.getPlayerChoice().equals("paper")) {
            if (player2.getPlayerChoice().equals("paper")) {
                System.out.println("THE GAME IS TIED");
            } else if (player2.getPlayerChoice().equals("rock")) {
                System.out.println("player 1 wins");
            } else if (player2.getPlayerChoice().equals("scissors")) {
                System.out.println("player 2 wins");
            } else
                System.out.println("INVALID INPUT PLEASE TRY AGAIN");
        }

        if (player1.getPlayerChoice().equals("scissors")) {
            if (player2.getPlayerChoice().equals("scissors")) {
                System.out.println("THE GAME IS TIED");
            } else if (player2.getPlayerChoice().equals("paper")) {
                System.out.println("player 1 wins");
            } else if (player2.getPlayerChoice().equals("rock")) {
                System.out.println("player 2 wins");
            } else {
                System.out.println("INVALID INPUT PLEASE TRY AGAIN");

            }
        }
        System.out.println("WOULD YOU LIKE TO GO BACK TO THE MAIN MENU TYPE yes OR quit TO EXIT THE GAME");
        String endGame= sc.nextLine().toLowerCase(Locale.ROOT);
        if(endGame.equals("yes")){
            MainMenu.welocmeMessage();

        } else System.out.println("exiting the game...");

    }
}



