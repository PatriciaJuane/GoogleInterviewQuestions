class Solution {
  
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int answer = 0; // length of biggest substring
        int i=0; // beginning substring 
        int j=0; // end substring
        
        while(i < n && j < n) {
            if(!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                answer = Math.max(answer, j - i); // compare previous bigger length with current length of substring
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return answer;
    }
}