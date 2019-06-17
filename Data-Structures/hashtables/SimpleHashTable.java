package hashtables;

public class SimpleHashTable<V> {

    private V[] hashTable;

    public SimpleHashTable() {
        hashTable = (V[]) new Object[10];
    }

    // Replace this method to generate hash key without any collisions
    private int hashKey(String key) {
        return key.length() % hashTable.length;
    }

    public void put(String key, V element) {
        int hashedKey = hashKey(key);
        if (hashTable[hashedKey] != null) {
            System.out.println("Element already present at position " + hashedKey);
        } else {
            hashTable[hashedKey] = element;
        }
    }

    public V get(String key) {
        return hashTable[hashKey(key)];
    }

    public void printHashtable() {
        for (int i = 0; i < hashTable.length; i++) {
            System.out.println(hashTable[i]);
        }
    }
}