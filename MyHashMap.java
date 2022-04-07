class MyHashMap {
    class Node{
        int key;
        int value;
        Node next;
        public Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }
    Node[] array;
    /** Initialize your data structure here. */
    public MyHashMap() {
        array = new Node[10001];
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        int index = getIndex(key);
        Node head = array[index];
        Node node = head;
        while (node != null) {
            if (node.key == key) {
                node.value = value;
                return;
            }
            node = node.next;
        }
        Node newNode = new Node(key, value);
        newNode.next = head;
        array[index] = newNode;
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        int index = getIndex(key);
        Node node = array[index];
        while (node != null) {
            if (node.key == key) {
                return node.value;
            }
            node = node.next;
        }
        return -1;
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        int index = getIndex(key);
        Node node = array[index];
        while (node != null) {
            if (node.key == key) {
                node.value = -1;
                return;
            }
            node = node.next;
        }
    }
    
    private int getIndex(int key){
        return key % 10001;
    }
}
/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
