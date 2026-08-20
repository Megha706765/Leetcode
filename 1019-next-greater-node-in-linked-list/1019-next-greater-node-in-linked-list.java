class Solution {
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        int[] ans = new int[list.size()];
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<list.size(); i++){
            while(!stack.isEmpty()  && list.get(i) > list.get(stack.peek())){
                int index = stack.pop();
                ans[index] = list.get(i);
            }
            stack.push(i);
        }
        return ans;
    }
}