package labActivity15102020;

import java.util.Scanner;

public class Lab1_Q5 {

    public static void main(String[] args) {

        Scanner i = new Scanner(System.in);

        System.out.print("Weight (kG) : ");
        double weight = i.nextDouble();
        System.out.print("Height (m) : ");
        double height = i.nextDouble();

        double BMI = weight / (height * height);

        if (BMI >= 30.0)
            System.out.println("Obese");
        else if (BMI >= 25.0)
            System.out.println("Overweight");
        else if (BMI >= 18.5)
            System.out.println("Normal");
        else
            System.out.println("Underweight");

        i.close();
    }
}
