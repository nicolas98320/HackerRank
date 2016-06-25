import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
        int po = 0;
        int ne = 0;
        int ze = 0;
        
        for(int i = 0; i < n; i++){
            
            int tmp = in.nextInt();
            
            if (tmp > 0)
                po++;
            else if (tmp < 0)
                ne++;
            else
                ze++;
        }

        System.out.println((float)po/n);
        System.out.println((float)ne/n);
        System.out.println((float)ze/n);
        
        in.close();
        
    }
}