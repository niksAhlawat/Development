import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Reveresed_Palindrome_String {
    public static void main(String[] args) {
        String s = "Red Fox Smiling";
        System.out.println(isSubString(s, "Red"));
        System.out.println();
        System.out.println(reverseString(s.toCharArray()));
        System.out.println();
        System.out.println(recursiveReverse(s));
        System.out.println();
        maxOccurence(s);
      //  System.out.println((char)97);
      System.out.println();
      System.out.println(isPalindrome("10075001"));

    }

    private static boolean isSubString(String string, String sub){
        for(String word: string.split(" ")){
            if(word.equals(sub)){
                return true;
            }
        }
    //    if(string.contains(sub)){
    //        return true;
    //    }
        return false;
    }

    private static void maxOccurence(String s){
        Map <Character, Integer> max = new HashMap<>();
        for (int i=0; i<s.length();i++){
            if(s.charAt(i) == ' '){
                
            }
            if(max.containsKey(s.charAt(i))){
                max.put(s.charAt(i), max.get(s.charAt(i))+1);
            }else{
                max.put(s.charAt(i), 1);
            }  
        }
        if(max.containsKey(' ')){
            max.remove(' ');
        }
        
        int maxOccurence = Collections.max(max.values());
        for(Entry<Character, Integer> entry : max.entrySet()){
            if (entry.getValue() == maxOccurence){
                System.out.println(entry.getKey() + " = " + maxOccurence);
            }
        }
    }

    private static String recursiveReverse(String s){
        if ((s==null)||(s.length() <= 1)){
            return s;
        } else{
            return recursiveReverse(s.substring(1)) + s.charAt(0);
        }
    }

    private static String reverseString(char[] s) {
        int n = s.length -1;
        for (int i=0; i<n; n--, i++){
            char temp = s[i];
            s[i] = s[n];
            s[n] = temp;
        }
        return new String(s);
    }

    private static boolean isPalindrome(String s){
        int i = 0, n = s.length()-1;
       /**  while(i<n){
            if(s.charAt(i) != s.charAt(n)){
                return false; 
            }
            i++;
            n--;
        }
        */
        for(i=0; i<n; i++, n--){
            if(s.charAt(i) != s.charAt(n)){
                return false; 
            }
        }
        return true;
    }

    
}
