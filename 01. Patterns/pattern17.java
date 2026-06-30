/*

   A
  ABA
 ABCBA
ABCDCBA

// space-letters-reverseletters

space in first row= 3
spaces in 2nd row=2
in 3rd row=1

that is for first row- space=(n-1)
and then space keeps decreasing by 1 
*/

public class pattern17 {
    public static void main(String[] args){
        int n=4;
        int space=n-1;
        for(int i=0;i<=n;i++){
            //spaces
            for(int j=0; j<=space;j++){
                System.out.print(" ");
            }
            
            //letters
            for(char ch1='A';ch1<='A'+i;ch1++){
                System.out.print(ch1);
            }


            //reverse letters
            for(char ch2=(char)('A'+i-1);ch2>='A';ch2--){
                System.out.print(ch2);
            }

            System.out.println();
            space-=1;
        }
    }
}
