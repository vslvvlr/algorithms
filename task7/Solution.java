package leetcode.task7;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int answer = solution.reverse(1534236469);
        System.out.println(answer);
    }

    public int reverse(int x) {
        int result = 0;
        String s = String.valueOf(x);
        StringBuilder sb = new StringBuilder();
        if (s.startsWith("-")) {
            sb.append("-");
            s = s.substring(1);
        }
        String reverse = new StringBuilder(s).reverse().toString();
        sb.append(reverse);
        try {
            result = Integer.parseInt(sb.toString());
        }
        catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return result;
    }
}
