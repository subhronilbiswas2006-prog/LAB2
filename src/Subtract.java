import java.util.Scanner;

class Subtract {
    void sub(int a, int b) {
        System.out.println("Result = " + (a - b));
    }

    void sub(int a, int b, int c) {
        System.out.println("Result = " + (a - b - c));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Subtract s = new Subtract();

        System.out.print("Enter two numbers: ");
        s.sub(sc.nextInt(), sc.nextInt());

        System.out.print("Enter three numbers: ");
        s.sub(sc.nextInt(), sc.nextInt(), sc.nextInt());
    }
}
