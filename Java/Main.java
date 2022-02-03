/* Save this in a file called Main.java to compile and test it */

import java.util.*;
//import java.io.*;

public class Main {
    public static int processArray(ArrayList<Integer> array) {

        ListIterator<Integer>iterator = array.listIterator();
        while (iterator.hasNext()) {
            Integer integer = (Integer) iterator.next();
            int count=0;
            if (integer >= 10 && integer <=99) {
                if(iterator.previous() < integer){
                    iterator.remove();
                }
                count=count +1;
                continue;
            }
            else
                iterator.previous();
                iterator.add(count);
                iterator.next();
            }
       
        return array.size();
    }

    public static void main (String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()) {
            int num = in.nextInt();
            if (num < 0) 
                break;
            arrayList.add(Integer.valueOf(num));
        }
        int new_length = processArray(arrayList);
        for(int i=0; i<new_length; i++)
            System.out.println(arrayList.get(i));
    }
}
