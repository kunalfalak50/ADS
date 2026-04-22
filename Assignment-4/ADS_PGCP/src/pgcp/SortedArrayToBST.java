public class SortedArrayToBST {

    // Node class
    static class Node {
        int data;
        Node left, right;

        Node(int val) {
            data = val;
            left = right = null;
        }
    }

    // Convert sorted array to BST
    static Node sortedArrayToBST(int arr[], int left, int right) {
        if (left > right) return null;

        int mid = (left + right) / 2;

        Node root = new Node(arr[mid]);

        // left subtree
        root.left = sortedArrayToBST(arr, left, mid - 1);

        // right subtree
        root.right = sortedArrayToBST(arr, mid + 1, right);

        return root;
    }

    // Preorder traversal
    static void preorder(Node root) {
        if (root == null) return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7};

        Node root = sortedArrayToBST(arr, 0, arr.length - 1);

        System.out.print("Preorder: ");
        preorder(root);
    }
}