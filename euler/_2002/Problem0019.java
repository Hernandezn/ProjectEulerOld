package euler._2002;

import static dev.utils.Algorithms.*;

public class Problem0019{
   public static void main(String[]args){
      long _i = System.currentTimeMillis();
      
      int count = 0;
      int dayOfWeek = 1;
      
      int monthDays;
      int month = 1;
      int year = 1900;
      
      dayOfWeek += 366;
      dayOfWeek %= 7; // "1 January 1900 was a Monday
      year++;         // "How many Sundays fell on the first of the month ...
                      // "1 Jan ***1901*** to 31 Dec 2000?"
      do{
         do{
            switch(month){
               case 4:
               case 6:
               case 9:
               case 11:
                  monthDays = 30;
                  break;
               case 2:
                  monthDays = 28;
                  if(year%4 == 0 && (year%100 != 0 || year%400 == 0))
                     monthDays++;
                  break;
               default:
                  monthDays = 31;
            }
            
            if(dayOfWeek == 0)
               count++;
            
            dayOfWeek += monthDays;
            dayOfWeek %= 7;
            
            month++;
         }while(month<=12);
         
         month = 1;
         year++;
      }while(year < 2001);
      
      System.out.println("Result: "+count);
      System.out.println("Run time: "+(System.currentTimeMillis() - _i)+" ms");
   }
}// Result: 171
// Run time: 1 ms