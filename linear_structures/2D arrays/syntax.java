import java.util.* ;

public class syntax {
            public static void takeinput(int[][] arr){
                        Scanner input = new Scanner(System.in) ; 
                        for ( int i= 0 ; i < arr.length ; i++){
                                    for ( int j = 0 ; j < arr[i].length ; j++){
                                                arr[i][j] = input.nextInt() ; 
                                    }
                        }

                        input.close() ; 
            }
            public static void main(String[] args) {
                        //no of rows -> compulsary , columns doesnot matter 
                        int[][] arr = new int[5][2] ; 
                        int[][] marks = {
                                    {1,2,3,4}  , {1,2,3,23} , {7, 9,5,5}
                        } ; 

                        takeinput(arr) ;
                        System.out.println(Arrays.deepToString(arr));
            }
}
