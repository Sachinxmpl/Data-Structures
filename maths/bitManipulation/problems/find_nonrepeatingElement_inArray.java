package maths.bitManipulation.problems;

public class find_nonrepeatingElement_inArray {
        public static void main(String[] args) {
                int[] arr= {2,3,4,1,2,1,3,6,4} ; 
                System.out.println(findUnique(arr));
        }

        // a ^ a = 0 
        // a ^ 0 = a 

        static int findUnique(int[] arr){
                int a  = 0;
                for ( int i = 0 ;i < arr.length ; i++){
                        a = a ^ arr[i] ; 
                }

                return a;
        }
}
