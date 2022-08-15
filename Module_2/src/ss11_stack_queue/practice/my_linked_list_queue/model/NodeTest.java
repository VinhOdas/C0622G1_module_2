package ss11_stack_queue.practice.my_linked_list_queue.model;


public class NodeTest {
    public int key;
    public NodeTest next;

    public NodeTest() {
    }

    public NodeTest(int key) {
        this.key = key;
    }

    public NodeTest(int key, NodeTest next) {
        this.key = key;
        this.next = next;
    }

}
