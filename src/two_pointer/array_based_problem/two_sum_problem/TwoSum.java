package two_pointer.array_based_problem.two_sum_problem;

import java.util.HashMap;
import java.util.Map;

//Given a sorted array, find if there exists a pair of elements that sum up to a given target.

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> elementToIndexMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(elementToIndexMap.containsKey(target-nums[i])){
                return new int[]{elementToIndexMap.get(target-nums[i]), i};
            }
            elementToIndexMap.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        TwoSum ob = new TwoSum();
        int[] result = ob.twoSum(nums, target);
        if(result[0] != -1 && result[1] != -1){
            System.out.println("[" + result[0] + ", " + result[1] + "]");
        }
    }
}