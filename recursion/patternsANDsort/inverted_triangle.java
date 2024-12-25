package recursion.patternsANDsort;

public class inverted_triangle {
    public static void main(String[] args) {
        print(5);
        print(5,1,1);
    }

    //recursive 
    static void print(int n , int row , int col){
        if(row > n){
            return ; 
        }
        if(col > n-row+1){
            System.out.println();
            print(n , row+1 , 1);
            return; 
        }
        System.out.print("* ");
        print(n , row , col+1);
    }

    //iterative way 
    static void print(int n ){
        for ( int i = 1 ; i <= n ; i++){
            for ( int j = n - i + 1 ; j >0 ; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
