package two_pointer.array_based_problem.triplet_with_zero_sum;

import java.util.*;

public class TripletWithZeroSum {
    public Set<List<Integer>> tripletWithZeroSum(int[] arr){
        Arrays.sort(arr);
        Set<List<Integer>> res = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
           int start = i+1;
           int end = arr.length-1;
           while(start < end){
               if(arr[i] + arr[start] + arr[end] == 0){
                   res.add(Arrays.asList(arr[i], arr[start], arr[end]));
               }
               start++;
               end--;
           }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {-4, 1, -3, 8, 2, 5, -9, 10, -7, 6};
        TripletWithZeroSum tripletWithZeroSum = new TripletWithZeroSum();
        Set<List<Integer>> res = new HashSet<>();
        res = tripletWithZeroSum.tripletWithZeroSum(arr);
        System.out.println(res.toString());
    }
}
