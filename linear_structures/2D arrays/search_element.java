public class search_element {
    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 65, 45 },
                { 234, 4643, 23, 3 },
                { 234, 34, 6 }
        };
        int target = 234;
        System.out.println("The position of target element is" + search(arr, target)[0] + ","
                + search(arr, target)[1]);

    }

    static int[] search(int[][] arr, int target) {

        if (arr.length == 0) {
            return new int[] { -1, -1 };
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[] { i, j };
                }
            }
        }

        return new int[] { -1, -1 };
    }
}
