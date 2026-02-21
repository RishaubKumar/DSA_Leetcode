class Solution {
    public int countPrimeSetBits(int left, int right) {
        int i = left;
        int count =0;
        while(i<=right){
            String s = Integer.toBinaryString(i);
            int oneCount = 0;
            for(int j = 0;j<s.length();j++){
                if(s.charAt(j) == '1'){
                    oneCount++;
                }
            }
            boolean isPrime = true;
            if(oneCount <= 1) isPrime = false;
            for(int j = 2;j<oneCount;j++){
                if(oneCount % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime == true){
                count++;
            }
            i++;
        }
        return count;
    }
}