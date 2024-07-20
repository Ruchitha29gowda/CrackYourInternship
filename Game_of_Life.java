public class Game_of_Life {
    
}

class Solution {
    public void gameOfLife(int[][] board) {
        int[][] nextGen = new int[board.length][board[0].length];
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j]==1){
                    if(sum(board, i, j)==2 || sum(board, i, j)==3){
                        nextGen[i][j]=1;
                    }
                }
                else{
                    if(sum(board, i, j)==3){
                        nextGen[i][j] = 1;
                    }
                }
            }
        }

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                board[i][j]=nextGen[i][j];
            }
        }

    }

    public int sum(int[][] board, int row, int col){
        int count =0;
        int sr = row -1;
        int er = row +1;
        int sc = col -1;
        int ec = col +1;

        if(sr<0)sr =0;
        if(er>=board.length)er =board.length-1;
        if(sc<0)sc=0;
        if(ec>=board[0].length)ec=board[0].length-1;

        for(int i=sr; i<=er; i++){
            for(int j=sc; j<=ec; j++){
                if(board[i][j]==1) count+=1;
            }
        }

        return count - board[row][col];
    }
}