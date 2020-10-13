import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first value: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second value: ");
        double num2 = input.nextDouble();

        System.out.println();
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + String.format("%.2f", (num1 / num2)));
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
        System.out.println();

        if (num1 > num2) {
            System.out.println("Max num is " + num1);
        } else {
            System.out.println("Max num is " + num2);
        }

        input.close();
    }

}
