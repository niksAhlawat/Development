//import java.util.Arrays;

public class StringVowels {
    public static void main(String[] args) {
        String s = "Hello your name is Illa.";
        System.out.println(findVowels(s.toLowerCase()));
    }

    public static int findVowels(String s) {
        int count = 0;
    /*    char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (int i=0; i<s.length(); i++){
            for (int j=0; j<vowels.length; j++){
                if (s.charAt(i) == vowels[j]){
                    count++;
                }
            }   
        }
    */    
        for (int i =0; i<s.length(); i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                count++;
            }
        }
        return count;
    }
}
