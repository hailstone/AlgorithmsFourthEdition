package $3_Searching.$3_1_Symbol_tables;

/**
 * Created by hailstone01 on 2/2/16.
 */
public class Ex2_ArrayST {
    private String[] keys;
    private int[] vals;
    private int N;

    public Ex2_ArrayST() {
        this(3);
    }

    public Ex2_ArrayST(int initialSize) {
        keys = new String[initialSize];
        vals = new int[initialSize];
    }

    public void put(String key, int val) {
        keys[N] = key;
        vals[N] = val;
        N++;
    }

    public int get(String key) throws Exception {
        int index = findIndex(key);
        if (index == -1) {
            throw new Exception("no such key");
        }

        return vals[index];
    }

    public void delete(String key) {
        int index = findIndex(key);
        if (index == -1) {
            return;
        }
        for (int i = index; i + 1 < N; i++) {
            keys[i] = keys[i + 1];
            vals[i] = vals[i + 1];
        }
        N--;
    }

    public boolean contains(String key) {
        return findIndex(key) != -1;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public String min() {
        if (N == 0) {
            return null;
        }
        String min = keys[0];
        for (int i = 1; i < N; i++) {
            if (min.compareTo(keys[i]) > 0) {
                min = keys[i];
            }
        }
        return min;
    }

    public String max() {
        if (N == 0) {
            return null;
        }
        String max = keys[0];
        for (int i = 1; i < N; i++) {
            if (max.compareTo(keys[i]) < 0) {
                max = keys[i];
            }
        }
        return max;
    }

    private int findIndex(String key) {
        for (int i = 0; i < N; i++) {
            if (keys[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }
}
