package assignment1Package;

// FILENAME: Question_9_9.java

public class Question_9_9 {

    // Main method
    public static void main(String[] args) {

        // RegularPolygon with default value
        RegularPolygon rPoly1 = new RegularPolygon();
        System.out.println("Polygon 1"); // Display name
        System.out.printf(" Perimeter : %.2f", rPoly1.getPerimeter()); // Display perimeter
        System.out.printf("\n Area\t   : %.2f", rPoly1.getArea()); // Display area
        System.out.println(); // Blank space

        // RegularPolygon with specified number of sides and length
        RegularPolygon rPoly2 = new RegularPolygon(8, 6);
        System.out.println("\nPolygon 2"); // Display name
        System.out.printf(" Perimeter : %.2f", rPoly2.getPerimeter()); // Display perimeter
        System.out.printf("\n Area\t   : %.2f", rPoly2.getArea()); // Display area
        System.out.println(); // Blank space

        // RegularPolygon with specified number of sides, length, x- and y-coordinates
        RegularPolygon rPoly3 = new RegularPolygon(12, 5, 6.6, 8.2);
        System.out.println("\nPolygon 3"); // Display name
        System.out.printf(" Perimeter : %.2f", rPoly3.getPerimeter()); // Display perimeter
        System.out.printf("\n Area\t   : %.2f", rPoly3.getArea()); // Display area
        System.out.println("\n"); // Double Blank space

    }
}
