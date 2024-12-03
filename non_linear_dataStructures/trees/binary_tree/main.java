package non_linear_dataStructures.trees.binary_tree;
import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tree tr = new Tree();
        tr.populate(sc);
        // tr.display();
        tr.prettyDisplay();
    }
}
