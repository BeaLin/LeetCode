package Medium;

/**
 * Created by lby on 2017/4/18.
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class AddTwoNumbers {
    //243:2->4->3;12:1->2;sum:255:2->5->5
    public ListNode addTwoForwardNumbers(ListNode l1, ListNode l2) {
        ListNode p1=l1;
        ListNode p2=l2;
        int length1=0;
        int length2=0;
        while(p1!=null){
            length1++;
            p1=p1.next;
        }
        while (p2!=null){
            length2++;
            p2=p2.next;
        }
        int count=Math.abs(length1-length2);
        if(length1>length2){
            l2=addZero(l2,count-1);
        }else if(length2>length1){
            l1=addZero(l1,count-1);
        }
        p1=l1;
        p2=l2;
        int addition=0;
        ListNode result;
        ListNode resultTemp;
        int sum0=l1.val+l2.val;
        if(sum0<10){
            result=new ListNode(sum0);
            resultTemp=result;
        }
        else {
            result=new ListNode(1);
            result.next=new ListNode(sum0%10);
            resultTemp=result.next;
        }
        p1=p1.next;
        p2=p2.next;
        while(p1!=null){
            int sum=p1.val+p2.val+addition;
            if(sum<10){
                resultTemp.next=new ListNode(sum);
            }else{
                resultTemp.val+=1;
                resultTemp.next=new ListNode(sum%10);
            }
            resultTemp=resultTemp.next;
            p1=p1.next;
            p2=p2.next;
        }
        return result;


    }
    public ListNode addZero(ListNode listNode,int count){
        ListNode temp=new ListNode(0);
        ListNode curr=temp;
        while (count>0){
            curr.next=new ListNode(0);
            curr=curr.next;
        }
        curr.next=listNode;
        return temp;
    }
    //反向存储比上部分难一点
    //342:2->4->3;465:4->6->5;sum:807:7->0->8
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int addition=0;
        ListNode temp=new ListNode(0);
        ListNode result=temp;
        while(l1!=null || l2!=null || addition!=0){
            int sum=(l1==null?0:l1.val)+(l2==null?0:l2.val)+addition;
            ListNode cur=new ListNode(sum % 10);
            addition = sum/10;
            temp.next=cur;
            temp=temp.next;
            l1=(l1==null)?l1:l1.next;
            l2=(l2==null)?l2:l2.next;
        }
        return result.next;
    }
    public static void main(String[] args) {
        ListNode l1=new ListNode(2);
        l1.next=new ListNode(4);
        l1.next.next=new ListNode(3);
        ListNode l2=new ListNode(5);
        l2.next=new ListNode(6);
        l2.next.next=new ListNode(4);
        ListNode result=new AddTwoNumbers().addTwoNumbers(l1,l2);
        while(result!=null){
            System.out.println(result.val+" ");
            result=result.next;
        }
    }
}
