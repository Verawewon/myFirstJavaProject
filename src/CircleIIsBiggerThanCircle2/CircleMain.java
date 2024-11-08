package CircleIIsBiggerThanCircle2;

public class CircleMain {
    public static void main(String[] args) {
        Circle c1 = new Circle(3);
        Circle c2 = new Circle(2);
        System.out.println("c1 Area: "+ c1.calculateArea());
        System.out.println("c2 Area: "+ c2.calculateArea());
        System.out.println("c1 Circumference: "+ c1.calculateCircumference());
        System.out.println("c2 Circumference: "+ c2.calculateCircumference());
        if (c1.isBiggerThan(c2)) System.out.println("c1 is bigger than c2");

    }





}
