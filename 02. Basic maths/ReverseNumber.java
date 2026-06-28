public class ReverseNumber {
    public static void main(String[] args){
        int N=1904;
        int revNum=0;
        while(N>0){
            int lastDigit=N%10;
            N=N/10;
            revNum=(revNum*10)+lastDigit;
        }
        System.out.println("The revsersed number is "+revNum);
    }
}