package Hard;

/**
 * Created by lby on 2017/4/19.
 * 23.Merge K Sorted Lists
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        return partition(lists,0,lists.length-1);
    }
    public ListNode partition(ListNode[] lists,int low,int high){
        if(low==high) return lists[low];
        if(low<high){
            int p=(low+high)/2;
            ListNode l1=partition(lists,low,p);
            ListNode l2=partition(lists,p+1,high);
            return mergeTwoLists(l1,l2);
        }else return null;
    }
    public ListNode mergeTwoLists(ListNode list1,ListNode list2){
        if(list1==null) return list2;
        if(list2==null) return list1;
        if(list1.val<list2.val){
            list1.next=mergeTwoLists(list1.next,list2);
            return list1;
        }else {
            list2.next=mergeTwoLists(list1,list2.next);
            return list2;
        }
    }
}
