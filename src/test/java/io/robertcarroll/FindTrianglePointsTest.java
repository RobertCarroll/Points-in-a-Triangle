package io.robertcarroll;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindTrianglePointsTest {
    private FindTrianglePoints findTrianglePoints;
    @Before
    public void setUp() {
        findTrianglePoints = new FindTrianglePoints();
    }

    @Test
    public void pointsBelongToTriangle_Invalid() {
        int expected = 0;
        int actual = findTrianglePoints.pointsBelongToTriangle(0,0,2,0,4,0,2,0,4,0);
        assertEquals(expected, actual);
    }

    @Test
    public void pointsBelongToTriangle_OnlyPointP() {
        int expected = 1;
        int actual = findTrianglePoints.pointsBelongToTriangle(3,1,7,1,5,5,3,1,0,0);
        assertEquals(expected, actual);
    }

    @Test
    public void pointsBelongToTriangle_OnlyPointQ() {
        int expected = 2;
        int actual = findTrianglePoints.pointsBelongToTriangle(3,1,7,1,5,5,1,1,4,3);
        assertEquals(expected, actual);
    }

    @Test
    public void pointsBelongToTriangle_BothPoints() {
        int expected = 3;
        int actual = findTrianglePoints.pointsBelongToTriangle(3,1,7,1,5,5,5,2,6,3);
        assertEquals(expected, actual);
    }

    @Test
    public void pointsBelongToTriangle_NoPoints() {
        int expected = 4;
        int actual = findTrianglePoints.pointsBelongToTriangle(3,1,7,1,5,5,1,1,2,2);
        assertEquals(expected, actual);
    }
}