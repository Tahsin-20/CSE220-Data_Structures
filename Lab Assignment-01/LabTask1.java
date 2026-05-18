//Lab Task 01: Merge Sorted Array
public class LabTask1{

    //Complete this method so that it gives the Expected Output
    //NO NEED TO SUBMIT LAB TASKS
    public static Integer[] mergeSortedArray( Integer[] arr1, Integer[] arr2 ){

        Integer [] merged =new Integer[arr1.length+arr2.length];
        int c1=0;
        int c2=0;
        int k=0;

        while(c1<arr1.length && c2<arr2.length){
            if(arr1[c1]<arr2[c2]){
                merged[k]=arr1[c1];
                c1++;
                k++;
            }
            else{
                merged[k]=arr2[c2];
                c2++;
                k++;
            }
        }
        while(c1<arr1.length){
            merged[k]=arr1[c1];
            k++;
            c1++;
        }
        while(c2<arr2.length){
            merged[k]=arr2[c2];
            k++;
            c2++;
        }
        return merged;
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[] a1 = {1, 2, 3};
        Integer[] a2 = {2, 5, 6};
        System.out.print("Array 1: ");
        Arr.print(a1);
        System.out.print("Array 2: ");
        Arr.print(a2);
        System.out.println("Expected Output: [ 1 2 2 3 5 6 ]");
        Integer[] returned_val_1 = mergeSortedArray(a1, a2);
        System.out.print("Your Output: ");
        Arr.print(returned_val_1);
        System.out.print("\n======================\n");
        Integer[] a3 = {1, 3, 5, 11};
        Integer[] a4 = {2, 7, 8};
        System.out.print("\nArray 3: ");
        Arr.print(a3);
        System.out.print("Array 4: ");
        Arr.print(a4);
        System.out.println("Expected Output: [ 1 2 3 5 7 8 11 ]");
        Integer[] returned_val_2 = mergeSortedArray( a3, a4);
        System.out.print("Your Output: ");
        Arr.print(returned_val_2);
    }
}
