package euler._2001;

import static dev.utils.Algorithms.*;

public class Problem0005{
   public static void main(String[]args){
      long _i = System.currentTimeMillis();
      
      System.out.println("Result: "+LCM(1, 2, 3, 4, 5, 6, 7, 8, 9,
         10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));
      System.out.println("Run time: "+(System.currentTimeMillis() - _i)+" ms");
   }
}// Result: 232792560
// Run time: 3 ms