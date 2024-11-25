package dynamic_linear_structures.linkedList.problems;

public class main {
    public static void main(String[] args) {
        InsertRecursion list = new InsertRecursion();
        for ( int i = 0 ; i < 5 ; i++){
            list.insertRec(i+5, i);
        }
        list.insertRec(99, 3);
        list.displayNode();
    }
}
