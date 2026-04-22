import java.util.*;

public class BSTMinMaxDemo {

    // Node class
    static class Node {
        int data;
        Node left, right;

        Node(int val) {
            data = val;
            left = right = null;
        }
    }

    Node root;

    // Insert (to build BST)
    Node insert(Node root, int key) {
        if (root == null) return new Node(key);

        if (key < root.data)
            root.left = insert(root.left, key);
        else if (key > root.data)
            root.right = insert(root.right, key);

        return root;
    }

    // Find Minimum (leftmost node)
    int findMin(Node root) {
        if (root == null) throw new RuntimeException("Tree is empty");

        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }

    // Find Maximum (rightmost node)
    int findMax(Node root) {
        if (root == null) throw new RuntimeException("Tree is empty");

        while (root.right != null) {
            root = root.right;
        }
        return root.data;
    }

    public static void main(String[] args) {

        BSTMinMaxDemo tree = new BSTMinMaxDemo();

        int values[] = {50, 30, 20, 40, 70, 60, 80};

        for (int val : values) {
            tree.root = tree.insert(tree.root, val);
        }

        System.out.println("Min: " + tree.findMin(tree.root));
        System.out.println("Max: " + tree.findMax(tree.root));
    }
}