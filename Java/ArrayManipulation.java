import java.util.Arrays;

public class ArrayManipulation {
    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(reversedArray(n)));
    }

    static int[] reversedArray(int[] n){
        int j = n.length;
        int re[] = new int[j];
        for (int i=0; i<n.length; i++){
            re[i] = n[j-1];
            j--;
        }
        return re;
    }
}
