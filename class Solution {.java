class Solution {
    public int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        int[] temp = new int[size];
       System.arraycopy(nums, 0, temp, 0, nums.length);

        for(int x = 0; x<nums.length; x++){
            if(nums[x] + temp[x+1] == target){
                System.out.print(x+" "+(x+1));
                 temp[0]= x;
                 temp[0]= x+1;
                 return   temp;
            }
        }
        return   temp;
    }
}

