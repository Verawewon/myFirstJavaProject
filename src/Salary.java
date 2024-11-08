public class Salary {
    /*2. En försäljare har delvis prestationslön.
    Han får 8000 kr per månad i grundlön och 9% av försäljningssumman.
    Skapa ett program som beräknar lönesumman under en period.
    Försäljningssumman ska läsas in.
    */

    public static void main(String[] args) {
        int salary = 8000;
        final int PERCENTAGE = 9;
        int salesAmount = 20147;
        double newSalary = salary + (double) (salesAmount * PERCENTAGE / 100);
        String text = "New salary is " + newSalary;
        System.out.println(text);
    }
}
