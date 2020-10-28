package labActivity22102020;

public class Lab2_MethodExample {

    public static void main(String[] args) {

        int total = sum(20, 30, 60);
        System.out.println("Total: " + total);

    }

    public static int sum(int a, int b, int c) {
        int s;
        s = a + b + c;
        return s;
    }
}
