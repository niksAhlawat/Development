package sorting;

public class QuickSort {
    public static void main(String[] args) {
        int [] arr = {2, 1, 98, 101, 8, 35, 67, 4};
        QuickSort qs = new QuickSort();
        qs.sort(arr, 0, arr.length - 1);
        qs.printArray(arr);
    }

    private void printArray(int[] arr) {
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    void sort(int[] arr, int low, int high){
        if(low < high){
            int point = partition(arr, low, high);

            sort(arr, low, point-1);
            sort(arr, point+1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        // pivot
    int pivot = arr[high];
     
    // Index of smaller element and
    // indicates the right position
    // of pivot found so far
    int i = (low - 1);
 
    for(int j = low; j <= high - 1; j++){
         
        // If current element is smaller
        // than the pivot
        if (arr[j] < pivot)
        {
             
            // Increment index of
            // smaller element
            i++;
            swap(arr, i, j);
        }
    }
    swap(arr, i + 1, high);
    return (i + 1);
}

void swap(int[] arr, int i, int j)
{
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

    
}
