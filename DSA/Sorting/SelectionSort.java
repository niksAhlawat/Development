import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 11, 2, 8};
        System.out.println(getMax(arr, 0, arr.length-1));
        System.out.println(largest(arr));
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static int largest(int[] arr){  
        int max = arr[0];  
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
     }

    public static void selectionsort(int[] arr) {
        for (int i=0; i < arr.length; i++){
            int last = arr.length -i -1;
            int maxIndex = getMax(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    private static int getMax(int[] arr, int start, int end) {
        int max = start;
        for (int i=start; i<= end; i++){
            if(arr[max]< arr[i]){
                max = i;
            }
        }
        return max;
    }
}
