package io.robertcarroll;

public class FindTrianglePoints {
    public int pointsBelongToTriangle(int x1, int y1, int x2, int y2, int x3, int y3, int p1, int q1, int p2, int q2){
        Triangle triangle = new Triangle(x1, y1, x2, y2, x3, y3);
        PointP pointP = new PointP(p1, q1);
        PointQ pointQ = new PointQ(p2, q2);

        if(triangle.verifyTriangle()){
            if(pointP.isInTriangle(triangle) && pointQ.isInTriangle(triangle)){
                return 3;
            }else if(pointP.isInTriangle(triangle)){
                return 1;
            }else if(pointQ.isInTriangle(triangle)){
                return 2;
            }

            return 4;
        }

        return 0;
    }
}
