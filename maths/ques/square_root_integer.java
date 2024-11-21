package maths.ques;

public class square_root_integer {
    public static void main(String[] args) {
        int n = 81 ; 
        GeneralMethod(n);
        BinarySearch(n);
    }


    //time complexity O(sqrt(n))
    static void GeneralMethod(int n ){
        boolean found = false ; 
        for ( int i = 0 ; i * i <=n ; i++){
            if(i * i == n){
                System.out.println(i);
                found = true ; 
                break;
            }
        }
        if(!found){
            System.out.println("No integer squareRoot");
        }
    }


    // , binary search method 
    static void BinarySearch(int n ){
        int start = 1 ; 
        int end = n  ; 

        while(start <= end){
            int mid = start + (end - start)/2 ; 
             if(mid * mid == n){
                System.out.println("Square root is " + mid);
                return ; 
             }
             else if(mid * mid < n){
                    start = mid + 1 ; 
             }else {
                end = mid -1;
             }
        }

        System.out.println("No integer square root ");
    }
}
