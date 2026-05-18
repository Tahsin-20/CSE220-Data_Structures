public class MaxHeap {
    private int[]maxHeap;
    private int size;
    private int capacity;

    public MaxHeap(int cap){
        capacity=cap;
        maxHeap=new int[capacity+1];
        size=0;
    }

    public void insert(int elem){
        if(size==maxHeap.length-1){
            System.out.println("Heap is full");
            return;
        }
        else{
            size+=1;
            maxHeap[size]=elem;
            swim();
        }
    }
    public void swim(){
        int child=size;
        int parent=child/2;
        while(parent>0 && maxHeap[parent]<maxHeap[child]){
            swap(child,parent);
            child=parent;
            parent=child/2;
        }
    }
    public void swap(int i, int j){
        int temp=maxHeap[i];
        maxHeap[i]=maxHeap[j];
        maxHeap[j]=temp;
    }
    public int extractMax(){
        if(size<=0){
            System.out.println("No elements to remove");
            return -1;
        }
        int temp=maxHeap[1];
        maxHeap[1]=maxHeap[size];
        maxHeap[size]=0;
        size--;
        sink();
        return temp;
    }
    public void sink(){
        int k=1;
        while(2*k<=size){
            int j=2*k;

            if(j<size && maxHeap[j+1]>maxHeap[j]){
                j++;
            }
            if(maxHeap[k]>=maxHeap[j]){
                break;
            }
            swap(k,j);
            k=j;
        }
    }
    public int[] maxheapSort(){
        int[]backup=maxHeap.clone();
        int ori=size;

        int[]sorted=new int[size];
        int indx=size-1;

        while(size>0){
            sorted[indx]=extractMax();
            indx--;
        }

        maxHeap=backup;
        size=ori;

        return sorted;
    }
    public void print(){
        for(int i=1; i<=size; i++){
            System.out.print(maxHeap[i]+" ");
        }
        System.out.println();
    }
}
