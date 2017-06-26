package euler._2002;

import static dev.utils.Algorithms.*;

public class Problem0012{
   public static void main(String[]args){
      long _i = System.currentTimeMillis();
      
      int counter=1;
      int result=0;
      do{
         result += counter++;
      }while(factorCount(result) <= 500);
      
      System.out.println("Result: "+result);
      System.out.println("Run time: "+(System.currentTimeMillis() - _i)+" ms");
   }
   
   public static int factorCount(int num){
      return factorsOf(num).length;
   }
}// Result: 76576500
// Run time: 1140 ms