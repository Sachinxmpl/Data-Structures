public class decimal_to_binary {
        public static void main(String[] args) {
                
        }
        static int convertDecimaltoBinary(int n){
                if(n == 0 ){
                        return 0 ; 
                }
                return (n % 2 + 10 * convertDecimaltoBinary(n/2));
        }
}
