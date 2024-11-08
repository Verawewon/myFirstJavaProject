package Calculator;
import java.util.Scanner;

public class CaseOrIf_CaseFaster {

    public static void main(String[] args) {
        int num1=20600;
        int num2=21800 ;
       Scanner scanner= new Scanner(System.in);
//        System.out.println("you can put 2 nr in calculator,");
//        System.out.print("first number is: ");
//        num1= scanner.nextInt();
//        System.out.print("second number is: ");
//        num2= scanner.nextInt();

        Calculator myCalc= new Calculator(num1,num2);
        System.out.print("1 add, 2 sub, 3 mult, 4 div:(1-4) ");
        int mittVal= scanner.nextInt();

        long startTime;

        startTime=System.nanoTime();

        switch(mittVal){
            case 1: myCalc.add(); break;
            case 2: myCalc.sub(); break;
            case 3: myCalc.mult(); break;
            case 4: myCalc.div(); break;
            default:
                System.out.println("nothing can do");
        }
        // case:
        // run1: mittVal==4(place switch before if): 4537700
        // run2: mittVal==4(place if before switch): 30500
        // run3: mittVal==1(place if before switch): 20600
        // run4: mittVal==1(place switch before if): 3776700
        System.out.println(System.nanoTime()- startTime);

        startTime =System.nanoTime();
        if (mittVal==1) myCalc.add();
        if (mittVal==2) myCalc.sub();
        if (mittVal==3) myCalc.mult();
        if (mittVal==4) myCalc.div();
        //if
        //run1: mittVal==4(place switch before if):32200
        //run2: mittVal==4(place if before switch):4717200
        //run3: mittval==1(place if before switch):4209300
        // run4: mittVal==1(place switch before if): 21800
        System.out.println(System.nanoTime()- startTime);

        //conclusion: switch kör fastare än if.
        // always if> case
        //4717200 > 4537700,    ca 0,962
        //32200 > 30500,        ca 0,947
        //4209300 > 3776700,    ca 0,897
        //21800 > 20600,        ca 0,945


    }
}
