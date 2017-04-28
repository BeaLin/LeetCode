package Medium;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by lby on 2017/4/28.
 * 3.Longest Substring Without Repeating Characters
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        int lengthResult=0;
        HashMap<Character,Integer> a=new HashMap<>();
        for(int i=0,j=0;i<s.length();++i){
            if(a.containsKey(s.charAt(i))){
                j=Math.max(j,a.get(s.charAt(i))+1);
            }
            a.put(s.charAt(i),i);
            lengthResult=Math.max(lengthResult,i-j+1);
        }
        return lengthResult;
    }

    public static void main(String[] args) {
        System.out.println(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("pwwkew"));
    }
}
