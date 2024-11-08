package RandomArray;

import java.util.Scanner;

public class BiggerOrSmallerOrSame {
    // Genrera ett slumptal mellan 0 och 99
    // gissa på ett tal och svara om slumptalet är större eller mindre
    // Skriv Grattis när du gissat rätt
    // Skriv enhetstest
    // Skriv slumptalsgeneratorn i separaat klass
    // Gissningslogiken får vara i valfri klass
    public static void main(String[] args) {
        RandomNumberGenerator rng = new RandomNumberGenerator();
        Scanner scan= new Scanner(System.in);
        int guess=-500;
        int lottery = rng.random(0, 99);

        do{
            System.out.print("guess a number(0-99): ");
            guess = scan.nextInt();
        if (guess == lottery) {
            System.out.println("////////////////////////////");
            System.out.println("guess: " + guess);
            System.out.println("lottery: " + lottery);
            System.out.println("Grattis!");
        } else if (guess > lottery) {
            System.out.println("your guess is bigger than lottery");

        } else {
            System.out.println("your guess is smaller than lottery");
        }
        }while(guess!=lottery);

    }
}
