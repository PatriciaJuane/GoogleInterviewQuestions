class Solution {
    public int[][] kClosest(int[][] points, int K) {
        int N = points.length;
        int[] distances = new int[N];
        for(int i = 0; i < N;  i++) {
            distances[i] = distance(points[i]); // calculate all distances
        }
        
        Arrays.sort(distances); // O(n log n) time and O(n) space complexity
        int distK = distances[K-1];
        
        int[][] answer = new int[K][2];
        int t = 0;
        for(int i=0; i<N; i++) {
            if(distance(points[i]) <= distK) { // return k closest points to (0,0)
                answer[t++] = points[i]; // add that point
            }
        }
        
        return answer;
    }

    public int distance(int[] point) {
        return point[0] * point[0] + point[1] * point[1]; // distance to 0
    }
    
}