package linear_structures.stacksAndQueues.Basics;

import java.util.* ; 

public class StackUsingArraylist {
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        public  boolean isEmpty(){
            return list.size() == 0  ; 
        }

        public  void push(int val){
            list.add(val);
        }
        public  int pop(){
            if(this.isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top ; 
        }
        public  int peek(){
            if(this.isEmpty()){
                return -1;
            }
            int top = list.get(list.size() - 1);
            return top ; 
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(4);

        while(! s.isEmpty()){
            System.out.println( s.pop());
        }
        System.out.println(s.pop());
        
    }
}
