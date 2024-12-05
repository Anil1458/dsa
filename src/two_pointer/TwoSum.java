package two_pointer;

import java.util.HashMap;
import java.util.Map;

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
}