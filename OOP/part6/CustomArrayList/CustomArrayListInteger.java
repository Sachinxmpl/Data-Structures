package Data_Structures_and_algorithms.OOP.part6.CustomArrayList;
import java.util.* ; 


public class CustomArrayListInteger {

    private int[] data ; 
    private static int default_size = 10 ; 
    int size = 0 ; 

    public CustomArrayListInteger(){
        this.data = new int[default_size] ; 
    }

    public boolean isEmpty(){
        return this.size == 0 ; 
    }

    public void add(int num){
        if(isFull()){
            resize() ; 
        }
        data[size++] = num ; 
    }

    public boolean isFull(){
        return this.size == this.data.length ; 
    }

    public int removeLast(){
        this.size = size -1 ; 
        int removed = data[size] ; 
        return removed ; 
    }

    public int size(){
        return this.size ; 
    }
    
    public void set(int index, int val){
        data[index] = val ; 
    }

    private void resize(){
        int newSize = this.size * 2 ; 
        int[] temp = new int[newSize] ; 
        for ( int i =  0  ; i < data.length ; i++){
            temp[i] = data[i] ; 
        }
        data = temp ; 
    }

    @Override
    public String toString(){
        return Arrays.toString(data) ; 
    }

    public static void main(String[] args) {
        CustomArrayListInteger list = new CustomArrayListInteger() ; 
        list.add(3) ; 
        list.add(5);
        list.add(9);

        for ( int i = 0 ; i < 14 ; i++){
            list.add(i * (i+1) * (i+2)) ; 
        }
        System.out.println(list);
    }
}
