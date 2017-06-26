package euler._2002;

import static dev.utils.Algorithms.*;
import java.math.BigDecimal;

public class Problem0026{
   public static void main(String[]args){
      long _i = System.currentTimeMillis();
      
      int result = 0;
      int max = 0;
      
      for(int divisor=1; divisor<1000; divisor++){
         String num = BigDecimal.ONE.divide(new BigDecimal(divisor), 5000, BigDecimal.ROUND_HALF_UP).toString();
         int seqSize = getSeqSize(num);
         
         if(seqSize > max){
            max = seqSize;
            result = divisor;
         }
      }
      
      System.out.println("Result: "+result);
      System.out.println("Run time: "+(System.currentTimeMillis() - _i)+" ms");
   }
   
   public static int getSeqSize(String s){
      StringBuilder sb = new StringBuilder();
      
      int i = s.length()-3;
      for(int j=0; j<7; j++)
         sb.append(s.charAt(i--));
      
      boolean b = false;
      do{
         sb.append(s.charAt(i--));
         
         int halfLength = sb.length()/2;
         b = sb.substring(0, halfLength).equals(sb.substring(halfLength));
         
         if(b)
            return halfLength;
         else if(i==0)
            break;
      }while(!b);
      
      return 0;
   }
}// Result: 983
// Run time: 2000 ms