package labActivity15102020;

public class Lab1_Exercise {

    public static void main(String[] args) {

        for (int r = 1; r <= 4; r++) {

            for (int b = 1; b <= (4 - r); b++)
                System.out.print(" ");

            for (int s = 1; s <= (2 * r - 1); s++)
                System.out.print("*");

            System.out.println(" ");
        }
    }
}

/*
      * 
     ***
    *****
   *******

   row       blank       star
    1  (4-1)  3  (2*1-1)  1
    2  (4-2)  2  (2*2-1)  3
    3  (4-3)  1  (2*3-1)  5
    4  (4-4)  0  (2*4-1)  7


*/
