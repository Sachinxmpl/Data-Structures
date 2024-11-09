import java.util.* ; 
//Maximum item in a range 

public class maximum_element{

            public static int getLargest(int[] numbers , int a , int b ){
                        int largest = Integer.MIN_VALUE ;  //works even if array is empty 
                        for ( int i = a ; i < b ; i++){
                                    if(largest < numbers[i]){
                                                largest = numbers[i] ; 
                                    }
                        }
                        return largest ; 
            }

            public static void main(String[] args){
                        int[] numbers = {4 , 5 , 5, 323 , 54 ,-2} ; 
                        int largest = getLargest(numbers , 0 , 2) ;
                        System.out.println("The largest element is " + largest);
            }
}