package Easy;

/**
 * Created by lby on 2017/4/13.
 */
class ListNode{
    int val;
    ListNode next;
    ListNode(int x){val=x;}
}
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode result=new ListNode(l1.val>=l2.val?l1.val:l2.val);
        ListNode p1=l1;
        ListNode p2=l2;
        if(l1.val<=l2.val)
            p1=p1.next;
        else p2=p2.next;
        ListNode head=result;
        while(p1!=null && p2!=null){
            ListNode cur;
            if(p1.val<=p2.val){
                cur=new ListNode(p1.val);
                p1=p1.next;
            }else{
                cur=new ListNode(p2.val);
                p2=p2.next;
            }
            head.next=cur;
            head=head.next;
        }
        if(p1==null)
            head.next=p2;
        if(p2==null)
            head.next=p1;
        return result;
    }
}
