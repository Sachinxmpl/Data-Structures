package recursion.mazeProblems;
//can go one step right or one step down 

public class allPaths {
    public static void main(String[] args) {
        maze("",0,0,2,2);
    }    
    static void maze(String p , int row , int col , int d1 , int d2){
        if(row == d1 && col == d2){
            System.out.println(p);
            return ; 
        }
        if(row == d1){
            maze(p + "r", row , col+1 , d1 ,d2);
        }
        else if(col == d2){
            maze(p+"d" , row+1 , col , d1, d2);
        }
        else {
            maze(p + "r", row , col+1 , d1 ,d2);
            maze(p+"d" , row+1 , col , d1, d2);
        }
    }
}
