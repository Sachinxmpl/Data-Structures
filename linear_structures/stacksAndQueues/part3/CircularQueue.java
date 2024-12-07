package linear_structures.stacksAndQueues.part3;

public class CircularQueue {
    private int[] data;
    private static final int default_size = 10;

    int end = 0;
    int front = 0 ; 

    int size = 0 ; 

    public CircularQueue(int size){
        this.data = new int[size];
    }

    public CircularQueue(){
        this(default_size);
    }

    public boolean insert(int val) {
        if (isFull()) {
            return false;
        }
        data[end++] = val;
        end = end % data.length ; 
        size ++ ;
        return true;
    }

    // O(N)
    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        int toBeRemved = data[front++];
        front = front % data.length ;
        size -- ; 
        return toBeRemved;
    }

    // 0(1)
    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return end == 0;
    }
}
