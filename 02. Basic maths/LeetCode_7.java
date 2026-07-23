/*
 * LEETCODE 7. Reverse Integer
 *
 * Given a signed 32-bit integer x, return x with its digits reversed.
 * If reversing x causes the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.
 *
 * Example 1:
 * Input: x = 123
 * Output: 321
 *
 * Example 2:
 * Input: x = -123
 * Output: -321
 *
 * Example 3:
 * Input: x = 120
 * Output: 21
 */

public class LeetCode_7  {
    public int reverse(int x) {
        long revNum=0;
        while(x!=0){
            int lastDigit=x%10;
            x=x/10;
            revNum=(revNum*10)+ lastDigit;
        }
        if(revNum>Integer.MAX_VALUE || revNum<Integer.MIN_VALUE){
            return 0;
        }
        return (int) revNum;
    }


    public static void main (String[] args) {
        LeetCode_7 solution = new LeetCode_7();
        System.out.println(solution.reverse(123));    // Output: 321
        System.out.println(solution.reverse(-123));   // Output: -321
        System.out.println(solution.reverse(120));    // Output: 21
        System.out.println(solution.reverse(0));      // Output: 0
        System.out.println(solution.reverse(1534236469)); // Output: 0 (overflow case)
    }
}