import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        
        for(int i = 0; i < T; i++) {

            int n = in.nextInt();
            int count = 0;
                        
            if(n == 1)
                System.out.println("Not prime");
            
            else {
                
                for(int j = 2; j * j <= n; j++) {
                    if(n % j == 0)
                        count++;
                }
                
                if(count == 0)
                    System.out.println("Prime");
                else
                    System.out.println("Not prime");
            }
        }
 
    }
}