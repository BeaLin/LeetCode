package Medium;

/**
 * Created by lby on 2017/5/2.
 * 19.Remove Nth Node From End of List
 */

public class RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start=new ListNode(0);
        start.next=head;
        ListNode fast=start;
        while(n>0 && fast!=null){
            fast=fast.next;
            n--;
        }
        ListNode slow=start;
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return start.next;
    }
}
