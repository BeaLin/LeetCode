package Hard;

import java.util.*;

/**
 * Created by lby on 2017/4/14.
 * 57.Insert Interval
 */
class Interval {
         int start;
         int end;
         Interval() { start = 0; end = 0; }
         Interval(int s, int e) { start = s; end = e; }
}
public class InsertInterval {

    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> result=new ArrayList<>();
        if(intervals.size()==0){
            result.add(newInterval);
            return result;
        }
        if(newInterval==null) return intervals;
        intervals.add(newInterval);
        intervals.sort(new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start-o2.start;
            }
        });
        int start=intervals.get(0).start;
        int end=intervals.get(0).end;
        for(Interval interval:intervals){
            if(interval.start<=end) end= Math.max(end,interval.end);
            else {
                Interval in=new Interval(start,end);
                result.add(in);
                start=interval.start;
                end=interval.end;
            }
        }
        result.add(new Interval(start,end));
        return result;
    }

    public static void main(String[] args) {
        InsertInterval ii=new InsertInterval();
        List<Interval> intervals=new ArrayList<>();
        intervals.add(new Interval(1,3));
        intervals.add(new Interval(6,9));
//        intervals.add(new Interval(6,7));
//        intervals.add(new Interval(8,10));
//        intervals.add(new Interval(12,16));
        Interval newInterval=new Interval(2,5);
        List<Interval> result=ii.insert(intervals,newInterval);
        for(Interval r:result){
            System.out.println(r.start+" "+r.end);
        }
    }
}
