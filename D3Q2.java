class MyLinkedList {
    int size;
    ListNode head;
    public MyLinkedList() {
        this.size=0;
        this.head=new ListNode(0);
    }
    
    public int get(int index) {
      if (index < 0 || index >= size) {
            return -1;
        }
        ListNode current = head;
        for (int i = 0; i <= index; i++) {
            current = current.next;
        }
        return current.val;

    }
    
    public void addAtHead(int val) {
        addAtIndex(0,val);
    }
    
    public void addAtTail(int val) {
        addAtIndex(size,val);
    }
    
    public void addAtIndex(int index, int val) {
        if(index>size){
            return;
        }
        size++;
        ListNode pred=head;
        for (int i=0;i<index;i++){
            pred=pred.next;
        }
        ListNode toAdd=new ListNode(val);
        toAdd.next = pred.next;
        pred.next=toAdd;

    }
    
    public void deleteAtIndex(int index) {
        if(index<0 || index>=size){
            return;
        }
        size--;
        ListNode pred=head;
        for(int i=0;i<index;i++){
            pred=pred.next;
        }
        pred.next=pred.next.next;

    }
}
class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}

