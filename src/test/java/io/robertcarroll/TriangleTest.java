package io.robertcarroll;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {
    private double DELTA = 1e-9;
    private Triangle triangle;
    @Before
    public void setUp() {
        triangle = new Triangle(3, 1, 7, 1, 5, 5);
    }

    @Test
    public void verifyTriangleTest_ValidTriangle() {
        boolean actual = triangle.verifyTriangle();
        assertTrue("The expected value is true", actual);
    }

    @Test
    public void verifyTriangleTest_InvalidTriangle() {
        Triangle invalidTriangle = new Triangle(0, 0, 2, 0, 4, 0);
        boolean actual = invalidTriangle.verifyTriangle();
        assertFalse("The expected value is false", actual);
    }

    @Test
    public void identicalXPointsTest(){
        boolean actual = triangle.identicalXPoints();
        assertFalse(actual);
    }

    @Test
    public void identicalYPointsTest(){
        boolean actual = triangle.identicalYPoints();
        assertFalse(actual);
    }

    @Test
    public void getAreaWithoutPointATest() {
        Point point = new Point(4,3);
        double expected = 4;
        double actual = triangle.getAreaWithoutPointA(point);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void getAreaWithoutPointBTest() {
        Point point = new Point(4,3);
        double expectValue = 0;
        double actualValue = triangle.getAreaWithoutPointB(point);
        assertEquals(expectValue, actualValue, DELTA);
    }

    @Test
    public void getAreaWithoutPointCTest() {
        Point point = new Point(4,3);
        double expected = 4;
        double actual = triangle.getAreaWithoutPointC(point);
        assertEquals(expected, actual, DELTA);
    }
}