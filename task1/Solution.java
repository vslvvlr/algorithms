package leetcode.task1;

import java.util.Arrays;

/*
1. Two Sum

Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] data = {2, 5, 5, 11};
        int[] answer = solution.twoSum(data, 10);
        System.out.println(Arrays.toString(answer));
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                            result[0] = j;
                            result[1] = i;
                        }
                    }
                }
        return result;
    }
}
