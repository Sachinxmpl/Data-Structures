package non_linear_dataStructures.heaps.implementation;

import java.util.* ; 

public class Heap <T extends Comparable<T>>{
    private ArrayList<T> list ; 
    
    public Heap(){
        list = new ArrayList<T>() ; 
    }
    
    public void swap(int first , int second ){
        T temp = list.get(first) ; 
        list.set(first , list.get(second)) ; 
        list.set(second, temp) ; 
    }
    public boolean isEmpty(){
        return list.isEmpty() ; 
    }

    public int parent(int index){
        return (index-1)/2 ;
    }
    public int leftChild(int index){
        return 2*index+1 ; 
    }
    public int rightChild(int index){
        return 2*index+2 ;
    }



    //* Insertion takes 0(1) to add at last and O(logn) to upheap along heigh tof tree SO time complexity O(logn) space O(logn)  */
    public void insert(T val){
        list.add(val) ; 
        upHeap(list.size()-1 ) ; 

    }
    private void upHeap(int index){
        if(index == 0){
            return ; 
        }
        int p = parent(index) ; 
        if(list.get(index).compareTo(list.get(p)) > 0){
            swap(index, p) ; 
            upHeap(p);
        }
    }


    //*removal takes O(1) to remove from first and O(logn) to downheap ==> time O(logn) space O(logn)/
    public T remove() throws Exception{
        if(list.isEmpty()){
            throw new Exception("Empty list");
        }
        T maxItem = list.get(0) ;
        T last = list.remove(list.size()-1) ; 
        if(!list.isEmpty()){
            list.set(0 , last) ; 
            downHeap(0) ;
        }

        return maxItem ; 
    }
    private void downHeap(int index){
        int min = index ; 
        int left = leftChild(index) ; 
        int right = rightChild(index) ; 

        if(left < list.size() && list.get(left).compareTo(list.get(min)) > 0){
            min = left; 
        }
        if(right < list.size() && list.get(right).compareTo(list.get(min)) > 0){
            min  = right ; 
        }

        if(min != index){
            swap(min , index) ; 
            downHeap(min);
        }

    }




    //*Heapsort */
    //Return an sorted ArrayList

    public ArrayList<T> HeapSort() throws Exception{
        ArrayList<T> sortedlist = new ArrayList<>() ; 

        while(!this.isEmpty()){
            sortedlist.add(this.remove()) ; 
        }

        return sortedlist ; 
    }
}
