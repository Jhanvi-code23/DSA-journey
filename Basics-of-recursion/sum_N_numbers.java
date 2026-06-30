//sum of N numbers using Parametrized Recursion

public class sum_N_numbers {
    public static void summation(int i,int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }

        else{
            summation(i-1,sum+i);
        }
    }

    public static void main(String[] args){
        int n=10;
        summation(n,0); //initialise sum=0
    }
}
