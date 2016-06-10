package io.robertcarroll;

public class Point {
    private int[] coordinates;

    public Point(int x, int y){
        coordinates = new int[] {x,y};
    }

    public boolean isInTriangle(Triangle triangle){
        double area1 = triangle.getAreaWithoutPointA(this);
        double area2 = triangle.getAreaWithoutPointB(this);
        double area3 = triangle.getAreaWithoutPointC(this);

        return triangle.getAreaWithoutPointA(this) + triangle.getAreaWithoutPointB(this) + triangle.getAreaWithoutPointC(this) == triangle.getArea();
    }

    public int[] getCoordinates(){
        return coordinates;
    }
}
