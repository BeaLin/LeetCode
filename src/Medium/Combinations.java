package Medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lby on 2017/4/21.
 * 77.Combinations
 */
public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        if(n<k) return new ArrayList<List<Integer>>();
        List<List<Integer>> result=new ArrayList<>();
        combine(result,new ArrayList<Integer>(),1,k,n);
        return result;
    }
    public void combine(List<List<Integer>> result,List<Integer> temp,int start,int k,int n){
        if(temp.size()==k){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start;i<=n;i++){
            temp.add(i);
            combine(result,temp,i+1,k,n);
            temp.remove(temp.size()-1);
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> result=new Combinations().combine(4,2);
        for(List<Integer> re:result){
            for(Integer r:re)
                System.out.print(r+" ");
            System.out.println();
        }
    }
}
