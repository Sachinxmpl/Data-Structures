package non_linear_dataStructures.trees.segment_tree;

public class main {
    public static void main(String[] args) {
        SegmentTree st = new SegmentTree();
        int[] nums = {2,3,-1,5,-2,4,8,10};
        st.constructTree(nums);
        st.display();
        
        // st.updateTree(0, 3);
        // System.out.println("=====================================");
        // st.display();

        System.out.println("+++++++++++++++++++");
        System.out.println(st.Query(0, 0));
    }
}
