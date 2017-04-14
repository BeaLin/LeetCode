package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by lby on 2017/4/13.
 */
class Interval{
    int start;
    int end;
    Interval(){start=0;  end=0;}
    Interval(int s,int e){  start=s;  end=e;  }
}
public class MergeIntervals {
    public List<Interval> merge(List<Interval> intervals) {
        if(intervals.size()<=1)
            return intervals;
        intervals.sort(new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return Integer.compare(o1.start,o2.start);
            }
        });
        List<Interval> result=new ArrayList<>();
        int start=intervals.get(0).start;
        int end = intervals.get(0).end;
        for(Interval in:intervals){
            if(in.start<=end) end=Math.max(end,in.end);
            else{
                result.add(new Interval(start,end));
                start=in.start;
                end=in.end;
            }
        }
        result.add(new Interval(start,end));
        return result;
    }

    public static void main(String[] args) {
        MergeIntervals mi=new MergeIntervals();
        List<Interval> intervals=new ArrayList<>();
        intervals.add(new Interval(1,3));
        intervals.add(new Interval(8,10));
        intervals.add(new Interval(2,6));
        intervals.add(new Interval(15,18));
        List<Interval> result=mi.merge(intervals);
        for(Interval r:result){
            System.out.println(r.start+" "+r.end);
        }
    }
}
