package $2_Sorting.$2_5_applications;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by hailstone01 on 1/31/16.
 */
public class Ex8 {
    public static void stats(String[] arr) {
        class Node {
            private String data;
            private int count;

            public Node(String data, int count) {
                this.data = data;
                this.count = count;
            }
        }

        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String s : arr) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                map.put(s, map.get(s) + 1);
            }
        }

        Node[] nodes = new Node[map.size()];
        int i = 0;
        for (String key : map.keySet()) {
            nodes[i++] = new Node(key, map.get(key));
        }

        Arrays.sort(nodes, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return Integer.compare(o1.count, o2.count);
            }
        });

        for (int j = nodes.length - 1; j >= 0; j--) {
            System.out.println(nodes[j].data);
        }
    }

    public static void main(String[] args) {
        String[] arr = {"ad", "ad", "da", "ad", "df", "er", "df", "df", "df"};
        stats(arr);
    }
}
