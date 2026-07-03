// public class base_condition {
//     static int count=0;
//     public static void cntr(){
//         if(count==4){
//             return;
//         }
//         else{
//             System.out.println(count);
//             count++;
//         }
//         cntr();
//     }


//     public static void main(String[] args){
//         cntr();
//     }
// }








//EXAMPLE 2- Print name of the student 5 times using recursion with base condition.

// public class base_condition{
//     static int count=0;
//     public static void name(){
//         if(count==5){
//             return;
//         }
//         else{
//             System.out.println("John");
//             count++;
//         }
//         name();
//     }
    

//     public static void main(String[] args){
//         name();
//     }
// }



//approach 2
public class base_condition{
    public static void printName(int i,int n){
        if(i>n){
            return;
        }
        else{
            System.out.println("Jhanvi");
            printName(i+1,n);
        }
    }

    public static void main(String[] args){
        printName(1,10);
    }

    
}
