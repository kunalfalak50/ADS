import java.util.*;

public class BSTDemo {

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

    // Insert into BST
    Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }

        if (key < root.data) {
            root.left = insert(root.left, key);
        } else if (key > root.data) {
            root.right = insert(root.right, key);
        }

        return root;
    }

    // Inorder Traversal (sorted order)
    void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        BSTDemo tree = new BSTDemo();

        int values[] = {50, 30, 20, 40, 70, 60, 80};

        // Insert values
        for (int val : values) {
            tree.root = tree.insert(tree.root, val);
        }

        // Print inorder
        System.out.print("Inorder: ");
        tree.inorder(tree.root);
    }
}