package recursion.Backtracking;

import java.util.Arrays;

//lets solve maze problem where  anuy path is possible along x and y axis
//move up down left right 

//But the catch is this will undergo infinte recursion problem , it moves to start again and again 

//To solve this use backtracking 
//Take the constraints simple , move from (r,c) of maze to end ;

//But we need to keep track of the previous step , whenvever we move to next step , make the current step false so we don't return back 
//Also the false should again be made true when recursion calls gets over so it doesn't affect other path

public class BacktrackingMaze {
    public static void main(String[] args) {
        boolean[][] board = {
                { true, true, true },
                { true, true, true },
                { true, true, true }
        };
        allPath("", board, 0, 0);

        int[][] path = new int[board.length][board[0].length];
        allPathBeatyPrint("", board, 0, 0, path, 1);
    }

    static void allPath(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c]) {
            return;
        }

        maze[r][c] = false;

        if (r < maze.length - 1) {
            allPath(p + "D", maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            allPath(p + "R", maze, r, c + 1);
        }
        if (r > 0) {
            allPath(p + "U", maze, r - 1, c);
        }
        if (c > 0) {
            allPath("L", maze, r, c - 1);
        }

        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made
        // by that function
        maze[r][c] = true;
    }

    static void allPathBeatyPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if (!maze[r][c]) {
            return;
        }

        maze[r][c] = false;
        path[r][c] = step;
        if (r < maze.length - 1) {
            allPathBeatyPrint(p + "D", maze, r + 1, c, path, step+1);
        }
        if (c < maze[0].length - 1) {
            allPathBeatyPrint(p + "R", maze, r, c + 1, path, step+1);
        }
        if (r > 0) {
            allPathBeatyPrint(p + "U", maze, r - 1, c, path, step+1);
        }
        if (c > 0) {
            allPathBeatyPrint("L", maze, r, c - 1, path, step+1);
        }

        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made
        // by that function
        maze[r][c] = true;
        path[r][c] = 0;
    }

}
