import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sol[] = new int[2];
        for(int i =0;i<nums.length;i++){
            for(int j =0;j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    if(i != j){
                    sol[0] = j;
                    sol[1] = i;
                    }
                }
            }
        }
        return sol;
    }
}