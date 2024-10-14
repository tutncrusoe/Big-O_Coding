package Array;

import java.util.*;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println((removeDuplicates(nums)));
    }

    public static int removeDuplicates(int[] nums) {
        int i,j = 1;
        for (i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
