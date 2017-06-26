package dev.utils;

import static java.lang.Math.*;
import java.math.*;
import java.util.*;

public class Algorithms{
   public static boolean isPrime(int num){
      if(num == 2)
         return true;
      else if(num%2 == 0 || num <= 1)
         return false;
      
      int root = (int)ceil(sqrt(num));
      for(int i = 3; i <= root; i+=2)
         if(num%i == 0)
            return false;
      
      return true;
   }
   public static boolean isPrime(long num){
      if(num == 2)
         return true;
      else if(num%2 == 0 || num <= 1)
         return false;
      
      long root = (long)ceil(sqrt(num));
      for(long i = 3; i <= root; i+=2)
         if(num%i == 0)
            return false;
      
      return true;
   }// isPrime
   
   public static int nextPrime(int num){
      num++;
      
      if(num <= 2)
         return 2;
      else if(num%2 == 0)
         num++;
      
      while(!isPrime(num))
         num += 2;
      
      return num;
   }
   public static long nextPrime(long num){
      num++;
      
      if(num <= 2)
         return 2;
      else if(num%2 == 0)
         num++;
      
      while(!isPrime(num))
         num += 2;
      
      return num;
   }// nextPrime
   
   public static int lastPrime(int num){
      num--;
      
      if(num <= 2)
         return 2;
      else if(num%2 == 0)
         num--;
      
      while(!isPrime(num))
         num -= 2;
      
      return num;
   }
   public static long lastPrime(long num){
      num--;
      
      if(num <= 2)
         return 2;
      else if(num%2 == 0)
         num--;
      
      while(!isPrime(num))
         num -= 2;
      
      return num;
   }// lastPrime
   
   public static int[]primeFactorizationOf(int num){
      if(isPrime(num) || num<=1)
         return new int[]{num};
      else{
         ArrayList<Integer> factors = new ArrayList<Integer>();
         int x = 2;
         
         while(x != num){
            if(num%x == 0){
               factors.add(x);
               num /= x;
            }
            else
               x = nextPrime(x);
         }
         factors.add(x);
         
         int size = factors.size();
         int[]factorization = new int[size];
         for(int i = 0; i<size; i++)
            factorization[i] = factors.get(i);
         
         return factorization;
      }
   }
   public static long[]primeFactorizationOf(long num){
      if(isPrime(num) || num<=1)
         return new long[]{num};
      else{
         ArrayList<Long> factors = new ArrayList<Long>();
         long x = 2;
         
         while(x != num){
            if(num%x == 0){
               factors.add(x);
               num /= x;
            }
            else
               x = nextPrime(x);
         }
         factors.add(x);
         
         int size = factors.size();
         long[]factorization = new long[size];
         for(int i = 0; i<size; i++)
            factorization[i] = factors.get(i);
         
         return factorization;
      }
   }// primeFactorizationOf
   
   public static int[]factorsOf(int num){
      if(num<0)
         return factorsOf(-num);
      else if(num == 1 || num == 0)
         return new int[]{num};
      else{
         ArrayList<Integer> factors = new ArrayList<Integer>();
         int limit = (int)Math.sqrt(num);
         
         for(int i=1; i<=limit; i++)
            if(num%i == 0){
               factors.add(i);
               factors.add(num/i);
            }
         if(limit*limit == num)
            factors.remove(factors.size()-1);
         
         int size = factors.size();
         int[]factorList = new int[size];
         for(int i=0; i<size; i++)
            factorList[i] = factors.get(i);
         Arrays.sort(factorList);
         
         return factorList;
      }
   }
   
   public static long[]factorsOf(long num){
      if(num<0)
         return factorsOf(-num);
      else if(num == 1 || num == 0)
         return new long[]{num};
      else{
         ArrayList<Long> factors = new ArrayList<Long>();
         long limit = (long)Math.sqrt(num);
         
         for(long i=1; i<=limit; i++)
            if(num%i == 0){
               factors.add(i);
               factors.add(num/i);
            }
         if(limit*limit == num)
            factors.remove(factors.size()-1);
         
         int size = factors.size();
         long[]factorList = new long[size];
         for(int i=0; i<size; i++)
            factorList[i] = factors.get(i);
         Arrays.sort(factorList);
         
         return factorList;
      }
   }// factorsOf
   
