class Solution {
    public String findReplaceString(String S, int[] indexes, String[] sources, String[] targets) {
        int N = S.length();
        int[] match = new int[N]; // [-1,-1,-1,-1,-1,-1,...,-1]
        Arrays.fill(match, -1);
        
        for(int i=0; i<indexes.length; i++) {
            int ix = indexes[i]; // 0
            if(S.substring(ix, ix + sources[i].length()).equals(sources[i]))
                match[ix] = i;
        }
        
        StringBuilder answer = new StringBuilder();
        int index = 0;
        while(index < N) {
            if(match[index]>=0) {
                answer.append(targets[match[index]]);
                index += sources[match[index]].length();
            } else {
                answer.append(S.charAt(index++));
            }
        }
        
        return answer.toString();
    }
}