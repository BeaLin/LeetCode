package Medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lby on 2017/4/28.
 * 131.Palindrome Partitioning
 */
public class PalindromePartitioning {
    public List<List<String>> partition(String s) {
        List<List<String>> result=new ArrayList<>();
        backTrack(result,new ArrayList<String>(),s,0);
        return result;
    }
    public void backTrack(List<List<String>> result,List<String> curList,String s,int l){
        if(curList.size()>0 && l>=s.length()){
            result.add(new ArrayList<>(curList));
        }
        for(int i=l;i<s.length();i++){
            if(isPalindrome(s,l,i)){
                if(l==i) curList.add(Character.toString(s.charAt(l)));
                else curList.add(s.substring(l,i+1));
                backTrack(result,curList,s,i+1);
                curList.remove(curList.size()-1);
            }

        }
    }
    private boolean isPalindrome(String s,int l,int h){
        if(l==h) return true;
        while(l<h){
            if(s.charAt(l)!=s.charAt(h)) return false;
            l++;
            h--;
        }
        return true;
    }
}
