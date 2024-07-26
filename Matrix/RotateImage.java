package Matrix;

public class RotateImage {
    
}

class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0; i<(matrix.length)/2; i++){
            helper(i,matrix,matrix.length - (2*i));
        }

    }

    public void helper(int indx, int[][] matrix, int len){
        System.out.println("called");
        for(int i=0; i<len-1; i++){
            // len = len - 2*i;
            helperUtil(matrix, indx, len);
        }
    }

    public void helperUtil(int[][] matrix, int indx, int len){
        // len = len - 2*indx;
        int sr=indx;
        int sc=indx;
        int er = sr+ len -1;
        int ec = sc+ len -1;

        // System.out.println(sr+" , "+sc+" , "+er+ " , "+ec);

        int prev = matrix[sr+1][sc];
        int temp = matrix[sr][sc];

        for(int i=sc; i<=ec; i++){
            matrix[sr][i] = prev;
            prev = temp;
            if(i<ec){
                temp = matrix[sr][i+1];
            }
        }
        sr+=1;
        temp = matrix[sr][ec];
        for(int i=sr; i<=er; i++){
            matrix[i][ec] = prev;
            prev = temp;

            if(i<er){
                temp = matrix[i+1][ec];
            }
        }
        ec-=1;
        temp = matrix[er][ec];

        for(int i=ec; i>=sc; i--){
            matrix[er][i] = prev;
            prev = temp;

            if(i>sc){
                temp = matrix[er][i-1];
            }
        }
        er-=1;
        temp = matrix[er][sc];
        for(int i=er; i>=sr; i--){
            matrix[i][sc] = prev;
            prev = temp;

            if(i>sr){
                temp = matrix[i-1][sc];
            }
        }
        
        // printMat(matrix);
        // System.out.println();


    }

    // public void printMat(int[][] mat){
    //     for(int i=0; i<mat.length; i++){
    //         for(int j=0; j<mat.length; j++){
    //             System.out.print(mat[i][j]+" ");
    //         }
    //         System.out.println();
    //     }
    // }
}