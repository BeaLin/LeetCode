package Easy;

/**
 * Created by lby on 2017/4/19.
 * 67.Add Binary
 */
public class AddBinary {
    public String addBinary(String a, String b) {
        int i=a.length()-1;
        int j=b.length()-1;
        int addition=0;
        StringBuilder result=new StringBuilder();
        while(i>=0 || j>=0 || addition!=0){
            int sum=(i<0?0:a.charAt(i)-'0')+(j<0?0:b.charAt(j)-'0')+addition;
            result.append(""+sum%2);
            addition=sum/2;
            if(i>=0) i--;
            if(j>=0) j--;
        }
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(new AddBinary().addBinary("11","1"));
    }
}
