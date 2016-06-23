 public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      ListNode tNode = new ListNode(0);
        int v1=0;
        int v2=0;
        int i=0;
        ListNode temp=l1;
        while(null!=temp){
            v1=(int)(Math.pow(10,i))*temp.val+v1;
            i++;
            temp=temp.next;
        }
        i=0;
        temp=l2;
        while(null!=temp){
            v2=(int)(Math.pow(10,i))*temp.val+v2;
            i++;
            temp=temp.next;
        }
        int total=v1+v2;
        temp=tNode;
        if (total==0){
            tNode.val=0;
            tNode.next=null;
            return tNode;
        }
        while(total>0){
            temp.val=total%10;
            total=total/10;
            if(total<=0){
                temp.next=null;
                break;
            }
            temp.next = new ListNode(0);
            temp=temp.next;

        }
        return tNode;

    }
   }
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }