package labActivity15102020;

import java.util.Scanner;

public class Lab1_Q6 {

    public static void main(String[] args) {

        Scanner i = new Scanner(System.in);
        int num, sum = 0;

        for (int x = 1; x <= 5; x++) {
            System.out.print("Enter integer value : ");
            num = i.nextInt();
            sum = sum + num;
        }

        double avg = (double) sum / 5;
        System.out.println("Average : " + avg);
        i.close();
    }
}
