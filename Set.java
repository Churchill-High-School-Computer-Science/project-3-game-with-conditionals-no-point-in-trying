import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Card{
    String color;
    String shape;
    int number;
    String shading;

    public Card(String color, String shape, int number, String shading){
        this.color = color;
        this.shape = shape;
        int number;
        String shading;
        
    }
    public void display(){
        System.out.println(color+ " " + shape+ " " + number+" "+" " + shading);
    }
}


public class Set {
    static String[] colors = {"red","green","purple"};
    static String[] shapes = {"oval","squiggle","diamond"};
    static int[] number = {1,2,3};
    static String[] shadings ={"solid","striped","empty"};

    static List<Card> tableCards = new ArrayList<>();
    
    public static List<Card> generateDeck(){
        List<Card>deck = new ArrayList<>();
        
    }
    
    
    
}
