package maths.ques;

public class square_root_realnum{
    public static void main(String[] args) {
        int precision = 3 ; 
        int n = 40 ;
        System.out.println(findRoot(n, precision));
    }

    static double findRoot(double n , int precision){
        int start = 0 ; 
        int end = (int)n ; 
        double root = 0.0;
        while(start <= end){
            int mid = start + (end - start)/2 ; 
            if(mid * mid == n){
                return mid ; 
            }
            else if(mid * mid > n ){
                end = mid -1; 
            }else{
                start = mid + 1; 
            }
        }
        root = end ; 
        
        double increment = 0.1 ; 
        for ( int i = 1 ; i <= precision ; i++){
            while(root * root <= n){
                root = root + increment ; 
            }
            root = root -increment ; 
            increment = increment/10;
        }
        return root ; 
    }
}

//complexity O(logn + precision) === O{logn}