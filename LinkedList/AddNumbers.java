package LinkedList;

public class AddNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        int sum = 0;

        if(l1==null && l2==null)
            return null;

        if(l1==null)
            return l2;

        if(l2 == null)
            return l1;

        ListNode result = new ListNode(-1);
        // ListNode result  = new ListNode((l1.val+l2.val)%10);
        // carry = (l1.val+l2.val)>=10?1:0;
        ListNode dummy = result;
//              if(l1!=null)
//             l1 = l1.next;

//             if(l2!=null)
//             l2 = l2.next;

        while(l1!=null || l2!=null){
            sum = ((l1!=null)?l1.val:0) + ((l2!=null)?l2.val:0) + carry;
            carry = carry + ((l1!=null)?l1.val:0) + ((l2!=null)?l2.val:0) >=10?1:0;
            result.next = new ListNode(sum%10);

            if(l1!=null)
                l1 = l1.next;

            if(l2!=null)
                l2 = l2.next;

            result = result.next;
        }

        if(carry>0){
            result.next = new ListNode(carry);
        }

        return dummy.next;
    }

    public static void main(String args[]){
        ListNode l1 = new ListNode(1);
//         l1.next = new ListNode(4);
//         l1.next.next = new ListNode(6);

        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);
//        l2.next.next = new ListNode(4);

        ListNode result = addTwoNumbers(l1, l2);

        while(result!=null){
            System.out.print(result.val+"->");
            result = result.next;
        }
    }

}
