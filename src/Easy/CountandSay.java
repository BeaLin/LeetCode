package Easy;

/**
 * Created by lby on 2017/5/3.
 * 38.Count and Say
 */
public class CountandSay {
    public String countAndSay(int n) {
        StringBuilder cur=new StringBuilder("1");
        for(int i=1;i<n;i++){
            StringBuilder prev=new StringBuilder();
            char ch=cur.charAt(0);
            int count=1;
            for(int j=1;j<cur.length();j++){
                if(cur.charAt(j)!=ch){
                    prev.append(count).append(ch);
                    ch=cur.charAt(j);
                    count=1;
                }
                else count++;
            }
            prev.append(count).append(ch);
            cur=prev;
        }
        return cur.toString();
    }

    public static void main(String[] args) {
        System.out.println(new CountandSay().countAndSay(5));
    }
}
