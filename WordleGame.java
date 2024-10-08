import java.util.Random;
import java.util.Scanner;

public class WordleGame{
    public static void main(String[] args){
        String pink = "\u001B[35m";
        String reset = "\u001B[0m";
        String[] wordList = {"gloom","grief","angst","bleak","heavy","mopey","blues","dread","downs","weary"};
        Random rand = new Random();
        String correctWord = wordList[rand.nextInt(wordList.length)];
        Scanner input = new Scanner(System.in);
        int attempts = 6;

        System.out.println("Welcom to my WoRlDlE where evey guess feels like a missed change and evey letter btinh you closer to a loss There is no winning here just endless attempts one falling shot of. (why do I try)");

        while (attempts > 0) {
            System.out.print("Enter youre guess: ");
            String guess = input.nextLine().toLowerCase();

            if (guess.length() != 5){
                System.out.println("Please only enter a 5 letter word");
                continue;
            }

            if (guess.equals(correctWord)){
                System.out.println(pink +"You Won but at what cost? You played the game and now it feels empty"+ reset);
                break;
            } else {
                for (int i=0; i<guess.length(); i++){
                    if (guess.charAt(i) == correctWord.charAt(i)){
                        System.out.print(guess.charAt(i) + " is right and in right spot ");
                    } else if (correctWord.contains(guess.substring(i, i+1))){
                        System.out.print(guess.charAt(i) + " is right but in the wrong spot ");
                    } else {
                        System.out.print(guess.charAt(i) + " is wrong. ");
                    }
                }
                System.out.println();
                attempts--;
                System.out.print("You have "+attempts+ " attempts Left ");
            }
        }
        if (attempts == 0){
            System.out.println("Game over you failed the right answer was: "+correctWord);
        }
        input.close();
    }
}