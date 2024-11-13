public class revise {
        public static void main(String[] args) {
                
        }

        static void cycleSort(int arr[]){
                int i = 0 ; 
                while(i < arr.length ){
                        int correctIndex = arr[i] -1  ; 
                        if(arr[i] !=arr[correctIndex]){
                                int temp = arr[i] ; 
                                arr[correctIndex] = temp ; 
                                arr[i] = temp ; 
                        }else{
                                i++ ; 
                        }
                }
        }
}
