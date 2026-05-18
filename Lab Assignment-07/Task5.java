public class Task5 {

    public static String[] tasktimer(String[]task_names, int[]prio){
        MaxHeapTask heap=new MaxHeapTask(prio.length);

        for(int i=0; i<prio.length; i++){
            heap.insert(new Task(task_names[i],prio[i]));
        }
        String[]final_ans=new String[prio.length];
        for(int i=0; i<final_ans.length; i++){
            final_ans[i]=heap.extractMax().tasks;
        }
        return final_ans;
    }
    public static void main(String[]args){

        String [] task_names={"Email", "Meeting", "Code Review", "Lunch", "Debug"};
        int [] priorities={2, 5, 3, 1, 4};

        String[]answer=tasktimer(task_names,priorities);
        System.out.print("[");
        for(int i=0; i<answer.length; i++){
            System.out.print(answer[i]);
            if(i<answer.length-1){
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }    
}
