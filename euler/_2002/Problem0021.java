package euler._2002;

import static dev.utils.Algorithms.*;

public class Problem0021{
   public static void main(String[]args){
      long _i = System.currentTimeMillis();
      
      int sum = 0;
      for(int i=1; i<10000; i++)
         if(isAmicable(i))
            sum += i;
      
      System.out.println("Result: "+sum);
      System.out.println("Run time: "+(System.currentTimeMillis() - _i)+" ms");
   }
}// Result: 31626
// Run time: 100 ms