class SetMatrixZero {
    public void setZeroes(int[][] matrix) {
        int[][] vis = new int[matrix.length][matrix[0].length];

        for(int i=0 ; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==0){
                    vis[i][j] = 1;
                }
            }
        }

        for(int i=0 ; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(vis[i][j]==1){
                    setZeros( i, j, matrix);
                }
            }
        }

        
    }

    public void setZeros(int row, int col, int[][] matrix){

        //set all val in row = 0
        for(int i=0; i<matrix.length; i++){
            matrix[i][col] = 0;
        }

        for(int i=0; i<matrix[0].length; i++){
            matrix[row][i]=0;
        }
    }
}