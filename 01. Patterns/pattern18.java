/*

E
DE
CDE
BCDE
ABCDE

*/

public class pattern18 {
    public static void main(String[] args){
        int n=5;
        char ch;
        for(int i=0;i<n;i++){
            for(ch=(char)('E'-i);ch<='E';ch++){
                System.out.print(ch);
            }
            System.out.println();

        }
    }
}
