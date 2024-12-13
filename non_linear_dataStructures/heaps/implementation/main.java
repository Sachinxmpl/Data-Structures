package non_linear_dataStructures.heaps.implementation;
import java.util.* ; 

public class main {
    public static void main(String[] args) throws Exception {
            Heap<Integer> heap = new Heap<>() ; 
            heap.insert(23);
            heap.insert(0);
            heap.insert(340) ; 
            heap.insert(13) ; 
            heap.insert(1000) ; 

            // while(!heap.isEmpty()){
            //     System.out.println(heap.remove());
            // }

            ArrayList<Integer> sortedList = heap.HeapSort() ; 
            System.out.println(sortedList);

    }
}
