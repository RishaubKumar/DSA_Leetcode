class Solution {
    public int sumOfUnique(int[] nums) {
          int n = nums.length;
        int sum = 0;
        int freq[] = new int[101];
        for(int i =0;i<n;i++){
            freq[nums[i]]++;
        }
        for(int i =0;i<freq.length;i++){
            if(freq[i]==1){
                sum +=i;
            }
        }return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i = 0 ;i<n;i++){
            nums[i] = sc.nextInt();
        }
    Solution sol = new Solution();
    System.out.println(sol.sumOfUnique(nums));
    }
}