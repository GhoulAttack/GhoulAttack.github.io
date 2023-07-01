class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode newHead=head.next;
        ListNode temp=swapPairs(newHead.next);
        head.next=temp;
        newHead.next=head;
        return newHead;
    }
}
