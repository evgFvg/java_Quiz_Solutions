public class FlipList {
    public Node flipListRec(Node node){
        if(null == node || null == node.next){
            return node;
        }
        Node newHead = flipListRec(node.next);
        node.next.next = node;
        node.next = null;
        return newHead;
    }

    public Node flipListIterative(Node node){
        Node cur = node;
        Node next = null;
        Node prev = null;
        while(cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

