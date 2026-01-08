import java.util.Scanner;

class Rectangle {
    double l, b;

    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length and breadth: ");
        l = sc.nextDouble();
        b = sc.nextDouble();
    }

    void display() {
        System.out.println("Area = " + (l * b));
        System.out.println("Perimeter = " + (2 * (l + b)));
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.read();
        r.display();
    }
}
