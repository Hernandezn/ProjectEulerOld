package euler._2002;

import static dev.utils.Algorithms.*;

public class Problem0028{
   public static void main(String[]args){
      long _i = System.currentTimeMillis();
      
      
      
      System.out.println("Result: "+sumOfDiagonalsOfSquareOfDimension(1001));
      System.out.println("Run time: "+(System.currentTimeMillis() - _i)+" ms");
   }
   
   public static long sumOfDiagonalsOfSquareOfDimension(int x){
      return (long)(Math.round(x*x*x*2.0/3.0 + x*x/2.0 + x*4.0/3.0 - 3.0/2.0));
   } // (2/3)x^3 + (1/2)x^2 + (4/3)x - 3/2
}// Result: 669171001
// Run time: 1 ms