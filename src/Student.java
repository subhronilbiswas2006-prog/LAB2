import java.util.Scanner;

class Student {
    int roll;
    String name;
    double cgpa;
}

class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] s = new Student[n];
        int min = 0;

        for (int i = 0; i < n; i++) {
            s[i] = new Student();
            System.out.print("Enter roll, name, cgpa: ");
            s[i].roll = sc.nextInt();
            s[i].name = sc.next();
            s[i].cgpa = sc.nextDouble();

            if (s[i].cgpa < s[min].cgpa)
                min = i;
        }

        System.out.println("Student with lowest CGPA: " + s[min].name);
    }
}
