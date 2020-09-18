class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length == 0) return intervals;
        
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        
        List<int[]> list = new ArrayList();
        
        int[] referencia = intervals[0];
        int i = 1;
        
        while(i < intervals.length) {
            if(intervals[i][0] > referencia[1]) {
                list.add(referencia);
                referencia = intervals[i];
            } else {
                referencia[1] = Math.max(intervals[i][1], referencia[1]);
            }
            i++;
        }
        list.add(referencia);
        
        return list.toArray(new int[list.size()][]);
    }
}