class Solution {
    public int findGCD(int[] nums) {
        int mx = Integer.MIN_VALUE;
        int mn = Integer.MAX_VALUE;
        for(int i =0;i<nums.length;i++){
            mx = Math.max(mx,nums[i]);
            mn = Math.min(mn,nums[i]);
        }
            int result = gcd(mx,mn);
            return result;
    }
    public int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a, a);
    }
}