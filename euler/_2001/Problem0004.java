package euler._2001;

import static dev.utils.Algorithms.*;

public class Problem0004{
   public static void main(String[]args){
      long a = System.currentTimeMillis();
      int result = 0;
      
      for(int x = 999; x > 99; x--){
         for(int y = 999; y > 99; y--){
            int num = x*y;
            if(num>result && isPalindrome(num+""))
               result = num;
         }
      }
      
      System.out.println("Result: "+result);
      System.out.println("Run time: "+(System.currentTimeMillis() - a)+" ms");
   }
}// Result: 906609
// Run time: 31 ms