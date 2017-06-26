package euler._2002;

import static dev.utils.Algorithms.*;
import static dev.utils.FileOps.*;
import java.util.Arrays;
import java.util.ArrayList;

public class Problem0022{ // started the FileOps class
   public static void main(String[]args){
      long _i = System.currentTimeMillis();
      
      String[]nameList = contentsOf("Problem0022_names.txt").split("[,\"]");
      Arrays.sort(nameList);
      
      int start;
      for(start=0; nameList[start].equals(""); start++);
      
      int count = 0;
      for(int i=start--; i<nameList.length; i++)
         count += nameScore(nameList[i])*(i-start);
      
      System.out.println("Result: "+count);
      System.out.println("Run time: "+(System.currentTimeMillis() - _i)+" ms");
   }
   
   public static int nameScore(String str){
      char[]ar = str.toCharArray();
      
      int score = 0;
      int zero = 'A'-1;
      for(int i=0; i<ar.length; i++)
         score += ar[i]-zero;
      
      return score;
   }
}// Result: 871198282
// Run time: 75 ms