import java.util.Arrays;

public class insertion_sort {

        public static void main(String[] args) {
                int[] nums = { 1, 0, -2, 4, -6, 4, 2 };
                insertionSort2(nums);
                System.out.println(Arrays.toString(nums));
        }

        //Worst and average case complexity of this code is O(n2) whereas the best case if O(1)
        static void bestInsertionSort(int[]arr){
                int n = arr.length ; 
                for(int i = 0 ;i < n ; i++){
                        int j = i ; 
                        while(j > 0  && arr[j-1] > arr[j]){
                                //swap 
                                int temp = arr[j-1] ; 
                                arr[j-1] = arr[j] ; 
                                arr[j] = temp ;

                                j-- ; 
                        }
                }
        }

        static void insertionSort2(int[] arr) {
                int n = arr.length;
                for (int i = 0; i < n - 1; i++) {
                        for (int j = i + 1; j > 0; j--) {
                                if (arr[j] < arr[j - 1]) {
                                        // swap arr[j] and arr[j-1]
                                        int temp = arr[j];
                                        arr[j] = arr[j - 1];
                                        arr[j - 1] = temp;
                                } else {
                                        break;
                                }
                        }
                }

        }

        static void insertionSort(int[] arr) {
                int n = arr.length;
                for (int i = 1; i < n; i++) {
                        int j = i - 1;
                        int key = arr[i];
                        while (j >= 0 && arr[j] > key) {
                                arr[j + 1] = arr[j];
                                j--;
                        }
                        arr[j + 1] = key;
                }
        }

}


//time complexity worst case  
// 1 + 2 + 3 + ....(N-1) comparison = O(n2) 

//?This is where insertion sort sines 
//best case 
// 1 + 1 + 1 + 1 comparions (N-1) comparisions O(n)


//?Why user insertionn sort 
// Swaps get reduces if array tends to sorted 
// It is stable 
// Used for smaller values of N , works perfectly if partially sorted 