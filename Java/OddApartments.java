class OddApartments {
    public static void main(String[] args) {
        String s = "1234567";
        System.out.println(solve(s));
        System.out.println(isPalindrome(0));

    }

    private static String solve(String s) {
        String result = "";

        for (int i=0; i<s.length(); i++){
            int person = s.charAt(i)-'0';
            if((person & 1) == 1){
                result += person;
            }
        }
    /** 
        char[] schar = s.toCharArray();
        for (int i=0; i<schar.length; i++){
            int person = Character.getNumericValue(schar[i]);
            if((person & 1) == 1){                 // (person % 2 != 0)
            //    result += person;
            }
        }
    */    
        return result;
    }

    private static boolean isPalindrome(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        /**
        String s = Integer.toString(x);
        int n = s.length()-1;
        if(s.charAt(0) != s.charAt(n)){
            return false; 
           }
        return true; 
        */

        // More Optimized Approach
        int revertedNumber = 0;
        while(x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        return x == revertedNumber || x == revertedNumber/10;
    }
}