/*

*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *

*/

public class pattern20 {
    public static void main(String[] args){
        int i=1;
        int n=5;
        int spaces=2*(n-i);


        for (i=0;i<n;i++){
            //stars
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }

            //spaces
            for(int k=0;k<spaces;k++){
                System.out.print(" ");
            }

            //stars
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
            spaces-=2;
        }


        int spaces2=2;
        for(i=0;i<=n-1;i++){   //print n-1 rows
          //stars
          for(int j=1;j<=n-i-1;j++){
            System.out.print("*");
          }  

          //spaces- starting from 0, increasing by 2 everytime.
          
          for(int k=0;k<spaces2;k++){
            System.out.print(" ");
          }


          //stars
          for(int j=1;j<=n-i-1;j++){
            System.out.print("*");
          }
          System.out.println();
          spaces2+=2;
          
        }  
    }
}
