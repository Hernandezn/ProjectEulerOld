package euler._2002;

import static dev.utils.Algorithms.*;

public class Problem0020{
   public static void main(String[]args){
      long _i = System.currentTimeMillis();
      
      String num = factorial(100).toString();
      int sum = 0;
      
      for(int i=0; i<num.length(); i++)
         sum += Character.digit(num.charAt(i), 10);
      
      System.out.println("Result: "+sum);
      System.out.println("Run time: "+(System.currentTimeMillis() - _i)+" ms");
   }
}// Result: 
// Run time: 1 ms