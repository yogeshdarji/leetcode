package LinkedList;

public class MergeSortedList {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                curr.next = l1;
                l1 = l1.next;
            }

            else if(l2.val<l1.val){
                curr.next = l2;
                l2 = l2.next;
            }

            else{
                curr.next = l1;
//                curr.next.next = l2;
                //curr = curr.next;
                l1 = l1.next;
                l2 = l2.next;
            }

            curr = curr.next;
        }

        if(l1!=null){
            curr.next = l1;
            l1 = l1.next;
        }

        if(l2!=null){
            curr.next = l2;
            l2 = l2.next;
        }

        return dummy.next;
    }

    public static void main(String args[]){
        ListNode l1 = new ListNode(1);
        ListNode l2 = l1.next = new ListNode(2);
        ListNode l3 = l2.next = new ListNode(4);

        ListNode l4 = new ListNode(1);
        ListNode l5 = l4.next = new ListNode(3);
        ListNode l6 = l5.next = new ListNode(4);

        ListNode head = mergeTwoLists(l1,l4);
        while(head!=null){
            System.out.print(head.val+"->");
            head = head.next;
        }



    }
}
