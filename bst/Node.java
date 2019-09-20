class Node {
    Node left, right;
    int data;

    public Node(int data) {
        this.data = data;
    }

    public void insert(int value) {
        if (value <= data) {
            if (left == null)
                left = new Node(value);
            else
                left.insert(value);

        } else {
            if (right == null)
                right = new Node(value);
            else
                right.insert(value);
        }
    }

    public boolean contains(int value) {
        if (value == data)
            return true;
        else if (value < data)
            return left == null ? false : left.contains(value);
        else
            return right == null ? false : right.contains(value);
    }

    public void printInOrder() {
        if (left != null)
            left.printInOrder();
        System.out.println(data);
        if (right != null)
            right.printInOrder();
    }

    public static void main(String[] args) {
        Node n = new Node(10);

        int[] nums = { 5, 8, 15 };
        for (int num : nums) {
            n.insert(num);
        }

        // test
        n.printInOrder();
        n.insert(13);
        // n.insert(14);
        n.printInOrder();
        n.insert(14);
        n.printInOrder();
    }
}