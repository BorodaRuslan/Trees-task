package binaryTree;

public class BinaryTree {
    Node root;

    public void insert(int key) {
        root = insertRec(root, key);
    }

    private Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }
        return root;
    }


    public void unOrderedTraversal(Node node) {
        if (node == null) {
            return;
        }
        unOrderedTraversal(node.right);
        System.out.print(node.key + " ");
        unOrderedTraversal(node.left);
    }
    public void postOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.key + " ");
    }

    public void preOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }
}
