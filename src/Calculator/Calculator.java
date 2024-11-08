package Calculator;

public class Calculator {

    private int num1, num2;

    public Calculator (int input1, int input2){
        num1= input1;
        num2= input2;

    }

    public int add(){
        int sum= num1+ num2;
        System.out.println("add: "+ sum);
        return sum;
    }

    public int sub(){
        int substration = num1- num2;
        System.out.println("substration: "+ substration);
        return substration;
    }

    public int mult(){
        int multiption = num1* num2;
        System.out.println("multiption: "+ multiption);
        return multiption;
    }

    public double div(){
        double divition = (double)num1/ num2;
        System.out.println("divition: "+ divition);
        return divition;
    }
}
