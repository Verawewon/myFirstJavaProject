public class FirstIsHighest {
    // 11.Skapa ett program där två tal läses in och det första talet skrivs ut om det är störst.
    public static void main(String[] args) {
        int number1 = -15;
        int number2 = 7;

        //överkurs
        System.out.println((number1 > number2) ? number1 : number2);

        /*
        boolean firstIsHighest= number1>number2;
        if(firstIsHighest){
            System.out.println(number1);
        }else {
            System.out.println(number2);
        }
        */
    }
}
