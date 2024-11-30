
import java.util.Arrays;

public class Row_columnwise_sorted_2dArray {
    public static void main(String[] args) {
        int[][] nums = {
            {1,2,4,7},
            {5,6,8,10},
            {9,14,15,18},
            {13,16,17,20}
        };
        int[] ans = Search(nums, 17);
        System.out.println(Arrays.toString(ans));

    }

    // we can also do binary search in individaul rows as each rows is a sorted matrix 
    //better approach
    //this approeach we can start from upper right corner or lower left corner (simply ends of minor diagonal) but not end of major diagnal 
    static int[] Search(int[][] nums , int target){
        if(nums == null || nums.length == 0){
            return new int[]{-1,-1};
        }
        int x = 0 ;
        int y = nums[0].length - 1; 

        while( x < nums.length  && y >=0){
            if(target == nums[x][y]){
                return new int[]{x,y};
            }
            else if(target > nums[x][y]){
                x++;
            }else {
                y-- ; 
            }
        }
        return new int[]{-1,-1};
    }
}
//Time complexity O(no of rows + no of columns) O(m+n)
//Space complexity O(1)
