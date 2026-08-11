/*
 * LEETCODE 9. Palindrome Number
 *
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 *
 * Example 1:
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 *
 * Example 2:
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-.
 *
 * Example 3:
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left.
 */
public class Leetcode_9 {
    public boolean isPalindrome(int x) {
        long dup=x;
        long revNum=0;
        if(x<0){
            return false;
        }
        while(x!=0){
            int lastdig=x%10;
            x=x/10;
            revNum=(revNum*10)+lastdig;
        }

        if(revNum == dup){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Leetcode_9 solution = new Leetcode_9();
        System.out.println(solution.isPalindrome(121));   // Output: true
        System.out.println(solution.isPalindrome(-121));  // Output: false
        System.out.println(solution.isPalindrome(10));    // Output: false
    }
}