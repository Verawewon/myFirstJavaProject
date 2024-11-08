public class OneCharAtTime {
    //34.Skapa ett program som läser in och skriver ut ett tecken i taget
    // tills en * skrivs in.
    public static void main(String[] args) {
        String string= "Bäst klassen ni är så bra* eller hur";
        int i=0;
        while(string.charAt(i)!='*')
        {
            System.out.println(string.charAt(i)+" vid index "+i);
            i++;

        }
        for(int j=0; j< string.length(); j++){
            if(string.charAt(j) !='*')
                System.out.print(string.charAt(j));
            else break;
        }

    }
}
