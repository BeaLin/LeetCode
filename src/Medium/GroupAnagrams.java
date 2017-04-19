package Medium;

import java.util.*;

/**
 * Created by lby on 2017/4/19.
 * 49.Group Anagrams
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0 || strs==null) return new ArrayList<List<String>>();
        HashMap<String,List<String>> map=new HashMap<>();
        for(String s:strs){
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String temp=String.valueOf(ch);
            if(!map.containsKey(temp)){ map.put(temp,new ArrayList<String>());}
            map.get(temp).add(s);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
