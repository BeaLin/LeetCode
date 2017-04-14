package Easy;

import java.util.Stack;

/**
 * Created by lby on 2017/4/13.
 * 20.Valid Parenthese
 */
public class ValidParentheses {
    public boolean isValid(String s){
        Stack<Character> parentheses=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='[' ||ch=='{')
                parentheses.add(ch);
            else{
                if(ch==')'){
                    if(!isPop(parentheses,'(')) return false;
                }else if(ch==']'){
                    if(!isPop(parentheses,'[')) return false;
                }else if(ch=='}'){
                    if(!isPop(parentheses,'{')) return false;
                }
            }
        }
        if(parentheses.size()==0)
            return true;
        return false;
    }
    public boolean isPop(Stack<Character> parentheses,char ch){
        if(parentheses.size()!=0 && parentheses.peek()==ch){
            parentheses.pop();
            return true;
        }else return false;
    }

    public static void main(String[] args) {
        String s="({)}";
        ValidParentheses vp=new ValidParentheses();
        System.out.println(vp.isValid(s));
    }
}
