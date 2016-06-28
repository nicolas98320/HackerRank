import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        for(int i = 0; i < T; i++){
            
            int N = in.nextInt();
            int K = in.nextInt();
            int max = 0;

            for(int z = 1; z < n; z++){

                for(int j = z + 1; j <= n; j++){

                    int h = z & j;

                    if(h < k && c < h){
                        
                        max = h;
                    }
                }
            }
            System.out.println(max);
        }
    }
}