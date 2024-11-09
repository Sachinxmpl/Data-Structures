package arrays.linearSearch;

public class check_x_exits {
            public static void main(String[] args) {
                        int[] arr = {1,7,3,4,2,6} ; 
                        int key = 9 ; 

                        System.out.println("Key exisits at index " + linearSearch(arr , key));
            }

            static int linearSearch(int[] arr , int key){

                        if(arr.length == 0 ){
                                    return -1 ; 
                        }

                        for ( int i = 0 ; i < arr.length ; i++){
                                    if(key == arr[i]){
                                                return i ; 
                        
                                    }
                        }
                        return -1; 
            }
}

// best case time complexity -> O(1)
// worst case time complexity -> O(n)
//average time complexity -> O(n)

//space complexity -> O(1)
