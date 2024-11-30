package recursion.Backtracking;

import java.util.ArrayList;

// you are given a 2D maze 
// starting from startx , starty you are to go till endx , endy 
// you are allowed to move 1 step left or 1 step down only
// in one of the maze there is obstacle , so avoid that box

public class maze {
    public static void main(String[] args) {
        boolean[][] board = {
                { true, true, false },
                { false, true, true },
                { true, true, true }
        };
        pathRestrictions("", board, 0, 0, 2, 2);
        int count = count(board, 0, 0, 2, 2);
        System.out.println(count);
    }

    static int count(boolean[][] board, int startx, int starty, int endx, int endy) {
        if (startx == endx && starty == endy) {
            return 1;
        }
        if (!board[startx][starty]) {
            return 0;
        }

        int c = 0;
        if (startx < endx) {
            c = c + count(board, startx + 1, starty, endx, endy);
        }
        if (starty < endy) {
            c = c + count(board, startx, starty + 1, endx, endy);
        }

        return c;

    }

    static void pathRestrictions(String p, boolean[][] board, int startx, int starty, int endx, int endy) {
        if (startx == endx && starty == endy) {
            System.out.println(p);
            return;
        }
        if (!board[startx][starty]) {
            return;
        }
        if (startx < endx) {
            pathRestrictions(p + "d", board, startx + 1, starty, endx, endy);
        }
        if (starty < endy) {
            pathRestrictions(p + "r", board, startx, starty + 1, endx, endy);
        }
    }


    //return the list even take diagonal path possible
    static ArrayList<String> pathRetDiagonal(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (r > 1 && c > 1) {
            list.addAll(pathRetDiagonal(p + 'D', r - 1, c - 1));
        }

        if (r > 1) {
            list.addAll(pathRetDiagonal(p + 'V', r - 1, c));
        }

        if (c > 1) {
            list.addAll(pathRetDiagonal(p + 'H', r, c - 1));
        }

        return list;
    }

}
