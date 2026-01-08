import java.util.Scanner;

class Box {
    double l, w, h;

    void volume() {
        System.out.println("Volume = " + (l * w * h));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Box b = new Box();

        System.out.print("Enter length, width, height: ");
        b.l = sc.nextDouble();
        b.w = sc.nextDouble();
        b.h = sc.nextDouble();

        b.volume();
    }
}
