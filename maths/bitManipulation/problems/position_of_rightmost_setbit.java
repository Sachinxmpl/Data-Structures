public class position_of_rightmost_setbit{
        public static void main(String[] args) {
                System.out.println(position(6));
        }

        static int position(int n){
                return (n & (-n)) ; 
        }
}