class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                set.remove(nums[i - k - 1]);
            }
            if (!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}
        // int max = Integer.MIN_VALUE;
        // int min = Integer.MAX_VALUE;
        // for(int i =0;i<n;i++){
        //     if(max=<nums[i]){
        //         max = nums[i] ;
        //     }else{
        //         min = nums[i];
        //     }
        // }
        // int freq[] = new int[max-min+1];
        // for(int i =0;i<n;i++){
        //     freq[nums[i]-min]++;
        // }
        // int count =0;
        // for(int i = 0 ;i<freq.length;i++ ){
        //     count = freq[i];
        //     if(count =>2){

        //     }
        // }

