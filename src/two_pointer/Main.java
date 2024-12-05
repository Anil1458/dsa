package two_pointer;

public class Main {
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
