import java.util.Scanner;

public class GCD_TheGreatestCommonDivisor {
// 80.Skapa ett program som läser in siffrorna i ett bråk till en array med två platser. Algoritmen
//ska se till att bråket förkortas så långt som möjligt.
//Ex: Om siffrorna i bråket är 6 och 12 ska det lagras i arrayn som 1 och 2.
//Tips: Ta reda på SGD (största gemensamma divisor). I exemplet är SGD 6.

//    https://github.com/tomashelmfridsson/MVT24Stockholm/blob/main/src/array/Sgd.java
    public static void main(String[] args) {
        //int numerator = 7*2*2*2*3*2*2; // Täljare 672
        //int denominator = 7*3*5*2; // Nämnare 210
        // SGD är de siffror efter faktorisering som är samma
        // I detta fall 2*3*7 = 42
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("täljare(numerator)/nämnare(denominator)");
//        System.out.print("täljaren:");
//        int numerator= scanner.nextInt();
//        System.out.print("nämnare: ");
//        int denominator= scanner.nextInt();

        int numerator= 12;
        int denominator= 8;
        // Loop variant
        long starttime= System.nanoTime();
        int sgd= Math.min(numerator, denominator);
        for (;sgd>1;sgd--) {
            //System.out.println("sgd: "+sgd + " n%sgd: " + numerator % sgd +" d%sgd: " + denominator % sgd  );
            if(numerator % sgd ==0 && denominator % sgd==0) break;
        }
        System.out.println("Time with loop variant: "+ (System.nanoTime()-starttime)+ " ns");
        System.out.println("SGD är " + sgd);

        //Euclidean algorithm
        // Math.max(numerator, denominator) = int n0 * Math.min(numerator, denominator) + rest0
        // Math.min(numerator, denominator) = int n1 * rest0 + rest1
        // rest0 = int n2 * rest1 + rest2
        // osv till rest = 0, då är SGD senaste rest med värde
        starttime= System.nanoTime();
        int max= Math.max(numerator, denominator);
        int min= Math.min(numerator, denominator);
        while(max % min !=0)
        {
            System.out.println("///////////////////////////");
            int newMax=min;
            System.out.println("newMax: "+ newMax + " min: " +min+ " max: "+ max);
            min= max % min;
            System.out.println("newMax: "+ newMax + " min: " +min+ " max: "+ max);
            max= newMax;
            System.out.println("newMax: "+ newMax + " min: " +min+ " max: "+ max);
            System.out.println("///////////////////////////");
        }
        System.out.println("Time with Euclideans algorithm: " + (System.nanoTime() - starttime)+ " ns");
        System.out.println("SGD är " + min);
    }
}
