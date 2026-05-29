class Solution {
    public int minElement(int[] nums) {
        for(int i = 0;i<nums.length;i++){
            int val = nums[i];
            int sum =0;
            while(val > 0){
                sum += val %10;
                val = val/10;
            }
            nums[i] = sum;
        }
        int minVal = Integer.MAX_VALUE;
        for(int i =0;i<nums.length;i++){
            if(minVal > nums[i]){
                minVal = nums[i];
            }
        }
        return minVal;
    }
}