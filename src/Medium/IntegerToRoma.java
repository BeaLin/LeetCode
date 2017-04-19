package Medium;

/**
 * Created by lby on 2017/4/19.
 * 12.Integer To Roma
 */
public class IntegerToRoma {
    public String intToRoman(int num) {
        int[] values=new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romaStr=new String[]{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder roma=new StringBuilder();
        for(int i=0;i<values.length;i++){
            while(num>=values[i]){
                num-=values[i];
                roma.append(romaStr[i]);
            }
        }
        return roma.toString();
    }

    public static void main(String[] args) {
        System.out.println(new IntegerToRoma().intToRoman(3999));
    }
}
