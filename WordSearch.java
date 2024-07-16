class WordSearch {
    public boolean exist(char[][] board, String word) {
        boolean[][] vis = new boolean[board.length][board[0].length];
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(board[i][j] == word.charAt(0)){
                    vis[i][j] = true;
                    if(helper(board, vis, word, ""+word.charAt(0), i, j)) return true;
                    vis[i][j] = false;
                }
            }
        }
        
        return false;
    }

    public boolean helper(char[][] board, boolean[][] vis, String word, String ans, int row, int col){
        if(word.length()==ans.length()){
            if(word.compareTo(ans)==0){
                System.out.println(ans);
                return true;
            }
            else return false;
        }

        //right
        if(col<board[0].length-1 && !vis[row][col+1]){
            if(board[row][col+1] == word.charAt(ans.length())){
            vis[row][col+1] = true;
            if(helper(board, vis, word , ans+word.charAt(ans.length()), row , col+1)) return true;
            vis[row][col+1] = false;
            }
        }

        //down
        if(row<board.length-1 && !vis[row+1][col] ){
            if(board[row+1][col] == word.charAt(ans.length())){
                vis[row + 1][col] = true;
                if(helper(board, vis, word , ans+word.charAt(ans.length()), row+1, col)) return true;
                vis[row + 1][col] = false;
            }
        }

        //left
        if(col>0 && !vis[row][col-1] ){
            if(board[row][col-1] == word.charAt(ans.length())){
                vis[row][col-1]= true;
                if(helper(board, vis, word , ans+word.charAt(ans.length()), row, col-1)) return true;
                vis[row][col-1] = false;
            }
        }

        //up
        if(row>0 && !vis[row-1][col]){
            if(board[row-1][col] == word.charAt(ans.length())){
                vis[row-1][col]= true;
                if(helper(board, vis, word , ans+word.charAt(ans.length()), row-1, col)) return true;
                vis[row-1][col] = false;
            }
        }

        return false;
        
    }
}