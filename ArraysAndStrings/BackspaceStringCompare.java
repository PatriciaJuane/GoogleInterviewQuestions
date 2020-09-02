class Solution {
    public boolean backspaceCompare(String S, String T) {
        return getString(S).equals(getString(T)); // O(N+M)
    }
    
    private String getString(String s) { 
        StringBuilder sb = new StringBuilder();
        char[] c = s.toCharArray();
        
        for(char ch: c) {
            if(ch == '#') {
                if(sb.length() != 0) {
                    sb.deleteCharAt(sb.length()-1);
                }
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    
}