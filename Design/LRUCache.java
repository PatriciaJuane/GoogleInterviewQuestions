class LRUCache {
    int capacity;
    List<Integer> queue;
    HashMap<Integer,Integer> map;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.queue = new ArrayList<>();
        this.map = new HashMap<>();
    }
    
    public int get(int key) {
        if(map.containsKey(key)) {
            queue.remove(queue.indexOf(key));
            queue.add(key);
            return map.get(key);
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)) { 
            queue.remove(queue.indexOf(key));
            queue.add(key);
            map.put(key,value);
        } else {
            if(capacity > 0){
                map.put(key,value);
                queue.add(key);
                capacity--;
            } else {
                int keyRemove = queue.remove(0);
                map.remove(keyRemove);
                map.put(key,value);
                queue.add(key);
            }
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */