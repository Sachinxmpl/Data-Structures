package recursion.Backtracking;
import java.util.* ; 

//same questions as maze one for array of size m * n
public class maze2 {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true , true , true , true},
                {true , true , true , true } , 
                {true , true , false , true}
        }; 
        int[][] path = new int[maze.length][maze[0].length] ; 
        helper(maze , 0 , 0 , maze.length-1 , maze[0].length-1 , "" , 0  , path) ; 
    }

    static void helper(boolean[][] maze , int row , int col , int rowEnd , int colEnd , String p , int count , int[][] path){
        if(row == rowEnd && col == colEnd){
                path[row][col] = count ; 
                for(int[] arr : path){
                        System.out.println(Arrays.toString(arr)) ;
                }
                System.out.println(p);
                System.out.println();
                return ; 
        }
        if(!maze[row][col]){
                return ; 
        }
        path[row][col] = count;

        if(row < rowEnd){
                helper(maze, row + 1, col, rowEnd, colEnd, p + "D" , count + 1 , path);
        }
        if(col < colEnd){
                helper(maze, row, col+1, rowEnd, colEnd, p+"r" , count + 1 , path);
        }

        path[row][col] = 0 ; 
    }
}
