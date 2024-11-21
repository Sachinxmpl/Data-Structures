package maths.ques;

public class newton_raphson_method {
    public static void main(String[] args) {
        System.out.println(root(9));
    }

    static double root(double n){
        double x = n ; 
        double root ; 
        while(true){
             root = 0.5 * (x + n/x) ;
            if(Math.abs(root - x) < 0.005){
                break ; 
            }
            
            x = root;
        }
        return root ;
    }
}



//Newton Raphson Method 
// square root of N  = (X + N/X)/2  where X is guessed square root of N 

//Say the guess is correct ie X = sqrt(N) then equation  ; sqrt(N) = (X + N/X)/2 holds true 

//WHat if the guess is not right , error = mod(root-X)