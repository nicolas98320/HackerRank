import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String binString = Integer.toBinaryString(n);
        
        int sum = 0;
        int max = 0;
        
        for (int i = 0; i < binString.length(); i++){
            char c = binString.charAt(i);
            if (c == '1') {
                sum++;
                if(max < sum) {
                    max = sum;
                }
            } else {
                sum = 0;
            }
        }
        System.out.println(max);
    }
}