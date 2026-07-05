public class fibonacci {
    public static int f(int i){
        if(i==0){
            return 0;
        }
        if(i==1){
            return 1;
        }
        else{
            return f(i-1)+f(i-2);
        }
    }

    public static void main(String[] args){
        int n=5;
        System.out.println("Fibonacci of "+n+" is: "+ f(n));
    }
}
