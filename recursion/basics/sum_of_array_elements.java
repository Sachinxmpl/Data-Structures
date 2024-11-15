public class sum_of_array_elements {
        public static void main(String[] args) {
                int[] arr = {1,2,3,4,5,6,7,8,9,10} ; 
                System.out.println(findSum(arr, arr.length));
        }

        static int findSum(int arr[] , int n ){
                if(n == 0 ){
                        return 0 ; 
                }
                return arr[n-1] + findSum(arr , n-1) ; 
        }
}
