public class print_1toN {
    public static void integers(int i,int n){
        if(i>n){
            return;
        }
        else{
            System.out.println(i);
            integers(i+1,n);
        }
    }

    public static void main(String[] args){
        integers(1,10);
    }
}
