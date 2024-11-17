public class allnumbers_repeating_oddtimes_except_one {
        public static void main(String[] args) {
                int[] nums = {2,2,-1,2,7,7,8,7,8,8} ; 
                System.out.println(findNonReapeatingNumber(nums));
        }

        static int findNonReapeatingNumber(int[] nums){
                int sum = 0 ; 
                for ( int i = 0 ; i < nums.length ; i++){
                        sum = sum + nums[i] ; 
                }
                return sum % 3 ; 
        }
}
