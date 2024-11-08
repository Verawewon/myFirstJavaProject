package Rectangle;

public class Rectangle {
    private int length, breadth;

    public Rectangle(int length, int breadth) {
        this.length= length;
        this.breadth= breadth;

    }
    public int calculateArea() {
        return length* breadth;
    }

    public int calculatePerimeter() {
        return (length*2+breadth*2);
    }

    public boolean isSquare() {
        return length == breadth;
    }
}
