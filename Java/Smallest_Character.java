public class Smallest_Character {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j', 's'};
        char target = 'h';
        char ans = smallest_character(letters, target);
        System.out.println(ans);
    }

    static char smallest_character(char [] letters, char target){
        int start = 0;
        int end = letters.length -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target > letters[mid]){
                start = mid + 1;
            } else {
                end = end - 1;
            }
        }
       // return  start == letters.length ?letters[0]:letters[start];
        return letters[start % letters.length];
    }
}
