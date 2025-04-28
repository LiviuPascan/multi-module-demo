package com.springliviu.shapes;

import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Тест для Demo и фигур.
 */
class DemoTest {

    @Test
    void testCircleAndSquare() {
        Shape c = new Circle(1.0);
        Shape s = new Square(2.0);

        assertAll(
                () -> assertEquals("Circle", c.name()),
                () -> assertEquals(Math.PI, c.area(), 1e-6),
                () -> assertEquals("Square", s.name()),
                () -> assertEquals(4.0, s.area(), 1e-6)
        );
    }
}