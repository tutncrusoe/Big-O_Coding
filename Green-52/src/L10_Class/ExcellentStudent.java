package L10_Class;

import java.util.Scanner;

public class ExcellentStudent {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++) {
            String studentName = scanner.nextLine();
            scanner.nextLine();
            float math = scanner.nextFloat();
            float writing = scanner.nextFloat();
            Student student = new Student(math, writing);
            boolean flag = student.calculate(math, writing);
            if (flag) {
                count++;
            }
        }
        System.out.println(count);
    }
}

class Student {
    float math;
    float writing;

    public Student(float math, float writing) {
        this.math = math;
        this.writing = writing;
    }

    protected boolean calculate(float math, float writing) {
        float gpa = (math + writing) / 2;
        return gpa >= 9.0;
    }
}