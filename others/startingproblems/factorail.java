public class factorail {
            public static int getfactorial(int n ){
                        int fact = 1 ; 
                        for ( int i = 1 ; i <=n ; i++){
                                    fact = fact* i ; 
                        }
                        return fact ;
            }


            public static void main(String args[]){
                        int a = 0 ;

                        System.out.println("The factorail is " + getfactorial(a));
            }
}
