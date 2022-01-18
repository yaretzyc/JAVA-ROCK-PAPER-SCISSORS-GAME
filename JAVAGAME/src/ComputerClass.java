import java.util.HashMap;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class ComputerClass extends AbstractPlayer {



    public static String RandomComputer(){
        HashMap<Integer, String> numComp = new HashMap<Integer, String>();
        numComp.put(0, "rock");
        numComp.put(1, "paper");
        numComp.put(2, "scissors");
        Random random = new Random();
// Generates random integers 0 to 2
        int x = random.nextInt(3);
        String str = numComp.get(x);
        return str;

    }


    public static void playerInputs() {
        Scanner sc = new Scanner(System.in);
        ClassPlayer player1 = new ClassPlayer();
        ComputerClass player2 = new ComputerClass();

        System.out.println("PLAYER 1 ENTER ROCK, PAPER, OR SCISSORS");
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

        player2.setPlayerChoice(RandomComputer());
        System.out.println("COMPUTER CHOOSES: " + player2.getPlayerChoice());

        if (player1.getPlayerChoice().equals("rock")) {
            if (player2.getPlayerChoice().equals("rock")) {
                System.out.println("THE GAME IS TIED");
            } else if (player2.getPlayerChoice().equals("paper")) {
                System.out.println("Computer wins");
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
                System.out.println("Computer  wins");
            } else
                System.out.println("INVALID INPUT PLEASE TRY AGAIN");

        }
        if (player1.getPlayerChoice().equals("scissors")) {
            if (player2.getPlayerChoice().equals("scissors")) {
                System.out.println("THE GAME IS TIED");
            } else if (player2.getPlayerChoice().equals("paper")) {
                System.out.println("player 1 wins");
            } else if (player2.getPlayerChoice().equals("rock")) {
                System.out.println("Computer wins");
            } else {
                System.out.println("INVALID INPUT PLEASE TRY AGAIN");
            }
        }
        MainMenu.welocmeMessage();
    }
}