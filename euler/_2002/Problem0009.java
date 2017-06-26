package euler._2002;

import static dev.utils.Algorithms.*;

public class Problem0009{
   public static void main(String[]args){
      long _i = System.currentTimeMillis();
      
      int result = 0;
   loop:for(int a=1; a<1000; a++){
         for(int b=1; b<1000; b++){
            int cSquared = a*a + b*b;
            if(isSquare(cSquared)){
               int c = (int)Math.sqrt(cSquared);
               if(a+b+c == 1000){
                  result = a*b*c;
                  break loop;
               }
            }
         }
      }
      
      System.out.println("Result: "+result);
      System.out.println("Run time: "+(System.currentTimeMillis() - _i)+" ms");
   }
}// Result: 31875000
// Run time: 14 ms