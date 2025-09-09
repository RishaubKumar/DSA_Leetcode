class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder("a");

        while (sb.length() < k) {
            int currentLength = sb.length();
            for (int i = 0; i < currentLength && sb.length() < k; i++) {
                char ch = (char)(sb.charAt(i) + 1);
                sb.append(ch);
            }
        }
        return sb.charAt(k - 1);
    }
}
