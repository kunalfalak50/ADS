import java.util.*;

public class BSTSearchDemo {

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

    // Insert (same as previous question, to build BST)
    Node insert(Node root, int key) {
        if (root == null) return new Node(key);

        if (key < root.data)
            root.left = insert(root.left, key);
        else if (key > root.data)
            root.right = insert(root.right, key);

        return root;
    }

    // Search in BST
    boolean search(Node root, int key) {
        if (root == null) return false;

        if (root.data == key)
            return true;
        else if (key < root.data)
            return search(root.left, key);
        else
            return search(root.right, key);
    }

    public static void main(String[] args) {

        BSTSearchDemo tree = new BSTSearchDemo();

        // Build BST (same as Q10 insert)
        int values[] = {50, 30, 20, 40, 70, 60, 80};
        for (int val : values) {
            tree.root = tree.insert(tree.root, val);
        }

        // Test cases
        int key1 = 40;
        int key2 = 90;

        System.out.println("Search " + key1 + ": " + 
            (tree.search(tree.root, key1) ? "Found" : "Not Found"));

        System.out.println("Search " + key2 + ": " + 
            (tree.search(tree.root, key2) ? "Found" : "Not Found"));
    }
}