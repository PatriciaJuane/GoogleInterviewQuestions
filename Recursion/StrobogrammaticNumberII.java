class Solution {
    public List<String> findStrobogrammatic(int n) {
        return dfs(n, n);
    }
    
    private List<String> dfs(int m, int n) {
        List<String> res = new ArrayList<>();
        if (m == 0) return List.of("");
        if (m == 1) return List.of("0", "1", "8");
        
        List<String> tmp = dfs(m - 2, n);
        for (String s : tmp) {
            if (m != n) res.add("0" + s + "0");
            res.add("1" + s + "1");
            res.add("8" + s + "8");
            res.add("6" + s + "9");
            res.add("9" + s + "6");
        }
        return res;
    }
    
    
    /* public List<String> findStrobogrammatic(int n) { // Iterative
        List<String> res = n % 2 == 0 ? Arrays.asList("") : Arrays.asList("0","1","8");
        Map<String, String> m = new HashMap<>(){{
            put("1", "1");
            put("8", "8");
            put("6", "9");
            put("9", "6");
            put("0", "0");
        }};
        
        for(int i = (n%2 == 0) ? 1: 2; i<n; i+=2){
            List<String> temp = new ArrayList<>();
            for(String s: m.keySet()){
                for(String cur: res){
                    if(i != n-1 || s != "0"){
                       temp.add(s + cur + m.get(s));
                    }
                }
            }
           res = temp; 
        }
        return res;
    } */
}