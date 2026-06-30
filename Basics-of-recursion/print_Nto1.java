public class print_Nto1 {
    public static void Revintegers(int i,int n){
        if(i<1){
            return;
        }
        else{
            System.out.println(i);
            Revintegers(i-1,n);
        }
    }

    public static void main(String[] args){
        Revintegers(10,1);
    }
}
