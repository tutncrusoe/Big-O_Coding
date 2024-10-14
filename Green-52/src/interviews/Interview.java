package interviews;

import java.util.function.Predicate;

public class Interview {

    public static void main(String[] args) {

        // https://www.javastring.net/java/string/pool
        // https://www.javamadesoeasy.com/2015/05/string-pool-string-literal-pool-string.html
        String s1_literal = "abc";
        String s2_literal = "abc";
        System.out.printf("s1_literal==s2_literal: %s\n", s1_literal == s2_literal); // true
        System.out.printf("s1_literal.equals(s2_literal): %s\n", s1_literal.equals(s2_literal)); // true

        s1_literal = "abc";
        String s3 = new String("abc");
        System.out.printf("\ns1_literal==s3: %s\n", s1_literal == s3); // false
        System.out.printf("s1_literal.equals(s2_literal): %s\n", s1_literal.equals(s3)); // true

        s3 = new String("abc");
        String s4 = new String("abc");
        System.out.printf("\ns3==s4: %s\n", s3 == s4); // false
        System.out.printf("s3.equals(s4): %s\n", s3.equals(s4)); // true

        // https://gpcoder.com/3468-integer-constant-pool-trong-java/
        Integer i1 = 127;
        Integer i2 = 127;
        System.out.println(i1 == i2); // = true

        Integer i3 = 128;
        Integer i4 = 128;
        System.out.println(i3 == i4); // = false

        Integer i5 = new Integer(127);
        Integer i6 = new Integer(127);
        System.out.println(i5 == i6); // = false

        Integer i7 = 127;
        Integer i8 = new Integer(127);
        System.out.println(i7 == i8); // = false

        int i9 = 127;
        System.out.println(i7 == i9); // = true

        Integer i_literal = 5;
        Integer i2_literal = 5;
        System.out.printf("\ni_literal==i2_literal: %s\n", i_literal == i2_literal); // true
        System.out.printf("i_literal.equals(i2_literal): %s\n", i_literal.equals(i2_literal)); // true

        i_literal = 5;
        Integer i_3 = new Integer(5);
        System.out.printf("\ni_literal==i_3: %s\n", i_literal == i_3); // false
        System.out.printf("i.equals(i_3): %s\n", i_literal.equals(i_3)); // true

        i_3 = new Integer(5);
        Integer i_4 = new Integer(5);
        System.out.printf("\ni_3==i_4: %s\n", i_4 == i_3); // false
        System.out.printf("i_4.equals(i_3): %s\n", i_4.equals(i_3)); // true

        int i_5 = new Integer(5);
        Integer i6_literal = 5;
        System.out.printf("\ni_5==i6_literal: %s\n", i_5 == i6_literal); // true
        System.out.printf("i6_literal.equals(i_5): %s\n", i6_literal.equals(i_5)); // true

        // Object
        Object ob1 = new Object();
        Object ob2 = new Object();
        System.out.printf("\nob1==ob2: %s\n", ob1 == ob2); // false
        System.out.printf("ob1.equals(ob2): %s\n", ob1.equals(ob2)); // false

        Employee one = new Employee();
        one.id = 101;
        Employee two = new Employee();
        two.id = 101;

        System.out.printf("\nemployee1 == employee2: %s\n", one == two); // false
        System.out.printf("employee1.equals(employee2): %s\n", one.equals(two)); // false

        // https://www.geeksforgeeks.org/java-8-predicate-with-examples/
        predicate_or();
    }

    static class Employee {
        int id;

        public Employee() {
        }
//
//        public boolean equals(Employee employee) {
//            return this.id == employee.id;
//        }
//
//        @Override
//        public int hashCode() {
//            return Objects.hash(id);
//        }
    }

    public static Predicate<String> hasLengthOf10 = new Predicate<String>() {
        @Override
        public boolean test(String t)
        {
            return t.length() > 10;
        }
    };

    public static void predicate_or()
    {

        Predicate<String> containsLetterA = p -> p.contains("B");
        String containsA = "And";
        boolean outcome = hasLengthOf10.or(containsLetterA).test(containsA);
        System.out.println(outcome);
    }
}
