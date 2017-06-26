package euler._2001;

import static dev.utils.Algorithms.*;

public class Problem0007{
   public static void main(String[]args){
      long _i = System.currentTimeMillis();
      
      int result = 0;
      for(int i = 0; i<10001; i++)
         result = nextPrime(result);
      
      System.out.println("Result: "+result);
      System.out.println("Run time: "+(System.currentTimeMillis() - _i)+" ms");
   }
}// Result: 104743
// Run time: 36 ms