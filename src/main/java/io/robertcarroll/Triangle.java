package io.robertcarroll;

public class Triangle {
    private int[] pointA;
    private int[] pointB;
    private int[] pointC;
    private double area;

    public Triangle(int xPointA, int yPointA, int xPointB, int yPointB, int xPointC, int yPointC){
        pointA = new int[]{xPointA, yPointA};
        pointB = new int[]{xPointB, yPointB};
        pointC = new int[]{xPointC, yPointC};

        area = (pointA[0]*(pointB[1] - pointC[1]) + pointB[0]*(pointC[1] - pointA[1]) + pointC[0]*(pointA[1] - pointB[1]))/2;
    }

    public double getArea(){
        return area;
    }

    public boolean verifyTriangle(){
        return !(identicalXPoints() || identicalYPoints());
    }

    public boolean identicalXPoints(){
        return (pointA[0] == pointB[0] && pointA[0] == pointC[0]);
    }

    public boolean identicalYPoints(){
        return (pointA[1] == pointB[1] && pointA[1] == pointC[1]);
    }

    public double getAreaWithoutPointA(Point point){
        int[] pointCoordinates = point.getCoordinates();

        return Math.abs( (pointCoordinates[0]*(pointB[1] - pointC[1]) + pointB[0]*(pointC[1] - pointCoordinates[1]) + pointC[0]*(pointCoordinates[1] - pointB[1]))/2 );
    }

    public double getAreaWithoutPointB(Point point){
        int[] pointCoordinates = point.getCoordinates();

        return Math.abs( (pointA[0]*(pointCoordinates[1] - pointC[1]) + pointCoordinates[0]*(pointC[1] - pointA[1]) + pointC[0]*(pointA[1] - pointCoordinates[1]))/2 );
    }

    public double getAreaWithoutPointC(Point point){
        int[] pointCoordinates = point.getCoordinates();

        return Math.abs( (pointA[0]*(pointB[1] - pointCoordinates[1]) + pointB[0]*(pointCoordinates[1] - pointA[1]) + pointCoordinates[0]*(pointA[1] - pointB[1]))/2 );
    }
}
