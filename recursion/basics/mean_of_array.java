public class mean_of_array {
        public static void main(String[] args) {
                int[] nums  = {1,2,3,4,5,6,7,8,9,10} ;
                int length = nums.length ; 
                
                double ans = findMean(nums , length) ;      
                System.out.println("The average of array is " + ans);  
        }

        static double findMean(int[] nums , int length){
                if(length == 1){
                        return nums[length-1] ; 
                }
                return  ((findMean(nums,length-1)*(length-1) + nums[length-1])/length);
        }
}
