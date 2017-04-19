package Medium;

import java.util.List;

/**
 * Created by lby on 2017/4/19.
 * 24.Swap Nodes In Pairs
 */

public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode result=new ListNode(0);
        result.next=head;
        ListNode cur=result;
        while(cur.next!=null && cur.next.next!=null){
            ListNode temp1=cur.next;
            ListNode temp2=cur.next.next;
            cur.next=temp2;
            temp1.next=temp2.next;
            temp2.next=temp1;
            cur=cur.next.next;
        }
        return result.next;
    }
    //使用递归
    public ListNode swapPairsRecursion(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode result=head.next;
        head.next=swapPairs(head.next.next);
        result.next=head;
        return result;
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        long startTime=System.currentTimeMillis();
        ListNode result=new SwapNodesInPairs().swapPairsRecursion(head);
        long endTime=System.currentTimeMillis();
        while(result!=null){
            System.out.println(result.val);
            result=result.next;
        }
        System.out.println(endTime-startTime);

    }
}
