package leetcode.task9;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(1234321));

    }

    public boolean isPalindrome(int x) {
        char[] chars = String.valueOf(x).toCharArray();
        int j = chars.length-1;
        for (int i = 0; i < chars.length; i++) {
            System.out.println("i = " + chars[i]);
            System.out.println("j = " + chars[j]);
            if (chars[i] != chars[j]) {
                return false;
            } else {
                j--;
            }

        }
        return true;
    }
}
