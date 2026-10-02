//rotate matrix by 90 degrees clockwise
//BRUTE FORCE APPROACH
// public class RotateMatrix {
//     public static int[][] rotate(int[][] matrix){
//         int n=matrix.length;
//         int[][] rotatedMatrix=new int[n][n];
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 rotatedMatrix[j][n-1-i]=matrix[i][j];
//             }
//         }
//         return rotatedMatrix;
//     }

//     public static void main(String[] args) {
//         int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
//         int[][] rotatedMatrix=rotate(matrix);
//         for(int i=0;i<rotatedMatrix.length;i++){
//             for(int j=0;j<rotatedMatrix[0].length;j++){
//                 System.out.print(rotatedMatrix[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }



//optimal approach
public class RotateMatrix{
    public static void rotate(int[][] matrix){
        int n=matrix.length;

        //transpose
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j]; //swap
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }

        }

        //reverse each row
        for(int i=0;i<n;i++){
            int start=0; //two pointer approach
            int end=n-1;
            while(start<end){
                int temp=matrix[i][start];
                matrix[i][start]=matrix[i][end];
                matrix[i][end]=temp;
                start++;
                end--;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix={{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        rotate(matrix);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}