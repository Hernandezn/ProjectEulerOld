package euler._2001;

public class Problem0001{
   public static void main(String[]args){
      long a = System.currentTimeMillis();
      
      int sum = 0;
      for(int i = 0; i < 1000; i++)
         if(i%3 == 0 || i%5 == 0)
            sum+=i;
      
      System.out.println("Result: "+sum);
      System.out.println("Run time: "+(System.currentTimeMillis() - a)+" ms");
   }
}// Result: 233168
// Run time: 1 ms