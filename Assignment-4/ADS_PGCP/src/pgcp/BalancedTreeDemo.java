public class BalancedTreeDemo {

    // Node class
    static class Node {
        int data;
        Node left, right;

        Node(int val) {
            data = val;
            left = right = null;
        }
    }

    // Function to check balance
    static int checkHeight(Node root) {
        if (root == null) return 0;

        int left = checkHeight(root.left);
        if (left == -1) return -1;   // left not balanced

        int right = checkHeight(root.right);
        if (right == -1) return -1;  // right not balanced

        if (Math.abs(left - right) > 1)
            return -1;   // not balanced

        return Math.max(left, right) + 1;
    }

    static boolean isBalanced(Node root) {
        return checkHeight(root) != -1;
    }

    public static void main(String[] args) {

        // Balanced Tree
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);

        System.out.println("Balanced Tree: " + isBalanced(root1));

        // Skewed Tree (like linked list)
        Node root2 = new Node(1);
        root2.right = new Node(2);
        root2.right.right = new Node(3);
        root2.right.right.right = new Node(4);

        System.out.println("Skewed Tree: " + isBalanced(root2));
    }
}