public class wealth_of_richest {
            public static void main(String[] args) {
                        int[][] accounts = {
                                    {200,300,34},
                                    {100,10,20}
                        };
                        System.out.println("The maximum wealth is " + maximumWealth(accounts));
            }

            static int maximumWealth(int[][] accounts) {
                        int ans = 0;
                        for (int i = 0; i < accounts.length; i++) {
                                    int a = eachCustomerWealth(accounts[i]);
                                    if (ans < a) {
                                                ans = a;
                                    }
                        }
                        return ans;
            }

            static int eachCustomerWealth(int[] arr) {
                        int sum = 0;
                        for (int a : arr) {
                                    sum = sum + a;
                        }
                        return sum;
            }
}
