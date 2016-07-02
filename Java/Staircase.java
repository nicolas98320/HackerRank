import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char [] arr = new char [n];
        Arrays.fill(arr, ' ');
        
        for (int i = 1; i <= n; i++){
            arr[n-i] = '#';
            System.out.println(arr);
        }
    }
}