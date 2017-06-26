package euler._2002;

import static dev.utils.Algorithms.*;

public class Problem0015{
   public static void main(String[]args){
      long _i = System.currentTimeMillis();
      
      int gridSize = 20;
      
      System.out.println("Result: "+nChooseK(2*gridSize, gridSize));
      System.out.println("Run time: "+(System.currentTimeMillis() - _i)+" ms");
   }
}// Result: 137846528820
// Run time: 16 ms