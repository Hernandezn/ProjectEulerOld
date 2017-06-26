package euler._2002;

import static dev.utils.Algorithms.*;

public class Problem0017{
   public static void main(String[]args){
      long _i = System.currentTimeMillis();
      
      int result = 0;
      
      for(int i=1; i<=1000; i++)
         result += charsInNumber(i);
      
      System.out.println("Result: "+result);
      System.out.println("Run time: "+(System.currentTimeMillis() - _i)+" ms");
   }
   
   public static int charsInNumber(int num){
      int count = 0;
      
      if(num<10){
         switch(num){
            case 0:
               return 0;
            case 1:
            case 2:
            case 6:
               return 3;
            case 4:
            case 5:
            case 9:
               return 4;
            case 3:
            case 7:
            case 8:
               return 5;
            default:
               return 0;
         }
      }
      else if(num<100){
         switch(num){
            case 10:
               return 3;
            case 11:
            case 12:
               return 6;
            case 15:
            case 16:
               return 7;
            case 13:
            case 14:
            case 18:
            case 19:
               return 8;
            case 17:
               return 9;
         }
         count += charsInNumber(num%10);
         int tens = num/10;
         
         switch(tens){
            case 4:
            case 5:
            case 6:
               return(count+5);
            case 2:
            case 3:
            case 8:
            case 9:
               return(count+6);
            case 7:
               return(count+7);
         }
      }
      else if(num<1000){
         count += 7 + charsInNumber(num/100);
         
         int mod = num%100;
         if(mod > 0)
            count += 3 + charsInNumber(mod); // "and" after every hundred with a following digit
      }
      else
         count += 8 + charsInNumber(num/1000) + charsInNumber(num%1000);
      
      return count;
   }
}// Result: 21124
// Run time: 1 ms