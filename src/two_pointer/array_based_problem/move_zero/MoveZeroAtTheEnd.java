package two_pointer.array_based_problem.move_zero;

import java.util.Arrays;

public class MoveZeroAtTheEnd {
    public int[] moveZeroAtTheEnd(int[] arr){
        int idx = 0;
        for(int i : arr){
            if(i != 0){
                arr[idx++] = i;
            }
        }
        while (idx < arr.length){
            arr[idx++] = 0;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2, -1, 0, 5, 0, 1, 0, 8};
        System.out.println(Arrays.toString(new MoveZeroAtTheEnd().moveZeroAtTheEnd(arr)));
    }
}
