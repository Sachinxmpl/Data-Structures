package linear_structures.stacksAndQueues.part3;

public class CustomQueue {
    private int[] data ; 
    private static final  int default_size = 10 ; 

    int end = 0 ; 

    public CustomQueue(int size){
        this.data = new int[size];
    }
    public CustomQueue(){
        this(default_size);
    }

    public boolean insert(int val){
        if(isFull()){
            return false ; 
        }
        data[end++] = val ; 
        return true ; 
    }

    //O(N)
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int toBeRemved = data[0];
        for( int i = 0 ;i < end ; i++){
            data[i] = data[i+1];
        }
        end = end - 1; 
        return toBeRemved;
    }

    //0(1)
    public boolean isFull(){
        return end == data.length ; 
    }
    public boolean isEmpty(){
        return end == 0 ; 
    }
}
