package com.algorithm.Prepare;

/**
 * Created by AlexJIANG on 3/12/16.
 */
public class MergeLists {
    public ListNode mergeKLists(ListNode[] lists) {
        merge(lists,0,lists.length-1);
        for(int i=0; i<lists.length-1; i++){
            System.out.println("length index"+":"+i);
            lists[i].next=lists[i+1];
        }
        printList(lists[0]);
        return lists[0];
    }
    public void merge(ListNode[] lists,int p, int r){
        System.out.println("->layer here");
        if(r-p>1) {
            System.out.println(p + "---" + r);
            int q = (p + r) / 2;
            System.out.println("pub" + p + ":" + q );
            merge(lists, p, q);
            merge(lists, q + 1, r);
        }
            ListNode head1=lists[p];
            ListNode head2=lists[r];
            ListNode list= new ListNode(0);
            ListNode head3= list;
            while(lists[p]!=null&&lists[r]!=null){
                if(lists[p].val<lists[r].val){
                    list.val=lists[p].val;
                    list=list.next;
                }else{
                    list.val=lists[r].val;
                    list=list.next;
                }
            }
            while(lists[p]!=null){
                list.val=lists[p].val;
                list=list.next;
            }
            while(lists[r]!=null){
                list.val=lists[r].val;
                list=list.next;
            }
            ListNode temp = head1;
            while(temp!=null){
                temp.val=head3.val;
                temp=temp.next;
                head3=head3.next;
            }
            temp = head2;
            while(temp!=null){
                temp.val=head3.val;
                temp=temp.next;
                head3= head3.next;
            }

    }
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public void printList(ListNode list){
        while(list!=null){
            System.out.print(list.val + "->");
            list=list.next;
        }
    }

    public static void main(String args[]){
        ListNode[] lists=new ListNode[5];

        ListNode temp;
        for(int i=0,gap=0;i<5;i++,gap+=10){
            int m=gap;
            temp=lists[i];
            for(int j=0;j<10;j++){
                lists[i].val = m;
                System.out.println("print->"+lists[i].val);
                m++;
                temp = temp.next;
            }
        }
        System.out.println("here");
        System.out.println(head);
        MergeLists ml=new MergeLists();
        ListNode testHead;
        for(int i=0;i<5;i++){
            testHead= lists[i];
            while(testHead!=null){
                System.out.println("print->in::"+testHead.val);
                testHead=testHead.next;
            }
        }
        ml.mergeKLists(lists);



    }
}

