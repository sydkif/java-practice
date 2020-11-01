package lecturePackage;

public class WhiteBoard {

    public static void main(String[] args) {

        Course c1 = new Course("Programming");
        Course c2 = new Course("Database");

        c1.addStudent("Azah");
        c1.addStudent("Sam");
        c1.addStudent("Kugen");

        c2.addStudent("Lim");
        c2.addStudent("Superman");

        String[] students1 = c1.getStudents();
        String[] students2 = c2.getStudents();

        System.out.println("Total students in " + c1.getCourseName() + " is " + c1.getNumberOfStudent());
        for (int i = 0; i < c1.getNumberOfStudent(); i++)
            System.out.println((students1[i]));

        System.out.println("\nTotal students in " + c2.getCourseName() + " is " + c2.getNumberOfStudent());
        for (int i = 0; i < c2.getNumberOfStudent(); i++)
            System.out.println((students2[i]));

        System.out.println();
    }

}

