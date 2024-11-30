package recursion.mazeProblems;
//find all paths , one can go one step right , left or diagonally

//we can go diagonally below but not above 

public class paths_diagnal {
    public static void main(String[] args) {
        maze("", 0, 0, 2, 2);
    }

    static void maze(String p, int r, int c, int d1, int d2) {
        if (r == d1 && c == d2) {
            System.out.println(p);
            return;
        }
        if (r == d1) {
            maze(p + "r", r, c + 1, d1, d2);
        } else if (c == d2) {
            maze(p + "d", r + 1, c, d1, d2);
        } else {
            maze(p + "r", r, c + 1, d1, d2);
            maze(p + "d", r + 1, c, d1, d2);
            maze(p + "g", r + 1, c + 1, d1, d2);
        }
    }
}
