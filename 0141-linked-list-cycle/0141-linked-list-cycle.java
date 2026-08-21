
public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        //  {2,3,-8,7} //7 is connected with -1;
        ListNode temp = head;
        while(temp != null){
            if(set.contains(temp)){
                return true;
            }
            set.add(temp);
            temp = temp.next;
        }
        return false;
    }
}