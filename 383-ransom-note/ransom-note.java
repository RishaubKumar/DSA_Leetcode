class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        StringBuilder maga = new StringBuilder(magazine);
        
        for (int i = 0; i < ransomNote.length(); i++) {
            char currentChar = ransomNote.charAt(i);
            boolean found = false;
            
            for (int j = 0; j < maga.length(); j++) {
                if (maga.charAt(j) == currentChar) {
                    maga.deleteCharAt(j); 
                    found = true;
                    break; 
                }
            }
            
            if (!found) {
                return false; 
            }
        }
        
        return true;
    }
}