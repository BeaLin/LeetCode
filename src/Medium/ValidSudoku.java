package Medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by lby on 2017/5/2.
 */
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            Set<Character> rows=new HashSet<>();
            Set<Character> cols=new HashSet<>();
            Set<Character> cubes=new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[i][j]!='.' && !rows.add(board[i][j])) return false;
                if(board[j][i]!='.' && !cols.add(board[j][i])) return false;
                int rowIndex = 3*(i/3);
                int colIndex = 3*(i%3);
                if(board[rowIndex+j/3][colIndex+j%3]!='.' && !cubes.add(board[rowIndex+j/3][colIndex+j%3])) return false;
            }
        }
        return true;
    }
}
