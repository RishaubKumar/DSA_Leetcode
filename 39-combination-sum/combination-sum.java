import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> current, int[] candidates, int remain, int start) {
        if (remain < 0) {
            return; // Stop if remaining target is negative
        }
        if (remain == 0) {
            result.add(new ArrayList<>(current)); // Valid combination found
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            current.add(candidates[i]); // Try including the current candidate
            backtrack(result, current, candidates, remain - candidates[i], i); // Reuse same element
            current.remove(current.size() - 1); // Backtrack (remove last candidate)
        }
    }
}
// class Solution {
//     public List<List<Integer>> combinationSum(int[] candidates, int target) {
//         List<List<Integer>> list = new ArrayList<>();
//         int n = candidates.length;
//         for(int i = 0;i<n;i++){
//             for(int j = i;j<n;j++){
//                 int combSum = 0;
//                 for(int k = i;k<=j;k++){
//                     combSum += cnadidates[k];
//                     if(combSum == target){

//                     }
//                 }
//             }
//         }
//     }
// }