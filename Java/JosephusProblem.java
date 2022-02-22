import java.util.ArrayList;
import java.util.List;

class JosephusProblem {
    public static void main(String[] args) {
        System.out.println("The Living Legend is at position : " + livingLegend(8));
    }

    private static int livingLegend(int n) {
  
        //replace with number of soldiers manually or using any other input method
        int survivingPosition;
        List<Integer> positions = new ArrayList<>();
      
        //fill up the positions array
        for (int position = 1; position <= n; position++) {
          positions.add(position);
        }
      
        //start eliminating
        int eliminatorPosition = 0;
        int eliminatedPosition = 1;
        while (positions.size() != 1) {
          if (eliminatorPosition < (positions.size() - 2)) {
            eliminatedPosition = eliminatorPosition + 1;
            eliminatorPosition = eliminatedPosition;
          }
      
          //eliminator is second last element
          else if (eliminatorPosition == (positions.size() - 2)) {
            eliminatedPosition = eliminatorPosition + 1;
            eliminatorPosition = 0;
          }
      
          //eliminator is last element
          else if (eliminatorPosition == (positions.size() - 1)) {
            eliminatedPosition = 0;
            eliminatorPosition = eliminatedPosition;
          }
      
          positions.remove(eliminatedPosition);
        }
      
        survivingPosition = positions.get(0);
      
        return survivingPosition;
      }
}