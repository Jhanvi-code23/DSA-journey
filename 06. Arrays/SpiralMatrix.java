public class SpiralMatrix {
    public static int[][] spiralMatrix(int[][] matrix){
        int n=matrix.length;
        int m=matrix[0].length;
        int[][] result=new int[n][m];

        int top=0;
        int bottom=n-1;
        int left=0;
        int right=m-1;

        int value=1; //value to be filled in the matrix


        while(left<=right && top<=bottom){
            //top row
            for(int i=left;i<=right;i++){
                result[top][i]=value++;
            }
            top++;

            //right column
            for(int i=top;i<=bottom;i++){
                result[i][right]=value++;
            }
            right--;

            //bottom row
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    result[bottom][i]=value++;
                }
                bottom--;
            }

            //left column
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    result[i][left]=value++;
                }
                left++;
            }
        }
        return result;
    }



    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Original Matrix:");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Spiral Matrix:");
        int[][] result=spiralMatrix(matrix);
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[0].length;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}