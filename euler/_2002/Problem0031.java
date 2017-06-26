package euler._2002;

import static dev.utils.Algorithms.*;

public class Problem0031{
   public static void main(String[]args){
      long _i = System.currentTimeMillis();
      
      final int[]COINS = {1, 2, 5, 10, 20, 50, 100, 200};
      final int LIMIT = 200;
      int[]result = {0};
      
      getSums(result, LIMIT, COINS);
      
      System.out.println("Result: "+result[0]);
      System.out.println("Run time: "+(System.currentTimeMillis() - _i)+" ms");
   }
   
   public static void getSums(int[]result, int limit, int[]coins){
      int[]lims = new int[coins.length];
      
      for(int i=0; i<coins.length; i++)
         lims[i] = LIMIT/COINS[i];
      
      
   }
   
   private static void doSums(int[]result, int limit, int[]coins, int[]lims, int index){
      
   }
}// Result: 
// Run time: 1 ms