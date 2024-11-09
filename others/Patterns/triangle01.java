import java.util.Scanner;

public class triangle01 {
            public static void main(String args[]) {
                        Scanner sc = new Scanner(System.in);
                        int n = sc.nextInt();

                        for (int i = 1; i <= n; i++) {
                                    if (i % 2 != 0) {
                                                int a = 1;
                                                for (int j = 1; j <= i; j++) {
                                                            System.out.print(a + " ");
                                                            if (a == 1) {
                                                                        a = 0;
                                                            }
                                                          else{
                                                            a =1 ; 
                                                          }
                                                }

                                    } else {
                                                int a = 0;
                                                for (int j = 1; j <= i; j++) {
                                                            System.out.print(a + " ");
                                                            if (a == 1) {
                                                                        a = 0;
                                                            }
                                                            else{

                                                                        a = 1;
                                                            }
                                                }
                                    }
                                    System.out.println();
                        }
                        sc.close();

            }
}
