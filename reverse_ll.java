
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class reverse_ll {

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode temp = head;

        while (temp != null) {
            ListNode temp1 = temp.next;
            temp.next = prev;
            prev = temp;
            temp = temp1;
        }

        return prev;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        ListNode result = reverseList(head);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}