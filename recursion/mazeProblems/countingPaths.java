package recursion.mazeProblems;

//problem statement in maze can move only one step down and one step right 
//find no of ways 

public class countingPaths {
    public static void main(String[] args) {
        System.out.println(countPaths(0, 0, 2, 2));
    }
    static int countPaths(int row , int col, int dest1 , int dest2){
        if(row == dest1 || col == dest2){
            return 1 ; 
        }
        int down = countPaths(row+1, col, dest1, dest2);
        int right = countPaths(row,col+1, dest1, dest2);
        return down + right ; 
    }
}
