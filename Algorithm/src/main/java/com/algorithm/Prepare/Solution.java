package com.algorithm.Prepare;

import java.util.List;

/**
 * Created by AlexJIANG on 2/5/16.
 */
public class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
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
            if(total==0){
                break;
            }
            temp.next = new ListNode(0);
            temp=temp.next;


        }
        return tNode;

    }
    public static void main(String args[]){
        ListNode l1=new ListNode(0);
        l1.next=new ListNode(1);
        l1.next.next=new ListNode(2);
        l1.next.next.next=null;
        ListNode l2=new ListNode(0);
        l2.next=new ListNode(1);
        l2.next.next=new ListNode(2);
        l2.next.next.next=null;
      //  System.out.println(addTwoNumbers(l1, l2).val);
//        System.out.println(addTwoNumbers(l1,l2).next.val);
//        System.out.println(addTwoNumbers(l1,l2).next.next.val);
        ListNode temp=addTwoNumbers(l1,l2);
        while(temp!=null){
            System.out.println(temp);
            System.out.println(temp.val);
            temp=temp.next;
        }

    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}


