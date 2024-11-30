package recursion.mazeProblems;

public class maze_with_obstacles {
    public static void main(String[] args) {
        maze("", 0, 0, 2, 2, 1, 2);
    }

    static void maze(String path , int row , int col , int d1 , int d2 , int ob1  , int ob2){
        if(d1 == row && d2 == col){
            System.out.println(path);
            return ; 
        }
        if(row ==  ob1 && col == ob2){
            return ; 
        }
        if(row == d1){
            maze(path + "r", row , col+1 , d1 ,d2 , ob1 , ob2);
        }
        else if(col == d2){
            maze(path+"d" , row+1 , col , d1, d2 ,ob1 , ob2);
        }
        else {
            maze(path + "r", row , col+1 , d1 ,d2 , ob1 , ob2);
            maze(path+"d" , row+1 , col , d1, d2 , ob1, ob2);
        }
    }
}
