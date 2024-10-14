package L10_Class;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OldestEmployee {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        List<Object> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String msnv = in.next();
            String name = in.next();
            int year = in.nextInt();
            Employee e = new Employee(msnv, name, year);
            list.add(e);
        }

        int oldestAge = 2024;
        int minMsnv = 999999;
        Employee oldestEmployee = null;
        for (int i = 0; i < list.size(); i++) {
            Employee e = (Employee) list.get(i);
            if (e.year < oldestAge) {
                oldestAge = e.year;
                oldestEmployee = e;
                minMsnv = Integer.valueOf(e.msnv);
            }
            if (Integer.valueOf(e.msnv) < minMsnv && e.year == oldestAge) {
                oldestAge = e.year;
                oldestEmployee = e;
                minMsnv = Integer.valueOf(e.msnv);
            }
        }

        System.out.println(oldestEmployee.toString());

    }
}

class Employee {

    String msnv;
    String name;
    int year;

    public Employee(String msnv, String name, int year) {
        this.msnv = msnv;
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return msnv + " " + name + " " + year;
    }
}