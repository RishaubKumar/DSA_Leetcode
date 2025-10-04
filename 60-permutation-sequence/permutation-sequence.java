class Solution {
    private static int[] fact = new int[10];
    public String getPermutation(int n, int k) {
        if (fact[0] == 0) {
            init_fact();
        }
        char[] permutation = new char[n];
        boolean[] isVisited = new boolean[10];
        getPermutationHelper(n, k, 0, isVisited, permutation);
        return new String(permutation);
    }
    public void getPermutationHelper(int n, int k, int l, boolean[] isVisited, char[] permutation) {
        int nPermutations = fact[n - l - 1];
        if (k == 1) {
            for (int i = 1; i <= n; i++) {
                if (isVisited[i]) {
                    continue;
                }
                permutation[l++] = (char) (i + '0');
            }
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (isVisited[i]) {
                continue;
            }
            if (k > nPermutations) {
                k -= nPermutations;
                continue;
            }
            isVisited[i] = true;
            permutation[l] = (char) (i + '0');
            getPermutationHelper(n, k, l + 1, isVisited, permutation);
            return;
        }
        return;
    }
    private static void init_fact() {
        fact[0] = 1;
        for (int i = 1; i < fact.length; i++) {
            fact[i] = i * fact[i - 1];
        }
    }
}