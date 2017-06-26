package euler._2002;

import static dev.utils.Algorithms.*;
import java.util.ArrayList;

public class Problem0030{
   public static void main(String[]args){
      long _i = System.currentTimeMillis();
      
      final int LIMIT = 6*9*9*9*9*9+1;
      ArrayList<Integer> nums = new ArrayList<Integer>();
      
      for(int i=10; i<LIMIT; i++){
         String s = ""+i;
         int len = s.length();
         int sum = 0;
         
         for(int j=0; j<len; j++){
            int x = Integer.parseInt(s.charAt(j)+"");
            
            sum += x*x*x*x*x;
         }
         
         if(sum==i)
            nums.add(i);
      }
      
      int result = 0;
      for(int i=0; i<nums.size(); i++){
         result += nums.get(i);
      }
      
      System.out.println("Result: "+result);
      System.out.println("Run time: "+(System.currentTimeMillis() - _i)+" ms");
   }
}// Result: 443839
// Run time: 300 ms