   public static boolean isLoosePalindrome(String str){
      char c;
      StringBuilder sb = new StringBuilder(str.toLowerCase().trim());
      for(int i = 0; i < sb.length(); i++){
         c = sb.charAt(i);
         if(!Character.isLetterOrDigit(c)){
            sb = sb.deleteCharAt(i);
            i--;
         }
      }
      
      return isPalindrome(sb.toString());
   }// isLoosePalindrome removes white space, punctuation, and letter case
   public static boolean isPalindrome(String str){
      char[]c = str.toCharArray();
      int halflength = c.length/2;
      
      for(int i = 0, j = c.length-1; i<halflength; i++, j--)
         if(c[i] != c[j])
            return false;
      return true;
   }// isPalindrome
   
   public static int leastCommonMultiple(int... nums){
      if(nums.length <= 0)
         return 0;
      
      int increment = nums[0];
      int lcm = increment;
      for(int i = 1; i<nums.length; i++){
         if(nums[i] == 0)
            continue;
         else while(lcm%nums[i] != 0)
            lcm += increment;
         increment = lcm;
      }
      
      return lcm;
   }
   public static int LCM(int... nums){
      return leastCommonMultiple(nums);
   }
   public static long leastCommonMultiple(long... nums){
      if(nums.length <= 0)
         return 0;
      
      long increment = nums[0];
      long lcm = increment;
      for(int i = 1; i<nums.length; i++){
         if(nums[i] == 0)
            continue;
         else while(lcm%nums[i] != 0)
            lcm += increment;
         increment = lcm;
      }
      
      return lcm;
   }
   public static long LCM(long... nums){
      return leastCommonMultiple(nums);
   }// leastCommonMultiple, with alias LCM
   
   public static int greatestCommonFactor(int... nums){
      if(nums.length <= 0)
         return 1;
      else if(nums.length == 1)
         return nums[0];
      
      int[]factorList = factorsOf(nums[0]);
      
      reverseArray(factorList);
   loop: for(int i: factorList){
         
         int counter = nums.length-1;
         for(int j=1; j<nums.length; j++){
            int[]factors = factorsOf(nums[j]);
            
            if(Arrays.binarySearch(factors, i)<0)
               continue loop;
            else if(--counter == 0)
               return i;
         }
      }
      
      return 1;
   }
   public static int GCF(int... nums){
      return greatestCommonFactor(nums);
   }
   public static long greatestCommonFactor(long... nums){
      if(nums.length <= 0)
         return 1;
      else if(nums.length == 1)
         return nums[0];
      
      long[]factorList = factorsOf(nums[0]);
      
      reverseArray(factorList);
   loop: for(long i: factorList){
         
         int counter = nums.length-1;
         for(int j=1; j<nums.length; j++){
            long[]factors = factorsOf(nums[j]);
            
            if(Arrays.binarySearch(factors, i)<0)
               continue loop;
            else if(--counter == 0)
               return i;
         }
      }
      
      return 1;
   }
   public static long GCF(long... nums){
      return greatestCommonFactor(nums);
   }// greatestCommonFactor, with alias GCF
   
   public static void reverseArray(Object[]ar){
      for(int i=0; i < ar.length/2; i++){
         Object temp = ar[i];
         ar[i] = ar[ar.length-i-1];
         ar[ar.length-i-1] = temp;
      }
   }
   public static void reverseArray(int[]ar){
      for(int i=0; i < ar.length/2; i++){
         int temp = ar[i];
         ar[i] = ar[ar.length-i-1];
         ar[ar.length-i-1] = temp;
      }
   }
   public static void reverseArray(long[]ar){
      for(int i=0; i < ar.length/2; i++){
         long temp = ar[i];
         ar[i] = ar[ar.length-i-1];
         ar[ar.length-i-1] = temp;
      }
   }
   public static void reverseArray(char[]ar){
      for(int i=0; i < ar.length/2; i++){
         char temp = ar[i];
         ar[i] = ar[ar.length-i-1];
         ar[ar.length-i-1] = temp;
      }
   }
   public static void reverseArray(short[]ar){
      for(int i=0; i < ar.length/2; i++){
         short temp = ar[i];
         ar[i] = ar[ar.length-i-1];
         ar[ar.length-i-1] = temp;
      }
   }
   public static void reverseArray(byte[]ar){
      for(int i=0; i < ar.length/2; i++){
         byte temp = ar[i];
         ar[i] = ar[ar.length-i-1];
         ar[ar.length-i-1] = temp;
      }
   }
   public static void reverseArray(double[]ar){
      for(int i=0; i < ar.length/2; i++){
         double temp = ar[i];
         ar[i] = ar[ar.length-i-1];
         ar[ar.length-i-1] = temp;
      }
   }
   public static void reverseArray(float[]ar){
      for(int i=0; i < ar.length/2; i++){
         float temp = ar[i];
         ar[i] = ar[ar.length-i-1];
         ar[ar.length-i-1] = temp;
      }
   } // reverseArray
   
