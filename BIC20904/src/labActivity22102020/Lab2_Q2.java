package labActivity22102020;

import java.util.Scanner;

public class Lab2_Q2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] array = new int[15];

        for (int i = 0; i < 15; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }

        for (int j = 14; j >= 0; j--)
            System.out.print(array[j] + " ");

        System.out.println();
        input.close();
    }

}
