package L13_Reviews;

import java.util.*;

public class FirstRepeatingCharacter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        Set<Character> set = new HashSet<>();
        boolean flag = true;
        for (int i = 0; i < str.length(); i++) {
            if (set.contains(str.charAt(i))) {
                System.out.println(str.charAt(i));
                flag = false;
                break;
            } else {
                set.add(str.charAt(i));
            }
        }
        if (flag) {
            System.out.println("null");
        }
    }
}
