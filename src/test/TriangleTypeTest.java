
//<dependency>
//    <groupId>org.junit.jupiter</groupId>
//    <artifactId>junit-jupiter-engine</artifactId>
//    <version>5.1.0</version>
//    <scope>test</scope>
//</dependency>

import org.junit.jupiter.api.Test;
import swe261p.TriangleType;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static swe261p.TriangleType.triangleType;

public class TriangleTypeTest {
  
    final int TYPE_SCALENE = 1;
    final int TYPE_ISOSCELES = 2;
    final int TYPE_EQUILATERAL = 3;
    final int TYPE_NOT_A_TRIANGLE = 4;
    final int TYPE_OUT_OF_BOUND = 5;

    @Test
    public void testAll() {
        testScalene();
        testIsosceles();
        testEquilateral();
        testNotATriangle();
        testOutOfBound();
        testConstructor();
    }

    @Test
    public void testScalene() {
        assertEquals(TYPE_SCALENE, triangleType(3, 4, 5));
    }

    @Test
    public void testIsosceles() {
        assertEquals(TYPE_ISOSCELES, triangleType(2, 2, 1));
        assertEquals(TYPE_ISOSCELES, triangleType(2, 1, 2));
        assertEquals(TYPE_ISOSCELES, triangleType(1, 2, 2));

    }

    @Test
    public void testEquilateral() {
        assertEquals(TYPE_EQUILATERAL, triangleType(1, 1, 1));
    }

    @Test
    public void testNotATriangle() {
        assertEquals(TYPE_NOT_A_TRIANGLE, triangleType(-1, 1, 1));
        assertEquals(TYPE_NOT_A_TRIANGLE, triangleType(1, -1, 1));
        assertEquals(TYPE_NOT_A_TRIANGLE, triangleType(1, 1, -1));

        assertEquals(TYPE_NOT_A_TRIANGLE, triangleType(3, 2, 1));
        assertEquals(TYPE_NOT_A_TRIANGLE, triangleType(2, 3, 1));
        assertEquals(TYPE_NOT_A_TRIANGLE, triangleType(1, 2, 3));

        assertEquals(TYPE_NOT_A_TRIANGLE, triangleType(1, 1, 3));
        assertEquals(TYPE_NOT_A_TRIANGLE, triangleType(1, 3, 1));
        assertEquals(TYPE_NOT_A_TRIANGLE, triangleType(3, 1, 1));
    }

    @Test
    public void testOutOfBound() {
        assertEquals(TYPE_OUT_OF_BOUND, triangleType(1001, 1000, 1000));
        assertEquals(TYPE_OUT_OF_BOUND, triangleType(1000, 1001, 1000));
        assertEquals(TYPE_OUT_OF_BOUND, triangleType(1000, 1000, 1001));

    }

    @Test
    public void testConstructor() {
        new TriangleType();
    }
}
