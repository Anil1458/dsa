package two_pointer.array_based_problem.remove_duplicates_sorted_array;

import java.util.Arrays;

public class RemoveDuplicates {
    public int removeDuplicates(int[] arr){
         int start = 0;
         for(int i = 1; i < arr.length; i++){
             if(arr[start] != arr[i]){
                 arr[++start] = arr[i];
             }
         }
         return start+1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 4, 5, 6, 7, 7, 7, 8, 8, 9};
        int n = new RemoveDuplicates().removeDuplicates(arr);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
