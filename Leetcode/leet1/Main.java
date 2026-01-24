
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Solution {

    
   public static int findNumber(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Return the index where the number is found
            }
        }
        return -1; // Return -1 if the number is not found
    }



    public int[] twoSum(int[] nums, int target) {
       int[] result = new int[2];
        for(int x = 0; x<nums.length; x++){
                int minus = target - nums[x];
                int pos = findNumber(nums, minus);
                    if(pos != -1 && x!= pos){
                        result[0] = pos;
                        result[1] = x;
                        return   result;
                    }
        }        

                return result;

    }
}
class Main{

    public static void main(String[] a){
        int[] arr  = {3,2,4};
        int[] out = new int[2];
        Solution ob = new Solution();
        out = ob.twoSum(arr,6);
        System.out.print(out[0]);
        System.out.print(out[1]);
        
    }
}