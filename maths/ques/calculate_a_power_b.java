package maths.ques;

public class calculate_a_power_b {
    public static void main(String[] args) {
        int ans = helper(2,4) ; 
        System.out.println(ans);
    }

    //method 1 
    // to find a * b perform a * a* ---*a b times 
    // time complexity o(b)

    //method 2 , using power as bits 
    //  time complexity O(log b)
    static int helper(int a, int b){
        int base = a ; 
        int ans = 1 ; 
        while(b > 0){
                if((b & 1) == 1){
                        ans = ans * base ; 
                }
                base = base * base ; 
                b = b >> 1 ; 
        }
        return ans ; 
    }
}
