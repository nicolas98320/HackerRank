import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        for(int i = 1; i <= n; i++) {
            String s = scan.nextLine();
            split(s.toCharArray());
        }
    }
    
    public static void split(char [] array) {
        
        int length = array.length;
        
        for (int i = 0; i < length; i += 2) {
            System.out.print(array[i]);
        }
        System.out.print(" ");
        for (int i = 1; i < length; i += 2) {
            System.out.print(array[i]);
        }
        System.out.println();
    }
}