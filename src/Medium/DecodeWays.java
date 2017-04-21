package Medium;

/**
 * Created by lby on 2017/4/21.
 * 91.Decode Ways
 */
public class DecodeWays {
    public int numDecodings(String s) {
        int n=s.length();
        if(n==0) return 0;
        int[] num=new int[n+1];
        num[n]=1;
        num[n-1]=s.charAt(n-1)=='0'?0:1;
        for(int i=n-2;i>=0;i--){
            if(s.charAt(i)=='0') continue;
            num[i]=(Integer.parseInt(s.substring(i,i+2))>26?num[i+1]:num[i+1]+num[i+2]);
        }
        return num[0];
    }
}
