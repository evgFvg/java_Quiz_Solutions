class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val + "}";
    }
}

public class Solution {

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        node6.next = null;

        head1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        ListNode head2 = new ListNode(10);
        ListNode sll2 = new ListNode(20);
        ListNode sll3 = new ListNode(30);

        head2.next = sll2;
        sll2.next = sll3;
        sll3.next = node3;

        Solution s = new Solution();
        ListNode res = s.getIntersectionNode(head1, head2);

        s.disconnectSLL(head1, res);

        printSLL(head1);
        printSLL(head2);
    }

    private static void printSLL(ListNode head) {
        while(head != null) {
            System.out.println(head);
            head = head.next;
        }
        System.out.println("*********************************************");
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode runner1 = headA;
        ListNode runner2 = headB;

        while (runner1 != runner2) {
            runner1 = null == runner1 ? headB : runner1.next;
            runner2 = null == runner2 ? headA : runner2.next;
        }

        return runner1;
    }

    public void disconnectSLL(ListNode head, ListNode intersection) {
        if(intersection == null || head == null) {
            return;
        }
        ListNode runner = head;
        while(runner.next != intersection) {
            runner = runner.next;
        }
        runner.next = null;
    }
}




