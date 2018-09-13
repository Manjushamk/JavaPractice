import java.util.LinkedHashMap;

class LRUCache {
    private int capacity;
    private LinkedHashMap<Integer,Integer> hm;
    private int capacityCounter;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.capacityCounter = 0;
        hm = new LinkedHashMap<>();
    }

    public int get(int key) {
        if(this.hm.containsKey(key)){
            int val = this.hm.get(key);
            this.hm.remove(key);
            this.hm.put(key,val);
            return hm.get(key);
        }
        return -1;
    }

    public void put(int key, int value) {
        if(this.hm.containsKey(key)){
            this.hm.remove(key);
            this.hm.put(key,value);
        }
        else if(capacity > capacityCounter){
            if(!this.hm.containsKey(key)){
                this.hm.put(key,value);
                this.capacityCounter++;
            }
        }else{
            int removeKey = 0;
            for (int x: this.hm.keySet()) {
                removeKey = x;
                break;
            }
            this.hm.remove(removeKey);
            this.hm.put(key,value);

        }
    }
}
