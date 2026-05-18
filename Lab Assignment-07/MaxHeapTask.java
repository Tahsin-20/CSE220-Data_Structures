class MaxHeapTask {
    private Task[]maxHeap;
    private int size;
    private int capacity;

    public MaxHeapTask(int cap){
        capacity=cap;
        maxHeap=new Task[capacity+1];
        size=0;
    }

    public void insert(Task elem){
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
        while(parent>0 && maxHeap[parent].prio<maxHeap[child].prio){
            swap(child,parent);
            child=parent;
            parent=child/2;
        }
    }
    public void swap(int i, int j){
        Task temp=maxHeap[i];
        maxHeap[i]=maxHeap[j];
        maxHeap[j]=temp;
    }
    public Task extractMax(){
        if(size<=0){
            System.out.println("No elements to remove");
            return null;
        }
        Task temp=maxHeap[1];
        maxHeap[1]=maxHeap[size];
        maxHeap[size]=null;
        size--;
        sink();
        return temp;
    }
    public void sink(){
        int k=1;
        while(2*k<=size){
            int j=2*k;

            if(j<size && maxHeap[j+1].prio>maxHeap[j].prio){
                j++;
            }
            if(maxHeap[k].prio>=maxHeap[j].prio){
                break;
            }
            swap(k,j);
            k=j;
        }
    }
    public Task[] maxheapSort(){
        Task[]backup=maxHeap.clone();
        int ori=size;

        Task[]sorted=new Task[size];
        int indx=size-1;

        while(size>0){
            sorted[indx]=extractMax();
            indx--;
        }

        maxHeap=backup;
        size=ori;

        return sorted;
    }
    public boolean isEmpty(){
        if(size==0){
            return true;
        }
        return false;
    }
    public void print(){
        for(int i=1; i<=size; i++){
            System.out.print(maxHeap[i]+" ");
        }
        System.out.println();
    }  
}
