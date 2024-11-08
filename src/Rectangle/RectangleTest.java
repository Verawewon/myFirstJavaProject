package Rectangle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void calculateArea() {
        Rectangle rectangle = new Rectangle(3,5);
        assertEquals(15,rectangle.calculateArea());

    }

    @Test
    void calculatePerimeter() {
        Rectangle rectangle = new Rectangle(3,5);
        assertEquals(16,rectangle.calculatePerimeter());

    }

    @Test
    void isSquare() {
        Rectangle rectangle = new Rectangle(3,3);
        assertTrue(rectangle.isSquare());

    }
}