package euler._2002;

import static dev.utils.Algorithms.*;
import java.math.BigInteger;

public class Problem0016{
   public static void main(String[]args){
      long _i = System.currentTimeMillis();
      
      String num = new BigInteger("2").pow(1000).toString();
      int result=0;
      
      for(int i=0; i<num.length(); i++)
         result += Character.digit(num.charAt(i), 10);
      
      System.out.println("Result: "+result);
      System.out.println("Run time: "+(System.currentTimeMillis() - _i)+" ms");
   }
}// Result: 1366
// Run time: 1 ms