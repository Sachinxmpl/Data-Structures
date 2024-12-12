package OOP.part6.ExceptionHandling;

//object ==> Exception ==> ArithmeticException 

public class main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            int c = a / b;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This will always run ");
        }

        try {
            int ans = divide(3, 1);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static int divide(int a, int b) throws ArithmeticException, Exception {
        if (b == 0) {
            throw new ArithmeticException("Donot 0");
        }
        if (b == 1) {
            throw new Exception("You can use 1 but this is demo");
        }
        return a / b;
    }
}