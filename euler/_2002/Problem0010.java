package euler._2002;

import static dev.utils.Algorithms.*;

public class Problem0010{
   public static void main(String[]args){
      long _i = System.currentTimeMillis();
      
      long sum=0;
      for(int i=2; i<2_000_000; i=nextPrime(i))
         sum+=i;
      
      System.out.println("Result: "+sum);
      System.out.println("Run time: "+(System.currentTimeMillis() - _i)+" ms");
   }
}// Result: 142913828922
// Run time: 1500 ms