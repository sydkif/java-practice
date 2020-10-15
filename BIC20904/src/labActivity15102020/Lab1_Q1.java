package labActivity15102020;

import java.util.Scanner;

public class Lab1_Q1 {

    public static void main(String[] args) {

        Scanner i = new Scanner(System.in);
        
        double mi, km;

        System.out.print("Enter a distance in Miles: ");
        mi = i.nextDouble();

        km = mi * 1.6;

        System.out.println("Your distance in Kilometers is " + km + " km");
        i.close();
    }
}
