public class OddEven {
    //13.Skapa ett program som läser in ett tal och skriver ut om det är jämnt.
    // (Använd modulooperatorn)
    public static void main(String[] args) {
        //binär=siffror
        int x = 2; //0001=1// 0010=2//0011=3 //1111=8+4+2+1=15
        byte y = 7; //00000111
        if (x != 0) {
            if (x % 2 == 0) System.out.println("even");
            else System.out.println("odd");
        /*
        överkurs
        dator tycker inte om räkna devidera.
        bitwise and
        &: two 1 give 1, two 0 give 0, one 1 and one 0 give 0
        |: ____________________________one 1 and one 0 give 1
        一般用来扩大选择范围，而不是叠成一个数，但是要叠的话也可以。
        2 & 1= 0
        0010
        0001
        ----
        0000 =0

        5 & 3 = 1
        0101
        0011
        ----
        0001


         */
            if ((x & 1) == 0) System.out.println("even");//byta & till * då funka inte.


        }else System.out.println("0");
    }
}
