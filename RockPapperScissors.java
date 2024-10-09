import java.util.Random;
import java.util.Scanner;

public class RockPapperScissors {
    public static void main(String[] args){
        String pink = "\u001B[35m";
        String reset = "\u001B[0m";
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] rps ={"rock","papper","scissors"};
        boolean playAgain = true;

        while (playAgain){
            System.out.println("pick one (rock, papper, scissors): ");
            String userChoice = scanner.nextLine().trim();

            int compIndex = random.nextInt(3);
            String compChoice = rps[compIndex];
            System.out.println("Computer chose: "+ compChoice);

            if(userChoice.equalsIgnoreCase(compChoice)){
                System.out.println("It a tie");
            } else if (userChoice.equalsIgnoreCase("rock")){
                if (compChoice.equals("scissors")){
                    System.out.println("You won since rock beats scissors");
                } else {
                    System.out.println("you lost paper cover rock");
                } 
            } else if (userChoice.equalsIgnoreCase("papper")){
                if (compChoice.equals("rock")){
                    System.out.println("You won since papper cover rock");
                } else {
                    System.out.println("you lost scissor cut the papper");
                }

            } else if (userChoice.equalsIgnoreCase("scissors")){
                if (compChoice.equals("papper")){
                    System.out.println("you win scissor cut papper");
                } else {
                    System.out.println("you lose rock crusshed scissors");
                } 
            } else {
                System.out.println("Thats not a option plz ennter a correct one");
            }

            System.out.println("I know you want to play again (Yes or no): ");
            String answer = scanner.nextLine().trim();
            if (answer.equalsIgnoreCase("no")){
                playAgain = false;
            }
        }
            System.out.println(pink+"wow you played thanks"+reset);
            scanner.close();

    }  
}