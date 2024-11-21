package maths.ques;

import java.util.ArrayList;

public class factors_number {
    public static void main(String[] args) {
        optimisedFactorsSort(45);
    }

    // time complexity O(sqrt(n))
    // space o(1)
    static void optimisedFactors(int n ){
        for ( int i = 1 ; i <= Math.sqrt(n) ; i++){
            if( n % i == 0){
                if(n/i == i){
                    System.out.print(i);
                }else{
                    System.out.print(i + " " + n/i + " ");
                }
            }
        }
    }


    //optimized with sorting 
    //time complexity O(sqrt(n))
    //space complexity O(srt(n)) creating ArrayList of size sqrt(n)
    static void optimisedFactorsSort(int n ){
        ArrayList<Integer> x = new ArrayList<>();
        for ( int i = 1 ; i <= Math.sqrt(n) ; i++){
            if( n % i == 0){
                if(n/i == i){
                    System.out.print(i);
                }else{
                    System.out.print(i + " ");
                    x.add(n/i);
                }
            }
        }
        for ( int i = x.size() - 1 ; i>= 0 ; i--){
            System.out.print(x.get(i) + " ");
        }
    }

    //complexity O(n) , space => O(1)
    static void factors(int n){
        for ( int i = 1; i<= n ; i++){
            if( n % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
