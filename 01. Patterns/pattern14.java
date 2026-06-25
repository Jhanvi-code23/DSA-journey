/* Print the following

A
AB
ABC
ABCD
ABCDE

*/

public class pattern14{
    public static void main(){
        int n=5;
        for (int i=0;i<=n;i++){
            for(char ch='A';ch<='A'+i;ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}