package CircleIIsBiggerThanCircle2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircleTest {


    @Test
    void calculateArea() {
        Circle circle = new Circle(3);
        assertEquals(3*3*Math.PI,circle.calculateArea());

    }

    @Test
    void calculateCircumference() {
        Circle circle = new Circle(3);
        assertEquals(2*3*Math.PI,circle.calculateCircumference());

    }

    @Test
    void isBiggerThan() {
        Circle c1 = new Circle(10);
        Circle c2 = new Circle(8);
        assertTrue(c1.isBiggerThan(c2));
    }

}
