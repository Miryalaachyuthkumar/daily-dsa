class MyLinkedList {
    class Node
    {
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;
        }

    }
  Node head;
  int size;
    public MyLinkedList() {
        head = null;
        size = 0;
    }
    
    public int get(int index) {
        if(index <0 || index>=size)
        {
             return -1;
        }
        Node cu = head;
        for(int i = 0;i<index;i++)
        {
            cu = cu.next;
        }
        return cu.val;
    }
    
    public void addAtHead(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        size++;
    }
    
    public void addAtTail(int val) {
        Node node = new Node(val);
        if(head == null)
        {
            head = node;
            size++;
            return ;
        }
        Node cur = head;
        while(cur.next!= null)
        {
            cur = cur.next;
        }
        cur.next = node;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index < 0 || index > size)
        {
            return ;
        }
        if(index == 0)
        {
            addAtHead(val);
            return;
        }
        if(index == size)
        {
            addAtTail(val);
            return;
        }
        Node cur = head;
        for(int i = 0;i<index-1;i++)
        {
            cur = cur.next;
        }
        Node node = new Node(val);
        node.next = cur.next;
        cur.next = node;
        size++;


    }
    
    public void deleteAtIndex(int index) {
        if(index<0 || index>=size)
        {
            return ;
        }
        if(index == 0)
        {
            head = head.next;
            size--;
            return;
        }
        Node cur = head;
        for(int i = 0;i<index-1;i++)
        {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        size--;

    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */