package Medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Created by lby on 2017/4/17.
 * 73.Set Matrix Zeroes
 */
public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        HashMap<Integer,Integer> row= new HashMap<>();
        HashMap<Integer,Integer> col= new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)
                if(matrix[i][j]==0){
                    row.put(i,0);
                    col.put(j,0);
                }
        }
        for(Map.Entry<Integer,Integer> r:row.entrySet()){
            int value=r.getKey();
            for(int j=0;j<m;j++)
                matrix[value][j]=0;
        }
        for(Map.Entry<Integer,Integer> c:col.entrySet()){
            int value=c.getKey();
            for(int i=0;i<n;i++)
                matrix[i][value]=0;
        }
    }
}
