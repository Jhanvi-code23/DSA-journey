//example 1- printing 1 to n using backtracking

// public class Backtracking {
//     public static void integers(int i,int n){
//         if(i<1){
//             return;
//         }
//         else{
//             integers(i-1,n);
//             System.out.println(i); //note that the print statement is after the recursive call, so it will print in reverse order
//         }
//     }

//     public static void main(String[] args){
//         int n=10;
//         integers(n,n);
//     }
// }



//example 2- printing n to 1 using backtracking
public class Backtracking{
    public static void integers(int i,int n){
        if(i>n){
            return;
        }
        else{
            integers(i+1,n);
            System.out.println(i);
        }
        
    }

    public static void main(String[] args){
        int n=10;
        integers(1,n);
    }
}
