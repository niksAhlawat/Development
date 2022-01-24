;
public class Ceiling_Floor_Number {
    public static void main(String[] args) {
        int []arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 28;
        String ans1 = ceiling(arr, target);
        String ans2 = floor(arr, 1);
        System.out.println(ans1);
        System.out.println(ans2);
    }

    // To find ceiling, we have to find the smallest element in array that is equal or greater than to target
    static String ceiling(int []arr, int target){
        int start = 0;
        int end = arr.length -1;
        if (target > arr[end]){
            return "NONE";
        }

        while (start <= end){
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            } else {
                return "Target: "+ target  + " is found at index: " +mid;
            }
        }
        return "Target: "+ arr[start] + " is found at index: " +start;
    }

    static String floor(int []arr, int target){
        int start = 0;
        int end = arr.length -1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            } else {
                return "Target: "+ arr[mid] + " is found at index: " +mid;
            }
        }
        return "Target: "+ target + " is found at index: " +end;
    }
}
