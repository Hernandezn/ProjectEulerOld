package euler._2001;

import static dev.utils.Algorithms.*;
import java.util.Arrays;

public class Problem0003{
   public static void main(String[]args){
      long a = System.currentTimeMillis();
      
      long[]factors = primeFactorizationOf(600851475143L);
      Arrays.sort(factors);
      
      System.out.println("Result: "+factors[factors.length-1]);
      System.out.println("Run time: "+(System.currentTimeMillis() - a)+" ms");
   }
}// Result: 6857
// Run time: 11 ms