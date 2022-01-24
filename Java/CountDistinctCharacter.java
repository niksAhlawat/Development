import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountDistinctCharacter {
   public static void main(String[] args) {
       String s = "Harrypotter is my fav movie";
       System.out.println(countDistinctCharacter(s));
       System.out.println(countDistinctWords(s));
       System.out.println(countWords(s));
       System.out.println(Arrays.toString(stringtoArray(s)));  //Without split method
   } 

   private static int countDistinctCharacter(String s){
       //Set<Character> set = new HashSet();
       String unique ="";
       for (int i = 0; i < s.length(); i++) {
           if(unique.indexOf(s.charAt(i)) == -1){
               unique += s.charAt(i);
            }
      }
    return unique.length();
   }

   private static int countDistinctWords(String s){
       Set<String> set = new HashSet<String>();
       String[] words = s.split(" ");

      
       for (int i=0; i<words.length; i++){
           set.add(words[i]);
       }
       return set.size();
   }

   private static int countWords(String s){
       int count = 1;
      
       for (int i=0; i<s.length(); i++){
           if(s.charAt(i) == ' ' && s.charAt(i+1) != ' '){
               count++;
           }
       }
       return count;
   }



   private static String[] stringtoArray(String s){
    ArrayList<String> str = new ArrayList<String>();
    int begin = 0; 
    int end = 0;
    for(int i = 0; i<s.length(); i++){
     if (s.charAt(i) == ' ' && s.charAt(i+1) != ' ') {              //Character.isWhitespace(s.charAt(i))
         end = i;
         str.add(s.substring(begin, end));
         begin = i+1;
       }
     if(i == s.length()-1){
         end = s.length();
         str.add(s.substring(begin, end));
     }
    }
   // String[] sd = str.toArray(new String[str.size()]);
    //System.out.println(Arrays.toString(sd));
    return str.toArray(new String[str.size()]);
   }


   
}
