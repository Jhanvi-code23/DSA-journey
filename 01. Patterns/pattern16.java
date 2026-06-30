/*

A
BB
CCC
DDDD
EEEEE

*/


public class pattern16 {
    public static void main(String[] args){
    int n=5;
    for(char ch='A';ch<='A'+n;ch++){
        for(int i=0;i<ch-'A'+1;i++){
            System.out.print(ch);
        }
        System.out.println();
    }
}
}
