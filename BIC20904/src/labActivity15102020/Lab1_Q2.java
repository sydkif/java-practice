package labActivity15102020;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab1_Q2 {

    private static DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {

        Scanner i = new Scanner(System.in);
        double meters, feet;

        System.out.print("Enter a lenght in meters: ");
        meters = i.nextDouble();

        feet = meters * 3.2786;

        System.out.println("Your lenght in feet is " + df.format(feet) + " ft");
        i.close();
    }
}
