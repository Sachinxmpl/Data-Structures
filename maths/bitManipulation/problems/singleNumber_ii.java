public class singleNumber_ii {
        public static void main(String[] args) {
                int[] nums = { 2, 2, 4, 2, 7, 7, 8, 7, 8, 8 };
                System.out.println(findNonReapeatingNumber(nums));
        }

        static int findNonReapeatingNumber(int[] nums) {
                int ans = 0;
                for (int i = 1; i <= 32; i++) {
                        int bitcount = 0;

                        for (int num : nums) {
                                if ((num & (1 << (i - 1))) != 0) {
                                        bitcount++;
                                }
                        }

                        if (bitcount % 3 != 0) {
                                // set the ith bit of ans
                                ans = ans | (1 << (i - 1));
                        }
                }

                return ans;
        }
}
