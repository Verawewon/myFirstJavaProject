package RandomArray;

import java.util.Arrays;

public class RandomArray {
    // spara 10 slumptal ifrån 1-100 i en array.
    // skriva ut arrayn till consolen.
    // skapa en method som returnera slumptal från 1-100 i en array
    // storleken på array är också ett slumptal från 1-100
    public static void main(String[] args) {
        int[] a= randomArray();
        System.out.println("Array length: "+ a.length);
        System.out.println(Arrays.toString(a));
    }

    private static int[] randomArray() {

        int min=1;
        int max= 100;
        int range= max-min+1; // include first or last number

        //range 100-1+1 = 100
        //random: 0-0.999
        // loop: 0.999 * 100= 99.99 => (int)99.99=99
        // loop: 0.999 * 100 +1 = 100.99 => (int)100.99= 100

        int arrayLength= (int)(Math.random() * range)+1;
        int[] random1_100= new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            random1_100[i]= (int)(Math.random() * range)+ min; // min for förskjutning
        }
        return random1_100;
    }
}
