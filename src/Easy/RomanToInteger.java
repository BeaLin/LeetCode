package Easy;

/**
 * Created by lby on 2017/4/19.
 * 13.RomanToInteger
 */
public class RomanToInteger {
    public int romanToInt(String s) {
        int length=s.length();
        int[] nums=new int[length];
        for(int i=0;i<length;i++){
            char ch=s.charAt(i);
            switch (ch){
                case 'I':nums[i]=1;break;
                case 'V':nums[i]=5;break;
                case 'X':nums[i]=10;break;
                case 'L':nums[i]=50;break;
                case 'C':nums[i]=100;break;
                case 'D':nums[i]=500;break;
                case 'M':nums[i]=1000;break;
                default:break;
            }
        }
        int sum=0;
        for(int i=0;i<length-1;i++){
            if(nums[i]<nums[i+1])
                sum-=nums[i];
            else sum+=nums[i];
        }
        return sum+nums[length-1];
    }

    public static void main(String[] args) {
        System.out.println(new RomanToInteger().romanToInt("VI"));
    }
}
