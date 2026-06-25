/*

**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********


Concept- reverse stars-spaces-reverse stars.... then stars-spaces-stars
*/

public class pattern19 {
    public static void main(String[] args){
        int n=5;
        int spaces=0;


        //first half symmetry
        for(int i=0;i<=n;i++){
          //stars
          for(int j=1;j<=n-i;j++){
            System.out.print("*");
          }  

          //spaces- starting from 0, increasing by 2 everytime.
          
          for(int k=0;k<spaces;k++){
            System.out.print(" ");
          }


          //stars
          for(int j=1;j<=n-i;j++){
            System.out.print("*");
          }
          System.out.println();
          spaces+=2;
          
        }  
        
        


        //second half symmetry-
        int i=1;
        int spaces2=2*(n-i);
        for (i=0;i<n;i++){
            //stars
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }

            //spaces
            for(int k=0;k<spaces2;k++){
                System.out.print(" ");
            }

            //stars
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
            spaces2-=2;
        }

    }
}
