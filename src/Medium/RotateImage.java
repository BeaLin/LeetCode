package Medium;

/**
 * Created by lby on 2017/5/3.
 * 48.Rotate Image
 */
public class RotateImage {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++)
                swap(matrix,i,j,j,i);
        }
        int i=0;
        int j=n-1;
        while(i<j){
            for(int k=0;k<n;k++)
                swap(matrix,k,i,k,j);
            i++;
            j--;
        }
    }
    private void swap(int[][] matrix,int i1,int j1,int i2,int j2){
        int temp=matrix[i1][j1];
        matrix[i1][j1]=matrix[i2][j2];
        matrix[i2][j2]=temp;
    }
}
