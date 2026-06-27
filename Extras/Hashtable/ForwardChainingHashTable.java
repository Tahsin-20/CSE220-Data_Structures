public class ForwardChainingHashTable {

    // ===== Node Class =====
    static class Node {
        String key;
        int val;
        Node next;

        public Node(String key, int val) {
            this.key = key;
            this.val = val;
            this.next = null;
        }
    }

    // ===== Hash Table Class =====
    static class HashTable {
        Node[] table;
        int size;

        public HashTable(int size) {
            this.size = size;
            table = new Node[size];
        }

        // ===== Hash Function =====
        // Simple hash function: add ASCII values and mod by size
        public int hash_Function(String key) {
            int sum = 0;
            for (int i = 0; i < key.length(); i++) {
                sum += key.charAt(i);
            }
            return sum % size;
        }
        public void print_HashTable() {
    for (int i = 0; i < size; i++) {
        System.out.print(i + ": ");
        Node temp = table[i];
        while (temp != null) {
            System.out.print("[" + temp.key + " , " + temp.val + "] -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}


        // ===== Insert Function (You will write the logic) =====
        public void insert_HashTable(String key, int value) {

            int index = hash_Function(key);
            Node hb=table[index];
            Node newNode=new Node(key, value);

            if(hb==null){
                table[index]=newNode;
                return;
            }
            Node current=hb;
            while(current!=null){
                if(current.key.equals(key)){
                    current.val=value;
                    return;
                }
                current=current.next;
            }
            if(value%2==0){
                newNode.next=table[index];
                table[index]=newNode;
            }
            else{
                current=hb;
                while(current.next!=null){
                    current=current.next;
                }
                current.next=newNode;
            }
        }
    }

    // ========== Main For Testing ==========
    public static void main(String[] args) {
        HashTable ht = new HashTable(10);

        // Example (You can test after writing insert logic)
        ht.insert_HashTable("Apple", 4);
        ht.insert_HashTable("Banana", 5);
        ht.insert_HashTable("Cherry", 8);
        ht.insert_HashTable("Orange", 3);
        ht.insert_HashTable("Persimon", 10);
        ht.insert_HashTable("Watermelon", 8);
        ht.print_HashTable();
    }
}
