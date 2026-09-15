
class Solution {
    ListNode dummy = new ListNode(0);
    ListNode res = dummy;
    public void createLL(int x){
        res.next = new ListNode(x);
        res = res.next;
    }
    public ListNode removeElements(ListNode head, int val) {
      ListNode temp = head;
      while(temp != null){
        if(temp.val != val){
            createLL(temp.val);
        }
        temp = temp.next;
      }
      return dummy.next;
    }
}