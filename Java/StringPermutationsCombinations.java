import java.util.Scanner;

public class StringPermutationsCombinations {
   public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) {
        String result = sc.nextLine();

           StringPermutationsCombinations sp = new StringPermutationsCombinations();
           sp.permute(result, 0, result.length()-1);
           sp.distinctPermute(result, "");
           sp.combination(result,-1, "");
    } 
   } 

   private void permute(String s, int l, int r){
       if(l==r){
           System.out.println(s);
       } else {
           for (int i=l; i<= r; i++){
               s = swap(s, l, i);
               permute(s, l+1, r);
               s = swap(s, l, i);
           }
       }
   }

   private String swap(String s, int l, int  r){
       char temp;
       char[] c = s.toCharArray();
       temp = c[l];
       c[l] = c[r];
       c[r] = temp;
       return String.valueOf(c);
   }

   private void distinctPermute( String s, String result){
       if(s.length()==0){
           System.out.println(result +" ");
           return;
       }
       for( int i=0; i<s.length(); i++){
           char c = s.charAt(i);
           String left_sub = s.substring(0, i);
           String right_sub = s.substring(i+1);
           String rest = left_sub + right_sub;
           distinctPermute(rest, result+c);
       }
   }


   // Power Set of a String or all possible combinations of a String
   private void combination( String s, int index, String output){
       if (s.length() == index){
           return;
    }
    System.out.println(output);
    for (int i=index+1; i<s.length(); i++){
        output+=s.charAt(i);
        combination(s, i, output);
        output = output.substring(0, output.length() - 1);
       }
   }
}
