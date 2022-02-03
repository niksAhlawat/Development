import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;


public class Friday13th {
    public static void main(String []args){
        int count = 0;
        LocalDateTime ldt = LocalDateTime.of(2001,Month.JANUARY,13,0,0,0,0);
        while(ldt.getYear() <= 2099) { //stop after 2030
          
          if (ldt.getDayOfWeek() == DayOfWeek.FRIDAY) {
              count ++;
            System.out.println("Friday the 13th is on " + ldt);
            System.out.println(count);
          }
          ldt = ldt.plusMonths(1); 
        }
      }
}
