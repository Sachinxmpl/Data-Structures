package recursion.otherProblem;

public class AllBinaryStringsWithOutConsequetive1s {
	public static void main(String[] args) {
		int k = 4;
		helper("", k, -1);
	}

	static void helper(String p , int k , int prev){
		if(k == 0){
			System.out.println(p);
			return ; 
		}
		if(prev == -1){
			helper(p + "0" , k - 1 , 0 );
			helper(p + "1" , k -1, 1);
		}
		if(prev == 0){
			helper(p + "0", k - 1, 0);
			helper(p + "1", k - 1, 1);
		}
		if(prev == 1){
			helper(p + "0", k - 1, 0);
		}
	}

}
