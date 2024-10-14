package String;

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {

        String temp = "", res = "";
        int max = 0;
        Map<Character, Integer> map = new HashMap<>();
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                temp += s.charAt(i);
                map.put(s.charAt(i), i);
            } else {
                int j = map.get(s.charAt(i));
                if (j < start && start < i) {
                    temp += s.charAt(i);
                    map.remove(s.charAt(i));
                    map.put(s.charAt(i), i);
                } else if (start <= j && j < i) {
                    start = j + 1;
                    temp = s.substring(start, i + 1);
                    map.remove(s.charAt(i));
                    map.put(s.charAt(i), i);
                }
            }
            if (temp.length() > max) {
                res = temp;
                max = temp.length();
            }
        }
        System.out.println(res);
        return max;
    }
}
