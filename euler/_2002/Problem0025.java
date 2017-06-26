package euler._2002;

import static dev.utils.Algorithms.*;
import java.math.BigInteger;

public class Problem0025{
   public static void main(String[]args){
      long _i = System.currentTimeMillis();
      
      BigInteger[]fibs =new BigInteger[]{
         new BigInteger("1"), new BigInteger("1"), null };
      int index = 2;
      
      do{
         fibs[2] = fibs[1].add(fibs[0]);
         fibs[0] = fibs[1];
         fibs[1] = fibs[2];
         
         index++;
      }while(fibs[1].toString().length() < 1000);
      
      System.out.println("Result: "+index);
      System.out.println("Run time: "+(System.currentTimeMillis() - _i)+" ms");
   }
}// Result: 4782
// Run time: 444 ms