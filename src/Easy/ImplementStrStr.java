package Easy;

/**
 * Created by lby on 2017/4/13.
 */
public class ImplementStrStr {
    public int strStr(String haystack, String needle) {
        for(int i=0;;i++){
            for(int j=0;;j++){
                if(j==needle.length()) return i;
                if((i+j)==haystack.length()) return -1;
                if(haystack.charAt(i+j)!=needle.charAt(j)) break;
            }
        }
    }

    public static void main(String[] args) {
        ImplementStrStr iss=new ImplementStrStr();
        String haystack="abccecdekl";
        String needle="kkk";
        System.out.println(iss.strStr(haystack,needle));
    }
}
