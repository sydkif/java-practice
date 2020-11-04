package assignment1Package;

// FILENAME: RegularPolygon.java

public class RegularPolygon {

    private int sideNumber; // Number of side for the polygon
    private double sideLength; // Length of side for the polygon
    private double centerX; // x-coordinate for polygon center
    private double centerY; // y-coordinate for polygon center

    // RegularPolygon with default value
    public RegularPolygon() {
        sideNumber = 3;
        sideLength = 1;
        centerX = 0;
        centerY = 0;
    }

    // RegularPolygon with specified number of sides and length
    public RegularPolygon(int num, double len) {
        sideNumber = num;
        sideLength = len;
    }

    // RegularPolygon with specified number of sides, length, x- and y-coordinates
    public RegularPolygon(int num, double len, double x, double y) {
        sideNumber = num;
        sideLength = len;
        centerX = x;
        centerY = y;
    }

    // Get the number of sides
    public int getSideNumber() {
        return sideNumber;
    }

    // Set the number of sides
    public void setSideNumber(int num) {
        sideNumber = num;
    }

    // Get the length of side
    public double getSideLength() {
        return sideLength;
    }

    // Set the length of side
    public void setSideLength(double len) {
        sideLength = len;
    }

    // Get the center x-coordinate
    public double getCenterX() {
        return centerX;
    }

    // Set the center x-coordinate
    public void setCenterX(double x) {
        centerX = x;
    }

    // Get the center y-coordinate
    public double getCenterY() {
        return centerY;
    }

    // Set the center y-coordinate
    public void setCenterY(double y) {
        centerY = y;
    }

    // Calculate and return the perimeter of the polygon
    public double getPerimeter() {
        return sideNumber * sideLength;
    }

    // Calculate and return the area of the polygon
    public double getArea() {
        return (sideNumber * sideLength * sideLength) / (4 * Math.tan(Math.PI / sideNumber));
    }

}
