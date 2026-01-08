import java.util.Scanner;

class CountObj {
    static int count = 0;

    CountObj() {
        count++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of objects: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            new CountObj();
        }

        System.out.println("Number of objects = " + count);
    }
}
