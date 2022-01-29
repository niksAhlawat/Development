package searching;
public class BinarySearch {
    public static void main(String[] args) {
        int []ascArr = {2, 5, 9, 18, 22, 39, 48, 67, 89, 99};
       // int []descArr = {99, 89, 67, 48, 39, 22, 18, 9, 5, 2};
        int target = 5;
        String ans = binarySearch(ascArr, target);
       // String ans = binarySearch(descArr, target);
        System.out.println(ans);
    }

    // Binary Search and Order Agnoistic Binary Search
    // Best Time Complexity O(1)
    // Worst Time Complexity O(LogN)
    static String binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;

        // check wether array is ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end){
            int mid = start + (end - start)/2;
            
            if (arr[mid] == target){
                return "Found at index: "+ mid;
            }

            if(isAsc){
                if (target < arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            
        }
        return "Not Found";
    }
}
