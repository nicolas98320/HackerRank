import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        
        for(int i = 0; i < T; i++)
        {
            int N = in.nextInt();
            int K = in.nextInt();
            int sum = 0;
            
            for(int j = 0; j < N; j++)
            {
                int tmp = in.nextInt();
                if(tmp <= 0)
                    sum++;
            }
            if(sum >= K)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}