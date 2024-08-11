package Stack;

public class LRUcache {
    
}

class LRUCache {
    HashMap<Integer, Integer> map = new HashMap<>();;
    Queue<Integer> queue = new LinkedList<>();
    int cap;
    public LRUCache(int capacity) {
        cap = capacity;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            queue.remove(key);
            queue.add(key);
            return map.get(key);
        }
        //System.out.println(queue);
        return -1;
    }
    
    public void put(int key, int value) {
        if(queue.size()==cap && !map.containsKey(key)){
            map.remove(queue.poll());   
            queue.add(key);
            map.put(key, value);
        }
        else{
            if(map.containsKey(key)){
                queue.remove(key);
            }
            queue.add(key);
            map.put(key, value);
        }
        
        //System.out.println(queue);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */