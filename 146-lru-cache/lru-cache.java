class LRUCache {

    
        // we want nodes and get the capacity into the class
        //set node class

        //class Node(int key, int value) { -- this shit has to be in constructor

        class Node{
            int key, value;
            Node prev, next;
            Node(int k, int v){
                key = k;
                value = v;
            }
        }
        // this.capacity = capacity;
        // Node head, tail;
        // head.next = tail;
        // tail.prev = head;
        //--- this shit also done in constructor, we have to first define then assign

        private final int capacity;

        //fuck i forgot how to intiallise the MAP
        private final Map<Integer, Node> map;
        private Node head, tail;

        public LRUCache(int capacity){
            this.capacity = capacity;
            this.map = new HashMap<> (capacity); //fixing size lessgoo
            this.head = new Node(0,0);
            this.tail = new Node(0,0);

            head.next = tail;
            tail.prev = head;

        }

        
    
    
    public int get(int key) {

        // whats the logic, 
        //check if the node is present if not return -1, 
        //if it present get that
        // delete that node from there and place it at front--cache--

        // if(map.key == null) return -1;
        // else{
        //     //delete the node and place it in front
            
        // } -- wtf no node def in this method

        Node node = map.get(key);
        // we have define map suchaway that key is integer 
        //value is Node data type

        if(node==null) return -1;

        //--done with "get" logic but for lru, we have to placr it front
        //remove and plcae it front

        node.next.prev = node.prev;
        node.prev.next = node.next;
        // done with removal part and its time to place it first node.
        //means after head, and first node
        

        node.next = head.next;
        head.next.prev = node;
        head.next = node;    
        node.prev=head;
        //placig the node in front

        return node.value;
        


        
    }
    
    public void put(int key, int value) {
        //logic??
        //if the key already exists or not.
        //if the key exist del that and add this new value
        //else add this 
        //and bring this node to front

        //so if it present del the node, 
        //or else just staright add up the node at front

        Node node = map.get(key);

        if (node!=null){ 
            //checks for if already preseents if it do 
            //if do means we have to update the value 

            node.value = value;
            //and remove the node nopw
            
            node.next.prev = node.prev;
            node.prev.next = node.next;
        }

        else{

            //if the node is new set up the node from the key value.
            node = new Node(key, value);

            //once the node have the key and value map it
            // -------this generates the new "key" and node
            // -------the "key" is used here different from node"s key
            //above is wrong we r having the same key for map and node


            map.put(key, node);

            if (map.size()>capacity){
                Node lru = tail.prev;
                lru.prev.next=tail;
                tail.prev = lru.prev;

                map.remove(lru.key);
            }

        }

            //insert to front, even if we are creating or upadtign
            //node we have to place it to front
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