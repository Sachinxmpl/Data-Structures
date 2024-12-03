package non_linear_dataStructures.trees.traversals;

public class main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.populate();
        bt.preOrderTraversal(bt.root);
    }
}
