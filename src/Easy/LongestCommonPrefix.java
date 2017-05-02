package Easy;

/**
 * Created by lby on 2017/5/2.
 * 14.Longest Common Prefix
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0) return "";
        String commen=strs[0];
        for(int i=1;i<strs.length;i++ ){
            while(strs[i].indexOf(commen)!=0)
                commen=commen.substring(0,commen.length()-1);
        }
        return commen;
    }

    public static void main(String[] args) {
        String[] strs=new String[]{"abcdef", "abcd", "abcde"};
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(strs));
    }
}
