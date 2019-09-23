import java.util.HashMap;

class TreeNode {
    TreeNode left, right;
    int data;

    public TreeNode(int data) {
        this.data = data;
    }

    public void insert(int value) {
        if (value <= data) {
            if (left == null)
                left = new TreeNode(value);
            else
                left.insert(value);

        } else {
            if (right == null)
                right = new TreeNode(value);
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

    public void VerticalSumMain(TreeNode n) {

        if (n == null)
            return;

        HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();

        VerticalSum(n, 0, hM);

        if (hM != null)
            System.out.println(hM.entrySet());
    }

    private void VerticalSum(TreeNode n, int hD, HashMap<Integer, Integer> hM) {
        if (n == null)
            return;

        VerticalSum(n.left, hD - 1, hM);
        int prevSum = hM.get(hD) == null ? 0 : hM.get(hD);
        hM.put(hD, prevSum + n.data);

        VerticalSum(n.right, hD + 1, hM);
    }

    public static void main(String[] args) {
        TreeNode n = new TreeNode(10);

        int[] nums = { 5, 8, 15, 13, 14, 16 };
        for (int num : nums) {
            n.insert(num);
        }

        // test
        n.printInOrder();

        HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();
        // Other.VerticalSumUtil(n, 0, hM);
        n.VerticalSumMain(n);
    }
}