class Leet34{
public static void main(String[] args){
    int[] result = new int[3];
    int[] nums  = new int[]{5,7,7,8,8,10};
    Solution sob = new Solution();
    result = sob.searchRange(nums,3);
    System.out.print(result[0]);
    System.out.print(result[1]);
    }
}


class Solution {
    int [] result = new int[3];
    int flag = 0;
    public int[] searchRange(int[] nums, int target) {
        int len = nums.length;
        for(int c = 0; c<len; c++){
            if(nums[c] == target){
                if(flag == 0){
                result[0] = c;
                flag =1;
               }
            }

        }
        if(flag == 0)
            {
                result[0] = -1;
                result[1] = -1;
                return result;
            }

            for(int c = 0; c<len; c++){
                if(nums[c] == target){
               
                result[1] = c;
               
            }
              

           // System.out.print(nums[c]);
        }
        return result;
    }
}