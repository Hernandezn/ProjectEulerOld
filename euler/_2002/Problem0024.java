package euler._2002;

import static dev.utils.Algorithms.*;

public class Problem0024{
   public static void main(String[]args){
      long _i = System.currentTimeMillis();
      
      StringBuilder digits = new StringBuilder("0123456789"); // permutation 0 is lexicographic 1st ...
      int limit = digits.length();
      int size = limit-1;
      int remainder = 1_000_000 - 1;
      StringBuilder result = new StringBuilder(limit);
      
      for(int i=0; i<limit; i++, size--){
         int perms = Integer.parseInt(""+factorial(size));// total permutations for each successive digit
         int index = remainder/perms;
         
         result.append(digits.charAt(index));
         digits.deleteCharAt(index);
         remainder %= perms;
      }
      
      System.out.println("Result: "+result);
      System.out.println("Run time: "+(System.currentTimeMillis() - _i)+" ms");
   }
}// Result: 2783915460
// Run time: 1 ms