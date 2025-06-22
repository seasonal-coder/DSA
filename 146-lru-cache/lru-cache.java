import java.util.HashMap;
import java.util.Map;

class LRUCache {

    private class Node {
        int key, value;
        Node prev, next;
        Node(int k, int v) {
            key = k;
            value = v;
        }
    }

    private final int capacity;
    private final Map<Integer, Node> map;
    private final Node head, tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();

        head = new Node(0, 0); // dummy head
        tail = new Node(0, 0); // dummy tail

        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        Node node = map.get(key);
        if (node == null) return -1;

        // Move to front
        node.prev.next = node.next;
        node.next.prev = node.prev;

        node.next = head.next;
        head.next.prev = node;
        head.next = node;
        node.prev = head;

        return node.value;
    }

    public void put(int key, int value) {
        Node node = map.get(key);

        if (node != null) {
            node.value = value;

            // Move to front
            node.prev.next = node.next;
            node.next.prev = node.prev;
        } else {
            node = new Node(key, value);
            map.put(key, node);

            if (map.size() > capacity) {
                Node lru = tail.prev;

                // Remove from DLL
                lru.prev.next = tail;
                tail.prev = lru.prev;

                map.remove(lru.key);
            }
        }

        // Insert new or updated node at front
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
        node.prev = head;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */