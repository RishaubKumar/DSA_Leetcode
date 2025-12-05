class Solution {
    public int countPartitions(int[] nums) {
        int i =0;
        int result =0;
        int leftSum =0;
        int rightSum =0;
        while(i<nums.length-1){
            leftSum = sumArr(0,i,nums);
            rightSum = sumArr(i+1,nums.length-1,nums);
            int difference = leftSum - rightSum;
            if(difference % 2 == 0){
                result++;
            }
            i++;
        }
        return result;
    }
    static int sumArr(int si , int ei , int[] nums){
        int Sum =0;
        for(int i = si;i<= ei;i++){
            Sum += nums[i];
        }
        return Sum;
    }
}