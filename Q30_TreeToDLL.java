class BSTToList {
    public static void main(String[] args) {
        Node root = new Node(10, null, null);
        Node node1 = new Node(14, null, null);
        Node node2 = new Node(6, null, null);
        Node node3 = new Node(4, null, null);
        Node node4 = new Node(8, null, null);
        Node node5 = new Node(12, null, null);
        Node node6 = new Node(16, null, null);

        root.right = node1;
        root.left = node2;
        node1.right = node6;
        node1.left = node5;
        node2.right = node4;
        node2.left = node3;

        BSTToList solution = new BSTToList();
        Node res = solution.treeToList(root);

        for (Node i = res; i != null; i = i.right) {
            System.out.println("My val is " + i.val + ", my next is :" + i.right + " my prev is " + i.left);
        }
    }


    private Node newRoot = null;
    private Node prev = null;

    public Node treeToList(Node root) {
        connectNodes(root);
        return newRoot;
    }

    private void connectNodes(Node currNode) {
        if (null == currNode) {
            return;
        }

        connectNodes(currNode.left);
        /************************************************/
        if (null == newRoot) {
            newRoot = currNode;
        }
        currNode.left = prev;
        if (prev != null) {
            prev.right = currNode;
        }
        prev = currNode;
        /*************************************************/
        connectNodes(currNode.right);
    }
}

class Node {
    int val;
    Node left;
    Node right;

    Node() {
    }

    Node(int val) {
        this.val = val;
    }

    Node(int val, Node left, Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "{" + "val=" + val + '}';
    }
}
