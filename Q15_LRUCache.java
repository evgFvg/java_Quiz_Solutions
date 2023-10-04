import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V> {
    private final LinkedHashMap<K,V> cacheMap;
    private final int CAPACITY;
    private final float DEF_LOAD_FACTOR = 0.75f;
    public LRUCache(int initCapacity){
        this.CAPACITY = initCapacity;
        cacheMap = new LinkedHashMap<>(initCapacity, DEF_LOAD_FACTOR, true) { //Anonymus class for NOT abstract class 
            @Override
            public boolean removeEldestEntry(Map.Entry<K,V> entry) { //protected method
                return cacheMap.size() > CAPACITY;
            }
        };
    }

    public V get(K key) {
        return cacheMap.get(key);
    }
    public void put(K key, V val) {
        cacheMap.put(key, val);
    }

    public void printAll() {
        for(K k: cacheMap.keySet()) {
            System.out.println("Key :" + k.toString());
        }
    }
}

class Solution {
    public static void main(String[] args) {

        LRUCache<String, Integer> lruc = new LRUCache<>(3);
        lruc.put("Vova", 1);
        lruc.put("Alex", 2);
        lruc.put("Mia", 3);
        lruc.put("Nick", 16);
        lruc.printAll(); // Vova doesn't exist any longer
    }
}
