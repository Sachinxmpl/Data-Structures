import java.util.* ; 

public class kids_withthe_greatest_candies {
            
}

class Solution {
            public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
                int maxvalue  = findMax(candies) ;
                ArrayList<Boolean> ans = new ArrayList<Boolean>() ; 
                for ( int i = 0 ;i < candies.length ; i++){
                    if((candies[i] + extraCandies) >= maxvalue){
                        ans.add(true) ; 
                    }
                    else{
        
                    ans.add(false) ; 
                    }
                }
                return ans ; 
            }
        
            int findMax(int[] candies){
                int ans = candies[0] ; 
                for (int i = 0 ; i < candies.length ; i++){
                    if(ans < candies[i]){
                        ans = candies[i] ; 
                    }
                }
                return ans ; 
            }
        }
