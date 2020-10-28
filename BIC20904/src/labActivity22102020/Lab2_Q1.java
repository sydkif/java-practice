package labActivity22102020;
 
/*

    Question 1
    
    Write a program that reads students’ scores, gets the best 
    score, and then assigns grades based on the following 
    scheme:
    Grade is A if score is greater than or equal to best-5;
    Grade is B if score is greater than or equal to best-10;
    Grade is C if score is greater than or equal to best-15;
    Grade is D if score is greater than or equal to best-20;
    Grade is F otherwise.
    The program prompts the user to enter the total number 
    of students, and then prompts the user to enter all of the 
    scores, and concludes by displaying the grades.

*/

import java.util.Scanner;

public class Lab2_Q1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number of students: ");
        int numOfStudents = input.nextInt();

        int[] array = new int[numOfStudents];

        System.out.print("Enter " + numOfStudents + " scores: ");

        for (int x = 0; x < numOfStudents; x++) {
            array[x] = input.nextInt();
        }

        int max = array[0];
        for (int y = 1; y < numOfStudents; y++) {
            if (max < array[y])
                max = array[y];
        }

        for (int z = 0; z < numOfStudents; z++) {
            if (array[z] >= (max - 5))
                System.out.println("Student " + (z + 1) + " score is " + array[z] + " and grade is A");
            else if (array[z] >= (max - 10))
                System.out.println("Student " + (z + 1) + " score is " + array[z] + " and grade is B");
            else if (array[z] >= (max - 15))
                System.out.println("Student " + (z + 1) + " score is " + array[z] + " and grade is C");
            else if (array[z] >= (max - 20))
                System.out.println("Student " + (z + 1) + " score is " + array[z] + " and grade is D");
            else
                System.out.println("Student " + (z + 1) + " score is " + array[z] + " and grade is F");
        }

        System.out.println();
        input.close();
    }

}
