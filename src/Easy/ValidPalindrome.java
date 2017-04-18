package Easy;

/**
 * Created by lby on 2017/4/17.
 * 125.Valid Palindrome
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if(s==null)
            return true;
        s=s.toLowerCase().replace(" ","");
        int i=0;
        int j=s.length()-1;
        while (i<j){
            if(!isLetter(s.charAt(i))) i++;
            else if(!isLetter(s.charAt(j))) j--;
            else {
                if(s.charAt(i) != s.charAt(j))
                    return false;
                else { i++;j--;}
            }
        }
        return true;
    }
    boolean isLetter(char c){
        if(c >='a' && c <='z')
            return true;
        if(c >='0' && c <='9')
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new ValidPalindrome().isPalindrome(".,"));
    }
}
