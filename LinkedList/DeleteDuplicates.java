package LinkedList;

public class DeleteDuplicates {

    public static ListNode deleteDuplicates(ListNode head) {

        ListNode curr = head;
        ListNode prev = null;

        while(curr!=null){

            if(curr.next==null)
                break;

            if(curr.val == curr.next.val){

                while(curr.next!=null && curr.val == curr.next.val){
                    curr = curr.next;
                }

                if(prev == null){
                    head = curr.next;
                    prev = head;
                    //System.out.println("head:"+head.val);
                    // curr = curr.next;
                }

                if(curr.next == null){
                    head = null;
                }

                else{
                    head = prev.next;
                    prev.next = curr.next;
                    curr = prev.next;
                  //  System.out.println("head:"+head.val);
                }

            }

            else{
                prev = curr;
                curr = curr.next;
            }

        }

        return head;
    }

    public static void main(String args[]){
        ListNode l1 = new ListNode(1);
        ListNode l2 = l1.next = new ListNode(1);
        ListNode l3 = l2.next = new ListNode(2);
        ListNode l4 = l3.next = new ListNode(2);
       /* ListNode l5 = l4.next = new ListNode(2);
        ListNode l6 = l5.next = new ListNode(3);
        ListNode l7 = l6.next = new ListNode(4);
        ListNode l8 = l7.next = new ListNode(4);
        ListNode l9 = l8.next = new ListNode(5);
       /* ListNode l10 = l9.next = new ListNode(6);
        ListNode l11 = l10.next = new ListNode(6);

        */


        ListNode result = deleteDuplicates(l1);

        System.out.println("Out:");
       while(result!=null){
           System.out.print(result.val+" ");
           result = result.next;
       }


    }

}
