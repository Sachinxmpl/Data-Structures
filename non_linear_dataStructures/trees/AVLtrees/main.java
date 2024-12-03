package non_linear_dataStructures.trees.AVLtrees;


public class main {
  public static void main(String[] args) {
    AVLBinaryTree bt = new AVLBinaryTree();
    int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    for (int i = 0; i < nums.length; i++) {
      bt.insert(nums[i]);
    }
    bt.display();
    System.out.println(bt.isBalanced());
    System.out.println(bt.Height());
  }
}
