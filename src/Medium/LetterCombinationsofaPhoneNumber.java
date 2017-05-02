package Medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lby on 2017/5/2.
 * 17.Letter Combinations of a Phone Number
 */
public class LetterCombinationsofaPhoneNumber {
    public List<String> letterCombinations(String digits) {
        if(digits==null || digits.equals("")) return new ArrayList<>();
        List<String> result=new ArrayList<>();
        String[] mapping=new String[]{"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        letterCombinations(digits,result, "",0,mapping);
        return result;
    }
    private void letterCombinations(String digits,List<String> result,String temp,int i,String[] mapping) {
        if(temp.length()==digits.length()){
            result.add(new String(temp));
            return;
        }
        int digit=Integer.parseInt(digits.charAt(i)+"");
        for(int j=0;j<mapping[digit].length();j++){
            temp=temp+mapping[digit].charAt(j);
            letterCombinations(digits,result,temp,i+1,mapping);
            temp=temp.substring(0,temp.length()-1);
        }
    }

    public static void main(String[] args) {
        List<String> result=new LetterCombinationsofaPhoneNumber().letterCombinations("23");
        for(String r:result)
            System.out.println(r);
    }
}
