package euler._2001;

public class Problem0002{
   public static void main(String[]args){
      long a = System.currentTimeMillis();
      
      int z;
      int sum = 2;
      for(int x=1, y=2; y<4_000_000; ){
         z = y;
         y += x;
         x = z;
         
         if(y%2 == 0)
            sum+=y;
      }
      
      System.out.println("Result: "+sum);
      System.out.println("Run time: "+(System.currentTimeMillis() - a)+" ms");
   }
}// Result: 4613732
// Run time: 1 ms