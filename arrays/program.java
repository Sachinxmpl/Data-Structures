public class program {
            public static void sortArray(int numbers[]) {
                        for (int i = 0; i < numbers.length; i++) {
                                    for (int j = 0; j < numbers.length-1; j++) {
                                                if (numbers[j] > numbers[j + 1]) {
                                                            int temp = numbers[j];
                                                            numbers[j] = numbers[j + 1];
                                                            numbers[j + 1] = temp;
                                                }
                                    }
                        }
            }

            public static void printArray(int numbers[]) {
                        for (int i = 0; i < numbers.length; i++) {
                                    System.out.print(numbers[i] + "  ");
                        }
            }

            public static void main(String args[]){
                        int numbers[] =  {1,6,5,4,3,5,8} ; 
                        int key = 10 ; 
                        sortArray(numbers) ; 
                        printArray(numbers) ;
            }
}
