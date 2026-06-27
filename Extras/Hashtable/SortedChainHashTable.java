public class SortedChainHashTable {

    // ===== Node Class =====
    static class Node {
        int key;
        String val;
        Node next;

        public Node(int key, String val) {
            this.key = key;
            this.val = val;
            this.next = null;
        }
    }

    // ===== Hashtable Class =====
    static class HashTable {
        Node[] ht;   // Hash table array
        int size;

        public HashTable(int size) {
            this.size = size;
            ht = new Node[size];
        }

        // ===== Hash Function =====
        public int hash(int key) {
            return key % size;   // Already given in instructions (assumed)
        }

        // ===== Insert Function (You will implement logic) =====
        public void insert(int key, String value) {

            int index = hash(key); 
            Node newNode = new Node(key, value);

            if(ht[index]==null){
                ht[index]=newNode;
                return;
            }
            if(ht[index].key==key){
                ht[index].val=value;
                return;
            }
            if(ht[index].key>key){
                newNode.next=ht[index];
                ht[index]=newNode;
                return;
            }
            Node curr=ht[index];
            Node prev=null;
            while(curr!=null && curr.key<key){
                if(curr.key==key){
                    curr.val=value;
                    return;
                }
                prev=curr;
                curr=curr.next;
            }
            prev.next=newNode;
            newNode.next=curr;
        }

        // ===== Print Hashtable =====
        public void print_HashTable() {
            for (int i = 0; i < size; i++) {
                System.out.print("Index " + i + ": ");
                Node temp = ht[i];
                while (temp != null) {
                    System.out.print("(" + temp.key + ", " + temp.val + ") -> ");
                    temp = temp.next;
                }
                System.out.println("null");
            }
        }
    }

    // ===== MAIN For Testing =====
    public static void main(String[] args) {

        HashTable table = new HashTable(5);

        // Sample initial values (like assignment example)
        table.insert(3, "CAT");
        table.insert(4, "EELS");
        table.insert(5, "LION");
        table.insert(2, "DOG");
        table.insert(9, "CROW");
        table.insert(27, "WOLF");
        table.insert(10, "FISH");
        table.insert(11, "OWL");

        table.print_HashTable();

        System.out.println("\nAfter insert(8, \"GOAT\"):");
        table.insert(8, "GOAT");
        table.print_HashTable();
    }
}