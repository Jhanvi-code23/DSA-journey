/* Print the following pattern 

1      1
12    21
123  321
12344321


concept is numbers, spaces and reverse numbers
space formaule for 1st row can be 2(n-1) and spaces in every row is decreasing by 2
*/

public class pattern12 {
    public static void main(String[] args){
        int n=4;
        int space= 2*(n-1);

        for(int i=1;i<=n;i++){

            //numbers
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }

            //spaces
            for(int k=1;k<=space;k++){
                System.out.print(" ");
            }


            //reverse numbers
            for(int l=i; l>=1; l--){
                System.out.print(l);
            }
            

            System.out.println();
            space-=2;
        }
    }
}
