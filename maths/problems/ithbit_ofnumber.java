package maths.problems;

public class ithbit_ofnumber {
        public static void main(String[] args) {
                int n = 10 ; 
                System.out.println(getIthBitofNumber(n, 4));
                System.out.println(setIthBitofNumber(n, 3));
                System.out.println(clearIthBitofNumber(n, 4));
                System.out.println(clearLastIbitsofanumber(7,2));
        }

        static int getIthBitofNumber(int n , int i ){
                int bitmask = 1 << (i-1) ; 
                int ans =  (n & bitmask) ; 
                if(ans == 0){
                        return 0 ; 
                }
                return 1 ; 
        }

        static int setIthBitofNumber(int n , int i){
                //set means make ith bit 1 
                int bitmask = 1 << (i-1) ; 
                return (n | bitmask) ; 
        }

        static int clearIthBitofNumber(int n , int i){
                int bitmask = ~(1 << (i-1));
                return (n & bitmask) ; 
        }

        static int updateIthBitofNumber(int n , int i , int newbit ){
                if(newbit == 0){
                        return clearIthBitofNumber(n, i) ; 
                }else{
                        return setIthBitofNumber(n, i) ;
                }
        }

        static int clearLastIbitsofanumber(int n , int i){
                int bitmask = (-1 << (i-1));
                return (n & bitmask) ; 
        }
}