   public static boolean isSquare(int num){
      int root = (int)Math.sqrt(num);
      return root*root == num;
   }
   public static boolean isSquare(long num){
      long root = (long)Math.sqrt(num);
      return root*root == num;
   }// isSquare
   
   public static BigInteger factorial(int num){
      if(num<=1)
         return new BigInteger(1+"");
      
      BigInteger result = new BigInteger(num+"");
      
      for(int i=2; i<num; i++)
         result = result.multiply(new BigInteger(i+""));
      return result;
   }
   public static BigInteger factorial(long num){
      if(num<=1)
         return new BigInteger(1+"");
      
      BigInteger result = new BigInteger(num+"");
      
      for(long i=2; i<num; i++)
         result = result.multiply(new BigInteger(i+""));
      return result;
   }// factorial
   
   public static BigInteger permutations(long subsetSize, long setSize){
      if(setSize<subsetSize)
         return new BigInteger("0");
      else if(setSize == subsetSize)
         return factorial(setSize);
      
      BigInteger result = new BigInteger("1");
      
      for(long i = setSize-subsetSize+1; i <= setSize; i++)
         result = result.multiply(new BigInteger(""+i));
      
      return result;
   }
   public static BigInteger P(long k, long n){
      return permutations(k, n);
   }// statistical permutations
   
   public static BigInteger combinations(long setSize, long subsetSize){
      if(setSize<subsetSize)
         return new BigInteger("0");
      else if(setSize == subsetSize)
         return new BigInteger("1");
      
      BigInteger result = permutations(subsetSize, setSize);
      
      for(long i=2; i<=subsetSize; i++)
         result = result.divide(new BigInteger(""+i));
      
      return result;
   }
   public static BigInteger nChooseK(long n, long k){
      return combinations(n, k);
   }// staticstical combinations
   
   public static boolean isAmicable(int num){
      int[]divisors = factorsOf(num);
      int divSum = 0;
      
      int limit = divisors.length-1;
      for(int i=0; i<limit; i++)
         divSum += divisors[i];
      
      if(divSum == num)
         return false; // number can't be amicable with itself
      
      divisors = factorsOf(divSum);
      
      limit = divisors.length-1;
      for(int i=0; i<limit; i++)
         num -= divisors[i];
      
      return(num == 0);
   }// isAmicable
   
   public static boolean isAbundant(int num){
      int[]divisors = factorsOf(num);
      int divSum = 0;
      
      int limit = divisors.length-1;
      for(int i=0; i<limit; i++)
         divSum += divisors[i];
      
      return divSum>num;
   }
   public static boolean isAbundant(long num){
      long[]divisors = factorsOf(num);
      long divSum = 0;
      
      int limit = divisors.length-1;
      for(int i=0; i<limit; i++)
         divSum += divisors[i];
      
      return divSum>num;
   }// isAbundant
   
   public static String getStringInput(){
      return new Scanner(System.in).next();
   }// getStringInput
   
   public static int[][]matrixMultiply(int[][]n, int[][]m){
      if(n[0].length != m.length)
         return null;
      
      for(int i=1; i<n.length; i++)
         if(n[i].length != n[0].length)
            return null;
      for(int i=1; i<m.length; i++)
         if(m[i].length != m[0].length)
            return null;
      // checks for valid input matrices, returns null if invalid
      
      int[][]result = new int[n.length][m[0].length];
      
      for(int i=0; i<result.length; i++)
         for(int j=0; j<result[i].length; j++){
            result[i][j] = 0;
            
            for(int k=0; k<m.length; k++)
               result[i][j] += n[i][k]*m[k][j];
         }
      
      return result;
   }
   public static double[][]matrixMultiply(double[][]n, double[][]m){
      if(n[0].length != m.length)
         return null;
      
      for(int i=1; i<n.length; i++)
         if(n[i].length != n[0].length)
            return null;
      for(int i=1; i<m.length; i++)
         if(m[i].length != m[0].length)
            return null;
      // checks for valid input matrices, returns null if invalid
      
      double[][]result = new double[n.length][m[0].length];
      
      for(int i=0; i<result.length; i++)
         for(int j=0; j<result[i].length; j++){
            result[i][j] = 0.0;
            
            for(int k=0; k<m.length; k++)
               result[i][j] += n[i][k]*m[k][j];
         }
      
      return result;
   } // matrixMultiply
   
   public static void main(String[]args){
      long a = System.currentTimeMillis();
      
      //System.out.print("I: ");
     // String s = getStringInput();
      
      System.out.println("O: "+(754974703D/393216000D));
      
      System.out.println("Run time: "+(System.currentTimeMillis() - a)+" ms");
   }
}