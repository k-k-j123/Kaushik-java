import java.util.Scanner;

class Student {
    int rno;
    String name;

    public Student(int rno, String name) {
        this.rno = rno;
        this.name = name;
    }

    public String toString() {
        return "rollno:" + rno + " name:" + name;
    }
}

public class ArrObj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of objects");
        int n = sc.nextInt();
        Student[] objarr = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("enter rno");
            int r = sc.nextInt();
            System.out.println("enter name");
            String s = sc.next();
            objarr[i] = new Student(r, s);
        }
        System.out.println("Student details");
        for (int i = 0; i < n; i++) {
            System.out.println(objarr[i]);
        }
        sc.close();
    }
}
