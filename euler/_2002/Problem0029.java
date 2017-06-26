package euler._2002;

import static dev.utils.Algorithms.*;
import java.util.ArrayList;
import java.math.BigInteger;

public class Problem0029{
   public static void main(String[]args){
      long _i = System.currentTimeMillis();
      
      ArrayList<BigInteger> nums = new ArrayList<BigInteger>();
      
      for(int i=2; i<=100; i++){
         for(int j=2; j<=100; j++){
            BigInteger k = new BigInteger(""+i).pow(j);
            
            if(!nums.contains(k))
               nums.add(k);
         }
      }
      
      System.out.println("Result: "+nums.size());
      System.out.println("Run time: "+(System.currentTimeMillis() - _i)+" ms");
   }
}// Result: 9183
// Run time: 4000 ms