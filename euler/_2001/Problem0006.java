package euler._2001;

import static dev.utils.Algorithms.*;

public class Problem0006{
   public static void main(String[]args){
      long _i = System.currentTimeMillis();
      
      int[]nums = new int[100];
      int sumOfSquares = 0;
      int sum = 0;
      for(int i = 0; i<nums.length; i++){
         nums[i] = i+1;
         sum += nums[i];
         sumOfSquares += nums[i]*nums[i];
      }
      
      System.out.println("Result: "+(sum*sum - sumOfSquares));
      System.out.println("Run time: "+(System.currentTimeMillis() - _i)+" ms");
   }
}// Result: 25164150
// Run time: 1 ms