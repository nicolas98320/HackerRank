  import java.io.*;
  import java.util.*;

  public class Solution {
  
      public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int res = fact(n);
          System.out.println(res);
      }
      
      static int fact(int n)
      {
          int result;
          if(n==0 || n==1)
              return 1;

          result = fact(n-1) * n;
          return result;
      } 
  }