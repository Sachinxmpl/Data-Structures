package non_linear_dataStructures.hashMap.implementation;
import java.util.* ; 

public class HashMap< K , V>{
    private class Node{
        K key ; 
        V value ; 
        public Node(K key , V value){
            this.key = key ; 
            this.value = value ; 
        }
    }

    private int size ; 
    private int N ; 
    private LinkedList<Node> buckets[] ; 

    @SuppressWarnings("unchecked")
    public HashMap(){
        this.size =  0 ; 
        this.N = 4 ; 
        buckets = new LinkedList[4] ; 
        for ( int i = 0 ; i < 4 ; i++){
            buckets[i] = new LinkedList<>() ; 
        }
    }

    private int hashFunction(K key){
        int hc = key.hashCode() ; 
        hc = Math.abs(hc) ; 
        return hc % N;
    }

    private int SearchInLL(K key , int bi){
        LinkedList<Node> temp = buckets[bi] ; 
        int di = 0 ; 
        for ( int i = 0 ; i < temp.size() ; i++){
            Node node = temp.get(i) ; 
            if(node.key == key){
                return di ; 
            }
            di++ ; 
        }
        return -1 ; 
    }

    @SuppressWarnings("unchecked")
    private void reHash(){
        LinkedList<Node> oldBucket[] = buckets ; 
        buckets = new LinkedList[2 * N] ; 
        N = 2 * N ; 

        for ( int i = 0 ; i < buckets.length  ; i++){
            buckets[i] = new LinkedList<>() ; 
        }

        for ( int i = 0 ; i < oldBucket.length ; i++){
            LinkedList<Node> ll = oldBucket[i] ;
            for ( int j = 0 ; j < ll.size() ; j++){
                Node node = ll.get(j) ; 
                put(node.key , node.value) ; 
            } 
        }
    }



    //0(1) or O(lambda)
    public void put(K key   , V value){
        int bi = hashFunction(key) ; 
        int di = SearchInLL(key , bi) ; 
        if(di != -1){
            Node node = buckets[bi].get(di) ; 
            node.value = value ; 
        }else {
            buckets[bi].add(new Node(key , value)) ; 
            size ++ ; 
        }

        double lambda = (double)(size / N) ; 
        if(lambda > 2.0){
            reHash() ; 
        }
    }



    //o(1)
    public boolean containsKey(K key){
        int bi = hashFunction(key) ; 
        int di = SearchInLL(key , bi) ; 
        if(di != -1){
            return true ;  
        }else {
            return false ; 
        }
    }

    //O(1)
    public V get(K key){
        int bi = hashFunction(key) ; 
        int di = SearchInLL(key , bi) ; 
        if(di != -1){
            Node node = buckets[bi].get(di) ; 
            return node.value ; 
        }else {
           return null ; 
        }
    }

    //O(1)
    public V remove(K key){
        int bi = hashFunction(key) ; 
        int di = SearchInLL(key , bi) ; 
        if(di != -1){
            Node node = buckets[bi].remove(di) ; 
            size-- ; 
            return node.value ; 
        }else {
           return null ; 
        }
    }

    public ArrayList<K> keyset(){
        ArrayList<K> keys = new ArrayList<>() ; 
        for ( int i = 0 ;i < buckets.length ; i++){
            LinkedList<Node> ll = buckets[i] ; 
            for ( int j = 0 ; j < ll.size() ; j++){
                Node node = ll.get(j) ; 
                keys.add(node.key) ; 
            }
        }

        return keys ; 
    }

    public boolean isEmpty(){
        return size == 0 ; 
    }

}
