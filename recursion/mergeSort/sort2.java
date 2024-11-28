package recursion.mergeSort;

import java.util.Arrays;

public class sort2 {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int[] ans = mergeSort(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr ;
        }
        int m = arr.length/2;
        int[] part1 = Arrays.copyOfRange(arr, 0, m);
        int[] part2  = Arrays.copyOfRange(arr,m,arr.length);
        
        part1 = mergeSort(part1);
        part2 = mergeSort(part2);
        return merge(part1 , part2);
    }

    static int[] merge(int[] part1 , int[] part2){
        int[] mix = new int[part1.length + part2.length];

        int x = 0 ; 
        int y = 0 ; 
        int z = 0 ; 
        while(x < part1.length && y < part2.length){
            if(part1[x]< part2[y]){
                mix[z++] = part1[x++];
            }
            else{
                mix[z++] = part2[y++];
            }
        }   

        while(x < part1.length){
            mix[z++] = part1[x++];
        }
        while(y < part2.length){
            mix[z++] = part2[y++];
        }
        return mix ; 
    } 
}
