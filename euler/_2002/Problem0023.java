package euler._2002;

import static dev.utils.Algorithms.*;

public class Problem0023{ // boolean list to represent numbers as opposed to actually storing ints ..
   public static void main(String[]args){
      long _i = System.currentTimeMillis();
      
      final int HARD_LIMIT = 28123;
      
      boolean[]abundants = new boolean[HARD_LIMIT+1];
      
      for(int i=1; i<=HARD_LIMIT; i++)
         abundants[i] = isAbundant(i);
      
      boolean[]abundantSums = new boolean[HARD_LIMIT+1];
      for(int i=1; i<=HARD_LIMIT; i++)
         for(int j=i; j<=HARD_LIMIT; j++){
            int sum = i+j;
            if(abundants[i] && abundants[j] && sum<=HARD_LIMIT)
               abundantSums[sum] = true;
         }
      
      int sum = 0;
      for(int i=1; i<=HARD_LIMIT; i++)
         if(!abundantSums[i])
            sum += i;
      
      System.out.println("Result: "+sum);
      System.out.println("Run time: "+(System.currentTimeMillis() - _i)+" ms");
   }
}// Result: 4179871
// Run time: 1613 ms