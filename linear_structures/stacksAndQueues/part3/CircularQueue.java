package linear_structures.stacksAndQueues.part3;

public class CircularQueue {
    int[] data;
    static final int default_size = 10;

    public CircularQueue() {
        this(default_size);
    }

    public CircularQueue(int size) {
        data = new int[size];
    }

    int front = 0;
    int end = 0;
    int size = 0;

    public void insert(int val) throws Exception {
        if (isFull()) {
            throw new Exception("Queue is full");
        }
        data[end++] = val;
        end = end % data.length;
        size++;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empoty");
        }
        int toberemoved = data[front] ; 
        front ++ ; 
        front = front % data.length ; 
        size -- ;
        return toberemoved;

    }

    public void display(){
        if(isEmpty()){
            System.out.println("null");
        }
        int i = front ; 
        do{
            System.out.print(data[i] + "~>");
            i++ ; 
            i = i % data.length ; 
        }while(i != end) ;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == data.length;
    }

}
