package linear_structures.stacksAndQueues.part2;

public class QueueUsingArrays {
    public static void main(String[] args) throws Exception {
        Queue q = new Queue(5);
        System.out.println(q.push(23));
        System.out.println(q.push(99));
        System.out.println(q.push(32));

        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
    }
}


class Queue{
    protected int[] arr ; 
    private static final int default_size = 10  ; 

    static int front = 0 ; 
    static int rear = -1 ; 

    public Queue(){
        this(default_size);
    }
    public Queue(int size){
        arr = new int[size];
    }


    //time O(1)
    public boolean push (int val) throws Exception{
            if(isFull()){
                throw new Exception("The queue is full");
            }
            rear = rear  + 1 ; 
            arr[rear] = val ;  
            return true ; 
    }


    //time O(n)
    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty ");
        }
        int frontVal = arr[0];
        for ( int i = 0 ;i < rear ; i++){
            arr[i] = arr[i+1];
        }
        rear = rear -1 ; 
        front = 0 ; 
        return frontVal ; 
    }

    public boolean isEmpty(){
        return rear == -1 ; 
    }
    public boolean isFull(){
        return rear == arr.length - 1; 
    }

}
