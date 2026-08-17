class Solution {

    ListNode dummy = new ListNode(0);
    ListNode res = dummy;

    public void createNewLL(int x) {
        res.next = new ListNode(x);
        res = res.next;
    }
    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return null;
        }
        // Odd positions
        ListNode temp = head;
        while (temp != null) {
            createNewLL(temp.val);
            if (temp.next == null) {
                break;
            }
            temp = temp.next.next;
        }

        // Even positions
        temp = head.next;

        while (temp != null) {
            createNewLL(temp.val);

            if (temp.next == null) {
                break;
            }

            temp = temp.next.next;
        }

        return dummy.next;
    }
}