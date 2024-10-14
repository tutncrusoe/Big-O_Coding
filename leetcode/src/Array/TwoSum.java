package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int target = scanner.nextInt();
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

//    public static int[] twoSum(int[] nums, int target) {
//
//        int i, j = 0;
//        for (i = 0; i < nums.length; i++) {
//            for (j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    System.out.println(i + " " + j);
//                    return new int[]{i, j};
//
//                }
//            }
//        }
//        return null;
//    }

    /*
    One-pass Hash Table - Best solution
     */
    public static int[] twoSum(int[] nums, int target) {

        // Key is nums[index]
        // Value is index
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int key = target - nums[i];
            if (map.containsKey(key)) {
                return new int[]{map.get(key), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }

    /*
    Two-pass Hash Table
     */
//    public static int[] twoSum(int[] nums, int target) {
//
//        // Key is nums[index]
//        // Value is index
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            map.put(nums[i], i);
//        }
//
//        for (int i = 0; i < nums.length; i++) {
//            int key = target - nums[i];
//            if (map.containsKey(key) && map.get(key) != i) {
//                return new int[] {i, map.get(key)};
//            }
//        }
//
//        return null;
//    }

}