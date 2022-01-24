import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }  
       

    public static void bubbleSort(int[] arr) {
        boolean swapped;
       for (int i=0; i<arr.length; i++){
           swapped = false;
            for (int j=0; j<arr.length -i -1; j++){
                
                if(arr[j] > arr[j +1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
