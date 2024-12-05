package dynamic_linear_structures.linkedList.problems;

public class reverseLinkedList {
    public static void main(String[] args) {
        LL test = new LL();
        int a = 200 ; 
        for ( int i = 0 ; i < 5 ; i++){
            test.insert(i, i + a );
            a = a/2 ; 
        }
        test.displayNodes();

        test.reverse();
        test.displayNodes();
    }
}



class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head ; 
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head ;
        head.next = null ;
        return newHead ;
    }
}

class LL{
    int size ; 
    Node head ; 
    Node tail ; 
    public LL(){
        this.size = 0; 
    }

    public void reverse(){
        Node tail  = reverse(head);
        tail.next = null ; 
    }
    public Node reverse(Node node){
        if(node.next == null){
            head = node ; 
            return node ; 
        }
        Node currnode = reverse(node.next);
        currnode.next = node;
        return node;
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
