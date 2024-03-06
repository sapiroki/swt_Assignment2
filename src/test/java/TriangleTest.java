import org.example.Triangle;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TriangleTest {

    @Test
    public void testEquilateralTriangle() {
        assertEquals("Equilateral", Triangle.triangleType(3, 3, 3));
    }

    @Test
    public void testIsoscelesTriangle() {
        assertEquals("Isosceles", Triangle.triangleType(5, 5, 3));
        assertEquals("Isosceles", Triangle.triangleType(5, 3, 5));
        assertEquals("Isosceles", Triangle.triangleType(3, 5, 5));
    }

    @Test
    public void testScaleneTriangle() {
        assertEquals("Scalene", Triangle.triangleType(3, 4, 5));
    }

    @Test
    public void testNotATriangle() {
        assertEquals("NotATriangle", Triangle.triangleType(1, 2, 3));
        assertEquals("NotATriangle", Triangle.triangleType(4, 1, 2));
        assertEquals("NotATriangle", Triangle.triangleType(2, 4, 1));
    }

    @Test
    public void testInvalidInput() {
        assertEquals("Value of a is not in the range of permitted values.", Triangle.triangleType(0, 2, 3));
        assertEquals("Value of b is not in the range of permitted values.", Triangle.triangleType(2, 201, 3));
        assertEquals("Value of c is not in the range of permitted values.", Triangle.triangleType(2, 3, 0));
    }
}