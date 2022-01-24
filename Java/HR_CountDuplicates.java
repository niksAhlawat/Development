
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HR_CountDuplicates {
    public static void main(String args[]){
        int arr[]={20,20,20,30,40,50,50,60,90,80,90,100};
        int[] duplicates = countDuplicates(arr);
        System.out.println(Arrays.toString(duplicates));
     }

    private static int[] countDuplicates(int[] arr){
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (int i=0; i< arr.length; i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
            } else {
                duplicates.add(arr[i]);
            }
        }
        return duplicates.stream().mapToInt(i -> i).toArray();  
    } 
}
