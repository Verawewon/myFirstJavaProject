package Calculator;

public class Calculator2 {
    private int nr1, nr2;
    public Calculator2(int[] termer) {
        nr1=termer[0];
        nr2=termer[1];
    }

    public int operator(char operator) {
        int result = 0;
        if (operator=='+'){
            result= nr1+ nr2;
        }
        if (operator=='-'){
            result= nr1- nr2;
        }
        if (operator=='*'){
            result= nr1* nr2;
        }
        if (operator=='/'){
            result= (int) nr1/ nr2;
        }
        return result;
    }
}
