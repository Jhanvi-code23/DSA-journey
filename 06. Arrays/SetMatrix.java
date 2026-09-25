//Brute Force Approach

// import java.util.Scanner;
// public class SetMatrix{
//     public static void markRow(int[][] matrix,int row){
//         for (int j=0;j<matrix[0].length;j++){
//             if (matrix[row][j]!=0){
//                 matrix[row][j]=-1;
//             }
//         }
//     }

//     public static void markColumn(int[][] matrix,int col){
//         for (int i=0;i<matrix.length;i++){
//             if (matrix[i][col]!=0){
//                 matrix[i][col]=-1;
//             }
//         }
//     }

//     public static void setMatrix(int[][] matrix){
//     for(int i=0;i<matrix.length;i++){
//         for (int j=0;j<matrix[0].length;j++){
//             if (matrix[i][j]==0){
//                 markRow(matrix,i);
//                 markColumn(matrix,j);
//             }
//         }
//     }
// }

//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the number of rows and columns");
//         int n=sc.nextInt();
//         int m=sc.nextInt();
//         int[][] matrix=new int[n][m];
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 System.out.println("Enter the element at position ("+i+","+j+")");
//                 matrix[i][j]=sc.nextInt();
//             }
//         }
//         setMatrix(matrix);
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 if (matrix[i][j]==-1){
//                     matrix[i][j]=0;
//                 }
//                 System.out.print(matrix[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }



//Better Approach
public class SetMatrix{
    public static void setMatrix(int[][] matrix){
        int n=matrix.length;
        int m=matrix[0].length;
        boolean rowFlag=false;
        boolean colFlag=false;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if (matrix[i][j]==0){
                    if (i==0){
                        rowFlag=true;
                    }
                    if (j==0){
                        colFlag=true;
                    }
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }

        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if (matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }

        if (rowFlag){
            for(int j=0;j<m;j++){
                matrix[0][j]=0;
            }
        }

        if (colFlag){
            for(int i=0;i<n;i++){
                matrix[i][0]=0;
            }
        }
    }
}