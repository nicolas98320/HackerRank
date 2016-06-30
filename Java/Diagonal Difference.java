import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int s1 = 0;
        int s2 = 0;

        for(int i = 0, j = n - 1; i < n; i++, j--){ 
            
            String[] inputLine = scan.nextLine().split(" ");

            s1 = s1 + Integer.parseInt(inputLine[i]);
            s2 = s2 + Integer.parseInt(inputLine[j]);
        }
        
        System.out.println(Math.abs(s1 - s2));
    }
}