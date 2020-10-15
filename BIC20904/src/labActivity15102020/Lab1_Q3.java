package labActivity15102020;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab1_Q3 {

    private static DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {

        Scanner i = new Scanner(System.in);

        double subtotal, gratuity_rate, gratuity, total;

        System.out.print("Subtotal (RM): ");
        subtotal = i.nextDouble();
        System.out.print("Grantuity Rate (%): ");
        gratuity_rate = i.nextDouble();

        gratuity = subtotal * (gratuity_rate / 100);
        System.out.println("Gratuity: RM " + df.format(gratuity));
        total = subtotal + gratuity;
        System.out.println("TOTAL: RM " + df.format(total));

        i.close();
    }
}
