package sorting;

public class InsertionSort {
    public static void main(String args[]){
        int arr[] = {2, 1, 98, 101, 8, 35, 67, 4};
 
        InsertionSort is = new InsertionSort();
        is.sort(arr);
 
        is.printArray(arr);
    }
    
    
    /*Function to sort array using insertion sort*/
    void sort(int arr[]){
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
 
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
          
        }
    }
 
    /* A utility function to print array of size n*/
    void printArray(int arr[]){
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
 
        System.out.println();
    }
}
