class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Solution {

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        listNode1.next = new ListNode(2);
        listNode1.next.next = new ListNode(3);

        ListNode listNode2 = new ListNode(4);
        listNode2.next = new ListNode(5);
        listNode2.next.next = new ListNode(6);

        for (ListNode n = mergedList(listNode1, listNode2); n != null; n = n.next) System.out.print(n.val + " ");

    }

    public static ListNode mergedList(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode mergedList = new ListNode(0);
        ListNode current = mergedList;

        while (l1 != null && l2 != null) {
            if(l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            }
            else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        current.next = (l1 != null) ? l1 : l2;
        return mergedList.next;
    }
}