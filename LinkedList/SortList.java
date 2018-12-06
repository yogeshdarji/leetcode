package LinkedList;

import java.util.List;

public class SortList {

    public static ListNode sortList(ListNode head){
        if(head == null || head.next == null)
            return head;

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;

        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);

        return merge(l1,l2);
    }

    private static ListNode merge(ListNode l1, ListNode l2){
        ListNode p = new ListNode(0);
        ListNode res = p;

        while(l1!=null && l2!=null){
            if(l1.val < l2.val){
                p.next = l1;
                l1 = l1.next;
            }

            else {
                p.next = l2;
                l2 = l2.next;
            }

            p = p.next;
        }

        if(l1!=null)
            p.next = l1;

        if(l2!=null)
            p.next = l2;

        return res.next;
    }

    public static void main(String args[]){

        ListNode l1 = new ListNode(4);
        ListNode l2 = l1.next = new ListNode(2);
        ListNode l3 = l2.next = new ListNode(1);
        ListNode l4 = l3.next = new ListNode(3);

        ListNode res = sortList(l1);
        while(res!=null){
            System.out.print(res.val+"->");
            res = res.next;
        }
    }
}
