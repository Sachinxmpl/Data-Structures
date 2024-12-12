public class finalizeMethod {
    public static void main(String[] args) {
        Test a ; 
        for ( int i = 0 ; i< 10000000 ;i++){
            a = new Test() ; 
        }

        //suggest garbage collection
        System.gc() ; 
    }
}


class Test{
    public Test(){

    }

    @Override
    protected void finalize() throws Throwable{
        System.out.println("Destroyed");
    }
}