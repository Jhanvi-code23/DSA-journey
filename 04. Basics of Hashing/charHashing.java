import java.util.Scanner;

public class charHashing{
    public static void frequency(){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter string: ");
        String s= sc.next();
        int[] hash= new int[52]; //bcoz we have 26 small letters and 26 capital letters so total 52 letters

        for (int i=0;i<s.length();i++){ //precomputation
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'){
                hash[ch-'a']++;
            }
            else if(ch>='A' && ch<='Z'){
                hash[ch-'A' + 26]++; //adding 26 to the index of capital letters so that they don't overlap with small letters in the hash array
            }
        }

        System.out.print("enter number of queries: ");
        int q=sc.nextInt(); //taking number of queries i.e, no. of characters whose frequency we want to find
        while(q-->0){
            System.out.print("enter character: ");
            char ch=sc.next().charAt(0); //incase user enters a string instead of a character, we take the first character of the string
            if(ch>='a' && ch<='z'){
                System.out.println("frequency of " + ch + " is : " + hash[ch-'a']); //printing the frequency of small letter
            }
            else if(ch>='A' && ch<='Z'){
                System.out.println("frequency of " + ch + " is : " + hash[ch-'A' + 26]); //printing the frequency of capital letter
            }
        }
        sc.close();
    }

    public static void main(String[] args){
        frequency();
    }
}