package io.robertcarroll;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {
    private Point point;
    @Before
    public void setUp() {
        point = new Point(3,1);
    }

    @Test
    public void isInTriangleTest() {
        Triangle triangle = new Triangle(3,1,7,1,5,5);
        boolean actual = point.isInTriangle(triangle);
        assertTrue(actual);
    }

}