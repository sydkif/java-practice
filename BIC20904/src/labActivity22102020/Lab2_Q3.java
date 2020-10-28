package labActivity22102020;

import java.util.Scanner;

public class Lab2_Q3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }

        int even = 0;
        int odd = 0;

        for (int j = 0; j < 10; j++) {
            if (array[j] % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Number of even number is " + even);
        System.out.println("Number of odd number is " + odd);

        System.out.println();
        input.close();
    }

}
