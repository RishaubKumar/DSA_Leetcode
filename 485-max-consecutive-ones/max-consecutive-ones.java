class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxVal = Integer.MIN_VALUE;
        int count =0;
        for(int i =0; i<nums.length;i++){
            if(nums[i] == 1){
                count++;
            }else{
                count = 0;
            }
                maxVal = Math.max(maxVal,count);

        }
        return maxVal;
    }
}