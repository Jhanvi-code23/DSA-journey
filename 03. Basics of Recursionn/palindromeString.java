public class palindromeString {
    public static boolean checkPalindrome(String str, int i){
        str=str.replaceAll("[^a-zA-Z0-9]", "");
        if(i>=str.length()/2){
            return true;
        }
        if(str.charAt(i)!=str.charAt(str.length()-i-1)){
            return false;
        }
        return checkPalindrome(str, i+1);
    }


    public static void main(String[] args){
        String str = "m0%ada0m";
        boolean isPalindrome = checkPalindrome(str, 0);
        System.out.println(isPalindrome);
    }
}