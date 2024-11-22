public class smallestletter_greater_thanTarget {
    public static void main(String[] args) {
        char[] str = { 'c', 'f', 'z' };
        System.out.println("The smallest letter greater than target is " + nextGreatestLetter(str, 'a'));

    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target >= letters[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        int x = start % (letters.length);
        return letters[x];
    }
}
