package euler._2002;

import static dev.utils.Algorithms.*;

public class Problem0014{
   public static void main(String[]args){
      long _i = System.currentTimeMillis();
      
      int result = 1;
      int max = 1;
      int terms;
      
      for(int i=1; i<1_000_000; i++){
         terms = collatzTerms(i);
         
         if(terms > max){
            max = terms;
            result = i;
         }
      }
      
      System.out.println("Result: "+result);
      System.out.println("Run time: "+(System.currentTimeMillis() - _i)+" ms");
   }
   
   public static int collatzTerms(long i){
      int terms = 1;
      
      while(i!=1){
         if(i%2 == 0)
            i /= 2;
         else
            i = 3*i + 1;
         
         terms++;
      }
      
      return terms;
   }
}// Result: 837799
// Run time: 868 ms