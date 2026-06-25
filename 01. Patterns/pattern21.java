/*
print square- 

* * * *
*     *
*     *
* * * *

we realise that i=0 row and i=n-1 row and j=0 column and j=n-1 column are stars and rest are just spaces. 
*/

public class pattern21 {
    public static void main(String[] args) {
        int n=4;
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if (i==0 || i==n-1 || j==0 || j==n-1){
                    System.out.print("*"+ " ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}