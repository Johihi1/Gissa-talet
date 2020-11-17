import java.util.Scanner;
import java.util.Random;
public class GissaTalet {
    public static void main(String[] args){
        Random rand = new Random();
        int tal = rand.nextInt(100);
        int försök = 0;
        Scanner input = new Scanner(System.in);
        int guess;

        System.out.println("Gissa ett tal mellan 1 och 100.");
        guess = input.nextInt();

        if (guess == tal){

        }
        else if(guess < tal){
            System.out.println("För lågt.");
        }
        else if(guess > tal){
            System.out.println("För högt.");
        }
    }
}
