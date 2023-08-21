package binaryTree;

public class MainRunner {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(25);
        tree.insert(44);
        tree.insert(22);
        tree.insert(35);
        tree.insert(15);
        tree.insert(45);
        tree.insert(10);
        tree.insert(12);
        tree.insert(30);
        tree.insert(7);
        tree.insert(29);
        tree.insert(5);

//        tree.unOrderedTraversal(tree.root);
//        tree.preOrderTraversal(tree.root);
        tree.postOrderTraversal(tree.root);

    }
}
