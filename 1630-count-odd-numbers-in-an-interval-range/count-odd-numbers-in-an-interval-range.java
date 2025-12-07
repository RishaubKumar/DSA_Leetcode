class Solution {
    public int countOdds(int low, int high) {
        int odd =0;
        int num =0;
        if(low % 2 ==0  && high % 2 == 0){
           num = high - low ;
           odd = num/2;
        }
        else if(low % 2 == 1  && high % 2 == 1 || low % 2 == 0  && high % 2 == 1
        || low % 2 == 1  && high % 2 == 0){
           num = high - low ;
           odd = (num/2) + 1;
        }else{
            odd =0;
        }
        // for(int i = low ;i<=high;i++){
        //     if(i % 2 == 1){
        //         odd++;
        //     }
        // }
        return odd;
    }
}