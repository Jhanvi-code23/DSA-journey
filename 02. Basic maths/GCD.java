import java.util.Scanner;
import java.lang.Math;

public class GCD {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter no.1: ");
        int n1=sc.nextInt();
        System.out.print("enter no.2: ");
        int n2=sc.nextInt();

        for (int i=(Math.min(n1,n2));i>=1;i--){
            if(n1%i==0 && n2%i==0){
                System.out.print(i);
                break;
            }
        }
        sc.close();
    }
}
