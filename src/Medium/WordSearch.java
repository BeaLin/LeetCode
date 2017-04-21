package Medium;

import java.util.Arrays;

/**
 * Created by lby on 2017/4/21.
 * 79.Word Search
 */
public class WordSearch {
    static  boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        visited=new boolean[n][board[0].length];
        for(int i=0;i<n;i++){
            for(int j=0;j<board[i].length;j++){
                if(exist(board,word,i,j,0))
                    return true;
            }
        }
        return false;
    }
    public boolean exist(char[][] board, String word,int i,int j,int match) {
        if(match==word.length())
            return true;
        if(i<0 || j<0 || i==board.length || j==board[i].length || visited[i][j] || board[i][j]!=word.charAt(match))
            return false;
        visited[i][j]=true;
        if(exist(board,word,i-1,j,match+1) || exist(board,word,i+1,j,match+1)
                || exist(board,word,i,j-1,match+1) || exist(board,word,i,j+1,match+1)) return true;
        visited[i][j]=false;
        return false;
    }

    public static void main(String[] args) {
        char[][] board=new char[][]{{'A','B','C','E'},{'S','F','E','S'},{'A','D','E','E'}};
        System.out.println(new WordSearch().exist(board,"ABCESEEEFS"));
    }
}
