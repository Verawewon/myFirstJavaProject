package Rectangle;

import java.awt.*;

public class RectangleRun {

    public static void main(String[] args) {
        int length= 5;
        int breadth=3;
        Rectangle rectangle = new Rectangle(length,breadth);
        System.out.println("length: "+length +" breadth: "+ breadth);
        System.out.println("area: "+ rectangle.calculateArea());
        System.out.println("perimeter: "+ rectangle.calculatePerimeter());
        if (rectangle.isSquare()) System.out.println("it is a square");

    }
}
