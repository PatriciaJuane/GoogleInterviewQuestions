class Solution {
    public int maxDistToClosest(int[] seats) {
        int N = seats.length;
        int K = 0; // current longest group of empty seats
        int answer = 0;
        
        for(int i=0; i<N; i++) {
            if(seats[i]==1) {
                K = 0;
            } else {
                K++;
                answer = Math.max(answer, (K+1)/2);
            }
        }
        
        for(int i=0; i<N; i++) { //edge from left to right
            if(seats[i]==1) { // 1st person from the left
                answer = Math.max(answer, i);
                break;
            }
        }
        
        for(int i = N-1; i>=0; i--) { // edge from right to left
            if(seats[i]==1) { // 1st person from the right
                answer = Math.max(answer, N - 1 - i);
                break;
            }
        }
        return answer;
    }
}