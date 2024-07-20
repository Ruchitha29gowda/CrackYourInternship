package Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int sr = 0;
        int sc = 0;
        int er = matrix.length-1;
        int ec = matrix[0].length -1;
        List<Integer> ans = new ArrayList<>();

        while(sr<=er && sc<=ec){
            for(int i = sc; i<=ec; i++){
                ans.add(matrix[sr][i]);
            }
            sr++;
            if(sr>er) break;

            for(int i = sr; i<=er; i++){
                ans.add(matrix[i][ec]);
            }
            ec--;

            if(ec<sc) break;

            for(int i = ec; i>=sc; i--){
                ans.add(matrix[er][i]);
            }
            er--;
            if(er<sr) break;

            for(int i = er; i>=sr; i--){
                ans.add(matrix[i][sc]);
            }
            sc++;
        }

        return ans;
    }
}