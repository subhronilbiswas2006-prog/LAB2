import java.util.Scanner;

class Rectangle2 {
    double l, b;

    Rectangle2() {
        l = 0;
        b = 0;
    }

    Rectangle2(double x, double y) {
        l = x;
        b = y;
    }

    void area() {
        System.out.println("Area = " + (l * b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length and breadth: ");
        Rectangle2 r = new Rectangle2(sc.nextDouble(), sc.nextDouble());
        r.area();
    }
}
