package ss11_stack_queue.practice.my_linked_list_queue.model;

import ss11_stack_queue.practice.my_linked_list_queue.model.NodeTest;

public class MyLinkedListQueue {
    private NodeTest head;
    private NodeTest tail;

    public MyLinkedListQueue() {
        this.head = null;
        this.tail = null;
    }
    public void enqueue(int key){
        NodeTest temp = new NodeTest(key);
        if (this.tail == null){
            this.head = this.tail = temp;
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
    }
}
