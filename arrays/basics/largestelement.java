import java.util.* ; 

public class largestelement{

            public static int getLargest(int[] numbers){
                        int largest = Integer.MIN_VALUE ;
                        for ( int i = 0 ; i < numbers.length ; i++){
                                    if(largest < numbers[i]){
                                                largest = numbers[i] ; 
                                    }
                        }
                        return largest ; 
            }

            public static void main(String[] args){
                        int[] numbers = {4 , 5 , 5, 323 , 54 ,-2} ; 
                        int largest = getLargest(numbers) ;
                        System.out.println("The largest element is " + largest);
            }
}