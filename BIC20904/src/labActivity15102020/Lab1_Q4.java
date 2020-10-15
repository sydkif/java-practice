package labActivity15102020;

import java.util.Scanner;

public class Lab1_Q4 {

    public static void main(String[] args) {

        Scanner i = new Scanner(System.in);

        System.out.print("Enter an integer : ");
        int value = i.nextInt();
        int result = 1;
        int remainder = value;

        while (remainder != 0) {
            int num = remainder % 10;
            result = result * num;
            remainder = remainder / 10;
        }

        System.out.println("Result: " + result);
        i.close();
    }
}
