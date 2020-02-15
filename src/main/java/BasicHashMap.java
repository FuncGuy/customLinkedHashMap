import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;
import java.util.stream.Collectors;


public class BasicHashMap<K, V> {

    private int initialCapacity = 16;
    private  Entry<K, V>[] bucket;
    private int size;

    public BasicHashMap(){
        bucket = new Entry[initialCapacity];
    }

    static class Entry<K, V> {
        K key;
        V value;
        Entry<K, V> next;

        public Entry(K key, V value){
            this.key = key;
            this.value = value;
        }
    }

    public void put(K key, V value) {
        int index = getHash(key);

        Entry<K, V> current = bucket[index];

        Entry<K, V> newEntry = new Entry(key, value);

        if (current == null) {
            bucket[index] = newEntry;
            size++;

        } else {

            while (current != null) {

                if (current.key.equals(key)) {
                    current.value = value;
                    return;
                }
                current = current.next;
            }

            current = bucket[index];
            while (current.next!=null){
                current = current.next;
            }
            current.next = newEntry;
            size++;
        }
    }


    public V get(K key) {
        int hash = getHash(key) ;
        Entry current = bucket[hash];

        // Bucket is identified by hashCode and traversed the bucket
        // till element is not found.
        while(current != null) {
            if(current.key.equals(key)) {
                return (V) current.value;
            }
            current = current.next;
        }
        return null;
    }


    private int getHash(K key) {
        return 5;
    }

    public String toString(){

        return Arrays
                .stream(bucket)
                .filter(Objects::nonNull)
                .map(entry -> entry.key+"=" + entry.value.toString())
                .collect(Collectors.joining(",","{","}"));
    }

    public int size() {
        return size;
    }
}
