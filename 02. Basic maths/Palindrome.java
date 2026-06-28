public class Palindrome {
    public static void main(String[] args){
        int N=121;
        int dup=N;
        int revNum=0;
        while(N>0){
            int lastDigit=N%10;
            N=N/10;
            revNum=(revNum*10)+lastDigit;
        }
        if(dup==revNum){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}