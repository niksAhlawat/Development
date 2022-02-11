import java.util.Arrays;

public class ReversedString {
    public static void main(String[] args) {
        String str = "Sun is hot";
        System.out.println("LENGTH "+str.length());
        System.out.println(reversedString(str));
    }

    private static String reversedString(String str){
        String[] temp = str.split(" ");
        String s = "";

        System.out.println(Arrays.toString(temp));

        for(int i = temp.length-1; i>=0; i--){
            s += temp[i] + " ";

        }
        System.out.println();
        return s.substring(0, s.length() - 1);
    }
}
