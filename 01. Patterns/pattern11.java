/* Print the following pattern

1
01
101
0101
10101




We observe that every even no. of row is starting with a 0 and very odd row is starting with 1. 
Also we know that 1-1=0 and 1-0=1 - basic maths yaa
*/

public class pattern11 {
    public static void main(String[] args){
        int start=1;
        for(int i=1;i<=5;i++){
            if (i%2==0) start=0;
            else start=1;
            for(int j=0;j<i;j++){
                System.out.print(start);
                start=1-start;
            }
            System.out.println();
        }
    }
    
}
