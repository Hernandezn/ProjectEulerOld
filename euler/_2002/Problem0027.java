package euler._2002;

import static dev.utils.Algorithms.*;

public class Problem0027{
   public static void main(String[]args){
      long _i = System.currentTimeMillis();
      
      int a=0;
      int b=0;
      int max=0;
      
      for(int i=-999; i<1000; i++)
         for(int j=-999; j<1000; j++){
            int nums = sequenceCount(i, j);
            
            if(nums>max){
               max = nums;
               a = i;
               b = j;
            }
         }
      
      System.out.println("Result: "+a+"*"+b+" = "+(a*b));
      System.out.println("Run time: "+(System.currentTimeMillis() - _i)+" ms");
   }
   
   public static int sequenceCount(int x, int y){
      int count = 0;
      
      while(isPrime(count*count + count*x + y))
         count++;
      
      return count;
   }
}// Result: -61*971 = -59231
// Run time: 175 ms