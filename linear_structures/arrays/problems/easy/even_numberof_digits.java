public class even_numberof_digits {
            public static void main(String[] args) {
                        int[] nums = {12 , 123 ,34653456 , 3 , 0 , -12} ; 
                        
                        int ans = evenNoOfDigitsCounter(nums);
                        System.out.println(ans) ; 
            }

            static int evenNoOfDigitsCounter(int[] arr){
                        int count = 0 ; 
                        for(int element : arr){
                                    if(isEven(element)){
                                                count++ ;
                                    }
                        }

                        return count ; 
            }

            static boolean isEven(int num){
                        if(digits(num) % 2 == 0 ){
                                    return true ; 
                        }
                        return false ; 
            }
            static int digits(int num){
                        if(num < 0 ){
                                    num = num * -1 ;
                        }
                        if(num == 0 ){
                                    return 1 ; 
                        }
                        int length = (int)(Math.log10(num) + 1) ; 
                        return length ; 
            }
}
