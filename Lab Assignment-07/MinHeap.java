public class MinHeap {
    private int[] minHeap;
    private int size;
    private int capacity;

    public MinHeap(int cap){
        capacity = cap;
        minHeap = new int[capacity + 1];
        size = 0;
    }

    public void insert(int elem){
        if(size == minHeap.length - 1){
            System.out.println("Heap is full");
            return;
        }
        size++;
        minHeap[size] = elem;
        swim();
    }

    private void swim(){
        int child = size;
        int parent = child / 2;
        while(parent > 0 && minHeap[parent] > minHeap[child]){
            swap(child, parent);
            child = parent;
            parent = child / 2;
        }
    }

    private void swap(int i, int j){
        int temp = minHeap[i];
        minHeap[i] = minHeap[j];
        minHeap[j] = temp;
    }

    public int extractMin(){
        if(size <= 0){
            System.out.println("No elements to remove");
            return -1;
        }
        int min = minHeap[1];
        minHeap[1] = minHeap[size];
        size--;
        sink();
        return min;
    }

    private void sink(){
        int k = 1;
        while(2 * k <= size){
            int j = 2 * k;

            if(j < size && minHeap[j + 1] < minHeap[j]){
                j++; // choose smaller child
            }
            if(minHeap[k] <= minHeap[j]){
                break;
            }
            swap(k, j);
            k = j;
        }
    }

    public int[] minheapSort(){
        int[] backup = minHeap.clone();
        int originalSize = size;

        int[] sorted = new int[size];
        int idx = size-1;

        while(size > 0){
            sorted[idx] = extractMin();
            idx--;
        }

        minHeap = backup;
        size = originalSize;

        return sorted;
    }

    public void print(){
        for(int i = 1; i <= size; i++){
            System.out.print(minHeap[i] + " ");
        }
        System.out.println();
    }
}
