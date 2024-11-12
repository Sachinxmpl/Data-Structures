import java.util.* ; 

public class inbuilt_sort {
        public static void main(String[] args) {
                int arr[] = {5,4,3,2,1} ; 
                
                //sorts array 
                // Arrays.sort(arr) ;    ascending 
                // Arrays.sort(arr , Collection.reverseOrder())  // descending 

                // For index start to index end-1 
                Arrays.sort(arr , 0 , 5);
                System.out.println(Arrays.toString(arr));
        }
}
