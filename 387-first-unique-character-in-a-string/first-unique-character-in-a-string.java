class Solution {
    public int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            boolean isUnique = true;
            char currentChar = s.charAt(i);
            
            for (int j = 0; j < s.length(); j++) {
                if (i != j && currentChar == s.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            
            if (isUnique) {
                return i;
            }
        }
        return -1;
    }
}