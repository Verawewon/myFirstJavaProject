package CircleIIsBiggerThanCircle2;

public class Circle {
    private int radie;

    public Circle(int radie) {
        this.radie=radie;
    }

    public double calculateArea() {
        return radie*radie*Math.PI;
    }

    public double calculateCircumference() {
        return 2*radie*Math.PI;
    }

    public boolean isBiggerThan(Circle c2) {
        //System.out.println("this c1 radie: "+ this.radie);
        //System.out.println("this c2 radie: "+ c2.radie);
        return this.radie> c2.radie;
    }
}
