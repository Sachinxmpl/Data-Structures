package dynamic_linear_structures.linkedList.problems;

public class bubble_sort {
    public static void main(String[] args) {
        LL test = new LL();
        int a = 200 ; 
        for ( int i = 0 ; i < 3 ; i++){
            test.insert(i, i + a );
            a = a/2 ; 
        }
        test.displayNodes();
        test.bubbleSort();
        test.displayNodes();
    }
}

class LL{
    int size ; 
    Node head ; 
    Node tail ; 
    public LL(){
        this.size = 0; 
    }


    //bubble sort
    public void bubbleSort(){
        sort(size-1 , 0);
    }
    public void sort(int row , int col){
        if(row == 0){
            return ;
        }
        if(col < row){
            Node f = getNode(col);
            Node s = getNode(col+1);
            if(f.value > s.value){
                if(f == head){
                    f.next = s.next;
                    head = s ; 
                    head.next = f; 
                }
                else if(s == tail){
                    Node prev = getNode(col-1);
                    prev.next = tail ; 
                    tail.next = f ; 
                    tail = f ; 
                }else{
                    Node prev = getNode(col-1);
                    prev.next = s ; 
                    f.next = s.next ; 
                    s.next = f ; 

                }
            }
            sort(row , col+1);
        }
        sort(row-1,0);
    }


    public void insert(int index , int value){
        head  = recursiveInsert(index, value , head);
    }
    public Node recursiveInsert(int index , int value , Node curr){
        if(index == 0){
            Node temp = new Node(value);
            size ++ ;
            temp.next = curr ;
            return temp ; 
        }

        curr.next = recursiveInsert(index-1, value, curr.next);
        return curr ; 
    }

    public Node getNode(int index){
        Node temp = head  ;
        while(index > 0){
            temp = temp.next;
            index--;
        }
        return temp ; 
    }

    public void displayNodes(){
        Node temp = head ;
        while(temp != null){
            System.out.print(temp.value + "~>");
            temp = temp.next;
        }
        System.out.println("null");
    }

    private class Node{
        private int value ; 
        private Node next ; 

        public Node(int value){
            this.value = value;
            this.next = null ; 
        }
        public Node (int value , Node other){
            this.value = value;
            next = other;
        }
    }
}
