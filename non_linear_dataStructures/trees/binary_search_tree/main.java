package non_linear_dataStructures.trees.binary_search_tree;

public class main {
    public static void main(String[] args) {
        BinarySearchTree bt = new BinarySearchTree();
        int[] nums = {4,8,2,5,0,9,6,3,7,1};
        bt.populate(nums);
        bt.display();

        System.out.println("-----------------");
        BinarySearchTree soted = new BinarySearchTree();
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        soted.populateSorted(arr);
        soted.display();
        
    }
}
