import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        
        for(int i = 0; i < T; i++){
            
            int N = in.nextInt();
            int r = N;
            int count = 0;
            
            while(r > 0){
                if(r % 10 != 0 && N % (r % 10) == 0) count++;
                r = r / 10;
            }
            
            System.out.println(count);
        }
    }
}