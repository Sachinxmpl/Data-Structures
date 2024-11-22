package Data_Structures_and_algorithms.recursion.patternsANDsort;

public class normal_triangle {
    public static void main(String[] args) {
        print(5,1,1);
    }

    static void print(int n , int row , int col){
        if(row > n){
            return ; 
        }
        if(col > row){
            System.out.println();
            print(n,row+1, 1);
        }else{
            System.out.print("* ");
            print(n, row, col+1);
        }
    }
}
