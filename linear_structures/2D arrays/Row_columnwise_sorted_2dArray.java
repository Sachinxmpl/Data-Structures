
import java.util.Arrays;

public class Row_columnwise_sorted_2dArray {
    public static void main(String[] args) {
        int[][] nums = {
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15},
            {16,17,18,19,20}
        };
        int[] ans = Search(nums, 17);
        System.out.println(Arrays.toString(ans));

    }
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
