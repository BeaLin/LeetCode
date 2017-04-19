package Medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Stack;

/**
 * Created by lby on 2017/4/19.
 */
public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        parenthesisStr(list,"",0,0,n);
        return list;
    }
    public void parenthesisStr(List<String> list,String str,int open,int close,int max){
        if(str.length()==max*2){
            list.add(str);
            return;
        }
        if(open<max) parenthesisStr(list,str+"(",open+1,close,max);
        if(close<open) parenthesisStr(list,str+")",open,close+1,max);
    }
}
