import java.util.Random;
import java.util.Scanner;

public class blackjack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playagain = true;

        while (playagain) {
            int playertotal = 0;
            int dealertotal = 0;
            boolean playerbusted = false;
            boolean dealerbusted = false;

            System.out.println("Your turn: ");
            while (true) {
                System.out.println("your total: " + playertotal);
                System.out.println("do you want to hit or stand (h/s): ");
                char choice = scanner.next().toLowerCase().charAt(0);

                if (choice == 'h') {
                    int card = random.nextInt(11) + 1;
                    playertotal += card;
                    System.out.println("You drew: " + card);
                    if (playertotal > 21) {
                        System.out.println("you busted, here is your total: " + playertotal);
                        playerbusted = true;
                        break;
                    }
                } else if (choice == 's') {
                    break;
                }
            }

            if (!playerbusted) {
                System.out.println("\nMy turn: ");
                while (dealertotal < 17) {
                    int card = random.nextInt(11) + 1;
                    dealertotal += card;
                    System.out.println("I drew: " + card);
                }
                if (dealertotal > 21) {
                    System.out.println("I busted here is WhAt I got: " + dealertotal);
                    dealerbusted = true;
                }
            }

            if (playerbusted) {
                System.out.println("I win since you busted loser");
            } else if (dealerbusted || playertotal > dealertotal) {
                System.out.println("you win since i busted");
            } else if (dealertotal > playertotal) {
                System.out.println("I win, loser");
            } else {
                System.out.println("NOBODY WIN HOW DARE YOU TIE");
            }

            System.out.print("\nDo you want to play again (Y/N)? ");
            char again = scanner.next().toUpperCase().charAt(0);
            playagain = again == 'Y';
        }

        System.out.println("WHY would you want to play this game but anyways thanks for playing");
        scanner.close();
    }
}
